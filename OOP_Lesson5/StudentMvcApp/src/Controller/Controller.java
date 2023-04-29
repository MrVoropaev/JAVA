package Controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.util.Scanner.*;


import Model.Student;
import Model.Model;
import View.View;
import View.ViewEng;

public class Controller {

    private List<Student> students; 
    private iGetView view;
    private iGetModel model;

    public Controller(iGetView view, iGetModel model) {
        view = new ViewEng();
        model = new Model();
        this.view = view;
        this.model = model;
        this.students = new ArrayList<Student>();

    } 
    
    public void getAllStudent()
    {
        students = model.getAllStudents();
    }

    public boolean testData()
    {
        if(students.size()>0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public void updateView()
    {
        //MVP
        getAllStudent();
        if(testData())
        {
            view.printAllStudent(students);
        }
        else{
            System.out.println("Список студентов пуст!");
        }
        
        //MVC
        //view.printAllStudent(model.getAllStudent());
    }
    public class MyClass {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
        }
    public void run() {
        Commands com = Commands.NONE;
        boolean getNewIteration = true;
        while (getNewIteration) {
            String command = view.prompt("Введите команду:");
            com = Commands.valueOf(command.toUpperCase());
            switch (com) {
                case EXIT:
                    getNewIteration = false;
                    System.out.println("Выход из программы!");
                    break;
                case LIST:
                    view.showAllStudents(model.getAllStudents());
                    break;
                case DELETE:
                    view.showMessage("Enter student ID to delete:");
                    Scanner scanner = new Scanner(System.in);
                    long idToDelete = scanner.nextLong();
                    boolean deleted = model.deleteStudent(idToDelete);
                    if (deleted) {
                        view.showMessage("Student with ID " + idToDelete + " deleted successfully");
                    } else {
                        view.showMessage("Student with ID " + idToDelete + " not found");
                    }
                    break;
                default:
                    view.showMessage("Unknown command. Please enter a valid command.");
                    break;
            }
        }
    }
}
    public void run() {
        Commands com = Commands.NONE;
        boolean getNewIteration = true;
        while (getNewIteration) {
            String command = view.prompt("Введите команду:");
            com = Commands.valueOf(command.toUpperCase());
            switch (com) {
                case EXIT:
                    getNewIteration = false;
                    System.out.println("Выход из программы!");
                    break;
                case LIST:
                    view.showAllStudents(model.getAllStudents());
                    break;
                case DELETE:
                    view.showMessage("Enter student ID to delete:");
                    Scanner scanner = new Scanner(System.in);
                    long idToDelete = scanner.nextLong();
                    boolean deleted = model.deleteStudent(idToDelete);
                    if (deleted) {
                        view.showMessage("Student with ID " + idToDelete + " deleted successfully");
                    } else {
                        view.showMessage("Student with ID " + idToDelete + " not found");
                    }
                    break;
                default:
                    view.showMessage("Unknown command. Please enter a valid command.");
                    break;
            }
        }
    }
    }


