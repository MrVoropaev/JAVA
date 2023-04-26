package Controllers;

import StudentDomen.Teacher;

public interface TeacherController {

    void create(String firstName, String secondName, int age);

    void edit(Teacher teacher, String firstName, String secondName, int age);

}