package View;

import java.util.List;
import java.util.Scanner;

import Controller.iGetView;
import Model.Student;

public class ViewEng implements iGetView {
    public void printAllStudent(List<Student> students)
    {
        System.out.println("-----Printing the list of students-----");
        for(Student person :students)
        {
            System.out.println(person);
        }
        System.out.println("-----End of List-----");
    }

    public String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }

    @Override
    public void showMessage(String message) {
        System.out.println(message);

    }

    @Override
    public void showAllStudents(List<Student> list) {
        for (Student student : list) {
            System.out.println(student);
        }
    }
}
