import socket
import threading
import time

# Функция для приема и отображения сообщений от сервера
def receive():
    while True:
        try:
            message = client.recv(1024).decode()
            print(message)
        except:
            print("Ошибка")
            client.close()
            break

# Функция для отправки сообщений на сервер
def send():
    while True:
        message = input()
        if message == "/exit":
            client.send(message.encode())
            client.close()
            break
        else:
            client.send(message.encode())

# Запрашиваем IP адрес сервера
server = input("Введите IP: ")

# Подключаемся к серверу
client = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
client.connect((server, 55555))

# Запускаем потоки для приема и отправки сообщений
receive_thread = threading.Thread(target=receive)
receive_thread.start()

send_thread = threading.Thread(target=send)
send_thread.start()
