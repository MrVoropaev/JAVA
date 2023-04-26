package StudentService;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import StudentDomen.Teacher;
import StudentDomen.UserComparator;

public class TeacherService implements iUserService<Teacher> {
    private int count;
    private List<Teacher> teachers;
    public TeacherService() {
        this.teachers = new ArrayList<Teacher>();
    }
    @Override
    public void create(String firstName, String secondName, int age) {
        StudentDomen.Teacher per = new StudentDomen.Teacher(firstName, age);
        count++;
        teachers.add(per);
    }

    @Override
    public List<Teacher> getAll()
    {
        return teachers;
    }

    public List<Teacher> getSortedByFIOTeacher()
    {
        List<Teacher> tchrs = new ArrayList<>(teachers);
        tchrs.sort((Comparator<? super Teacher>) new ArrayList<Teacher>()); // явно указываем тип T
        return tchrs;
    }

    
    public void edit(Teacher teacher, String firstName, String secondName, int age) {
    }
}
