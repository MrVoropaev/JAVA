package Model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import Controller.iGetModel;

public class Model implements iGetModel {
    // Хранилище студентов
    private Map<Long, Student> students;

    public Model() {
        students = new HashMap<>();
    }

    @Override
    public void addStudent(Student student) {
        students.put(student.getStudentID(), student);
    }

    @Override
    public boolean deleteStudent(Long id) {
        students.remove(id);
        return false;
    }

    @Override
    public List<Student> getAllStudents() {
        return List.copyOf(students.values());
    }


}
