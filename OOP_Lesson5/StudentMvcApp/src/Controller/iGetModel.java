package Controller;

import java.util.List;
import Model.Student;

public interface iGetModel {
    public void addStudent(Student s);
    public boolean deleteStudent(Long id);
    public List<Student> getAllStudents();
}
