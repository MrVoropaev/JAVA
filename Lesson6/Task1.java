/* на java через hash collection: public class Task2 { 
 
    // Продумайте структуру класса Бульдожка. Какие поля и методы будут актуальны для приложения, которое является 
    // а) информационной системой ухода за ней 
    // б) архивом выставки бульдожков 
    // в) информационной системой Театра бульдожек имени Дарахвелидзе 
    public static void main(String[] args) { 
 
    } 
}*/


package Lesson6;

public class Task1 {
    public static void main(String[] args) {
    class Bulldog {
        private String name;
        private int age;
        private String color;
        private double weight;
        private String ownerName;
     
        public Bulldog(String name, int age, String color, double weight, String ownerName) {
            this.name = name;
            this.age = age;
            this.color = color;
            this.weight = weight;
            this.ownerName = ownerName;
        }
     
        // для информационной системы ухода за бульдожкой
        public void feed(Bulldog bulldog) {
            // покормить бульдожку
        }
     
        public void walk(Bulldog bulldog) {
            // выгулять бульдожку
        }
     
        public void groom(Bulldog bulldog) {
            // погладить, почесать и т.д.
        }
     
        // для архива выставки бульдожков
        public String getName() {
            return name;
        }
     
        public int getAge() {
            return age;
        }
     
        public String getColor() {
            return color;
        }
     
        public double getWeight() {
            return weight;
        }
     
        public String getOwnerName() {
            return ownerName;
        }
     
        // для информационной системы Театра бульдожек имени Дарахвелидзе
        public void play(Bulldog bulldog) {
            // заняться с бульдожкой игрой
        }
     
        public void perform(Bulldog bulldog) {
            // подготовить бульдожку к выступлению
        }
     
        public void train(Bulldog bulldog) {
            // производить тренировки и дрессировку бульдожек
        }
    }
}
}
