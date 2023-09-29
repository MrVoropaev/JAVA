import tkinter as tk

class MessengerSystem:
    def __init__(self):
        self.currentUser = None

    def loginUser(self, username, password):
        pass

    def registerUser(self, username, password):
        pass

    def sendMessage(self, sender, recipient_id, message):
        pass

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

        user = self.messenger.registerUser(username, password)

        if user:
            self.openMessenger(user)
        else:
            pass

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
gui.root.mainloop()
