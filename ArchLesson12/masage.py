import tkinter as tk
from user import User

class MessengerSystem:
    def __init__(self):
        self.users = []

    def registerUser(self, username, password):
        # Проверяем, есть ли уже пользователь с таким именем
        for user in self.users:
            if user['username'] == username:
                print("Пользователь с таким именем уже существует")
                return False

        # Регистрируем нового пользователя
        self.users.append({'username': username, 'password': password})
        print("Регистрация успешна")
        return True

    def loginUser(self, username, password):
        # Проверяем, существует ли пользователь с указанными данными
        for user in self.users:
            if user['username'] == username and user['password'] == password:
                print("Вход выполнен успешно")
                return True

        print("Неверное имя пользователя или пароль")
        return False

    def sendMessage(self, sender, recipient, message):
        # Отправляем сообщение
        print(f"Сообщение от {sender} к {recipient}: {message}")


class MessengerGUI:
    def __init__(self, messenger):
        self.messenger = messenger

        self.root = tk.Tk()
        self.root.title("Messenger")

        self.username_label = tk.Label(self.root, text="Username:")
        self.username_label.pack()

        self.username_entry = tk.Entry(self.root)
        self.username_entry.pack()

        self.password_label = tk.Label(self.root, text="Password:")
        self.password_label.pack()

        self.password_entry = tk.Entry(self.root, show="*")
        self.password_entry.pack()

        login_button = tk.Button(self.root, text="Login", command=self.loginUser)
        login_button.pack()

        register_button = tk.Button(self.root, text="Register", command=self.registerUser)
        register_button.pack()

    def start(self):
        self.root.mainloop()

    def loginUser(self):
        username = self.username_entry.get()
        password = self.password_entry.get()

        user = self.messenger.loginUser(username, password)

        if user:
            self.openMessenger(user)
        else:
            pass

    def registerUser(self):
        username = self.username_entry.get()
        password = self.password_entry.get()
        
        user = User(username, password)
        
        result = self.messenger.registerUser(user)
        
        if result:
            print("Пользователь успешно зарегистрирован")
        else:
            print("Пользователь с таким именем уже существует")

    def openMessenger(self, user):
        self.root.destroy()
        messenger_window = tk.Tk()
        messenger_window.title("Messenger - " + user.username)

        contacts_label = tk.Label(messenger_window, text="Contacts:")
        contacts_label.pack()

        self.contacts_listbox = tk.Listbox(messenger_window)
        self.contacts_listbox.pack()

        for contact in user.contacts:
            self.contacts_listbox.insert(tk.END, contact.name)

        message_label = tk.Label(messenger_window, text="Message:")
        message_label.pack()

        self.message_entry = tk.Entry(messenger_window)
        self.message_entry.pack()

        send_button = tk.Button(messenger_window, text="Send", command=self.sendMessage)
        send_button.pack()

    def sendMessage(self):
        selected_contact = self.contacts_listbox.get(self.contacts_listbox.curselection())
        message_text = self.message_entry.get()

        contact = None
        for c in self.messenger.currentUser.contacts:
            if c.name == selected_contact:
                contact = c
                break

        self.messenger.sendMessage(self.messenger.currentUser, contact.id, message_text)

messenger = MessengerSystem()
gui = MessengerGUI(messenger)
gui.start()
