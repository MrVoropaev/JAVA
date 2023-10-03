class User:
    def __init__(self, username, password):
        self.username = username
        self.password = password

class Message:
    def __init__(self, sender, content):
        self.sender = sender
        self.content = content

def registerUser(user):
    pass

def openMessenger():
    pass

def loginUser(user):
    pass

def sendMessage(message):
    pass

def openGUI():
    pass

def test_sendMessage_with_valid_message():
    user = User("testuser", "password123")
    registerUser(user)
    openMessenger()
    loginUser(user)
    message = Message("testuser", "Hello, world!")
    result = sendMessage(message)
    assert result == "Message sent successfully"

def test_sendMessage_with_invalid_message():
    user = User("testuser", "password123")
    registerUser(user)
    openMessenger()
    loginUser(user)
    message = Message("testuser", "")
    result = sendMessage(message)
    assert result == "Invalid message"

def test_openMessenger():
    result = openMessenger()
    assert result == "Messenger window opened"

def test_openGUI():
    result = openGUI()
    assert result == "GUI opened"

if __name__ == "__main__":
    test_sendMessage_with_valid_message()
    test_sendMessage_with_invalid_message()
    test_openMessenger()
    test_openGUI()

class MessengerSystem:
    def __init__(self):
        pass

class MessengerGUI:
    def __init__(self, messenger):
        pass

messenger = MessengerSystem()
gui = MessengerGUI(messenger)
gui.root.mainloop()
