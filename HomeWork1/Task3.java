/*Реализовать простой калькулятор (+,-,=,*), только с целыми числами. */

package HomeWork1;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        try(Scanner scan = new Scanner(System.in)) {

        System.out.print("Введите первое число: ");
        int num1 = scan.nextInt();

        System.out.print("Введите второе число: ");
        int num2 = scan.nextInt();

        System.out.print("Введите операцию (+,-,*,/): ");
        char operation = scan.next().charAt(0);
        
        int result = 0;
        switch (operation) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 == 0) {
                    System.out.println("Деление на 0 недопустимо");
                    return;
                } else {
                    result = num1 / num2;
                }
                break;
            default:
                System.out.println("Ошибка: неверная операция");
                return;
        }
    
        System.out.println("Результат: " + result);
    }
}
}

