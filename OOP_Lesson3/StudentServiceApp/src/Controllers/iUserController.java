package Controllers;

import StudentDomen.User;

public interface iUserController<T extends User> {
    void create(String firstName, String secondName, int age);
}

interface iUserControllerNew<T extends User, Teacher> {
    void edit(Teacher teacher, String firstName, String secondName, int age);
}
