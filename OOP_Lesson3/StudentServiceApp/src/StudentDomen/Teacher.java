package StudentDomen;

public class Teacher implements Ageable {
    
    private String name;
    private int age;

    public Teacher(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }
    
    // Реализация метода интерфейса Ageable
    // Может быть пустым, если у класса Teacher нет дополнительной логики, 
    // связанной с интерфейсом Ageable
}
