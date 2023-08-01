package ErrorLesson2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        float number = getFloatFromUser();
        System.out.println("Введенное число: " + number);
        
        try {
            int[] intArray = {1, 2, 3, 4, 5};
            int d = 0;
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
        }
    }
    
    public static float getFloatFromUser() {
        Scanner scanner = new Scanner(System.in);
        float number;
        
        while (true) {
            System.out.print("Введите дробное число: ");
            if (scanner.hasNextFloat()) {
                number = scanner.nextFloat();
                break;
            } else {
                System.out.println("Ошибка! Введите дробное число.");
                scanner.nextLine(); // Очистка буфера ввода
            }
        }
        
        return number;
    }
}


