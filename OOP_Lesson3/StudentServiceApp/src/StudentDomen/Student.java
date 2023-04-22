package StudentDomen;

public class Student extends User implements Comparable<Student>{
    private long studentID;
    public Student(String firstName, String secondName, int age, long studentID) {
        super(firstName, secondName, age);
        this.studentID = studentID;
    }


    public long getStudentID() {
        return studentID;
    }

    public void setStudentID(long studentID) {
        this.studentID = studentID;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentID=" + studentID + "\\"
                +", firstName=" +super.getFirstName()
                +", secondName=" +super.getSecondName()
                +", age=" +super.getAge() +
                '}';
    }


    @Override
    public int compareTo(Student o) {

        System.out.println(super.getFirstName()+" - "+o.getFirstName());
        if(super.getAge()==o.getAge())
        {
            return 0;
        }
        if(super.getAge()<o.getAge())
        {
            return -1;
        }
        return 1;
    }
}