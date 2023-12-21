import socket
import threading
import time

# Потокобезопасные структуры данных для хранения списка клиентов и их никнеймов
clients_lock = threading.Lock()
clients = []
nicknames_lock = threading.Lock()
nicknames = []

# Функция для обработки подключения нового клиента
def handle_client(conn, addr):
    print(f"Новое соединение {addr}")

    # Запрашиваем у клиента его никнейм
    conn.send("NICK".encode())
    nickname = conn.recv(1024).decode()

    # Проверяем длину никнейма
    if len(nickname) > 16:
        conn.send("Никнейм слишком длинный!".encode())
        conn.close()
        return

    # Проверяем, что никнейм не занят
    with nicknames_lock:
        if nickname in nicknames:
            conn.send("Отлично".encode())
            conn.close()
            return
        nicknames.append(nickname)

    # Отправляем приветственное сообщение клиенту
    conn.send("Законектились!".encode())

    # Отправляем сообщение о новом подключении всем клиентам
    with clients_lock:
        for client in clients:
            client[0].send(f"{nickname} добавлен в чат!".encode())

    # Обрабатываем сообщения от клиента
    while True:
        try:
            message = conn.recv(1024).decode()
            if message == "/exit":
                break
            elif message.startswith("/pm"):
                recipient, message = message.split(" ", 1)
                with clients_lock:
                    for client in clients:
                        if client[1] == recipient:
                            client[0].send(f"[PM] {nickname}: {message}".encode())
                            break
            elif message == "/users":
                with nicknames_lock:
                    users = ", ".join(nicknames)
                conn.send(f"Подключились: {users}".encode())
            else:
                with clients_lock:
                    for client in clients:
                        client[0].send(f"{nickname}: {message}".encode())
        except:
            print(f"Ошибка {addr}")
            break

    # Удаляем клиента из списка и закрываем соединение
    with clients_lock:
        index = -1
        for i, client in enumerate(clients):
            if client[0] == conn:
                index = i
                break
        if index >= 0:
            del clients[index]
    with nicknames_lock:
        nicknames.remove(nickname)
    conn.close()

    # Отправляем сообщение об отключении клиента всем остальным клиентам
    with clients_lock:
        for client in clients:
            client[0].send(f"{nickname} Покинул нас!".encode())

# Функция для прослушивания новых подключений
def start():
    server = "127.0.0.1"  # IP адрес сервера
    port = 55555

    # Создаем сокет и начинаем прослушивать подключения
    s = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
    s.bind((server, port))
    s.listen()

    print(f"Сервер в космосе {server}:{port}")

    while True:
        conn, addr = s.accept()
        thread = threading.Thread(target=handle_client, args=(conn, addr))
        thread.start()

# Запускаем сервер
start()
