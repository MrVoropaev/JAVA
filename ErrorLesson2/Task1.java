/*Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float), и возвращает введенное значение. Ввод текста вместо числа не должно приводить к падению приложения, вместо этого, необходимо повторно запросить у пользователя ввод данных. */

package ErrorLesson2;

import java.util.Scanner;


public class Task1 {
    public static void main(String[] args) {
        float number = getFloatFromUser();
        System.out.println("Введенное число: " + number);
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
                scanner.nextLine(); 
            }
        }
        
        return number;
    }
}
