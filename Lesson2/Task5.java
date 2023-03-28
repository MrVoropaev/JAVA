/*Вводится строка, определите, каких символов в ней больше: цифр или букв? Напоминаю, что знаки препинания и пробелы, например. не являются ни тем ни другим. Если в строчке больше цифр, то выведите на экран слово "Digit", иначе выведите "Letter". Если же их равное количество, то выведите слово "Equal".

Sample Input:

34Hi56
Sample Output:

Digit
 */


package Lesson2;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        int digitCount = 0;
        int letterCount = 0;

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (Character.isDigit(c)) {
                digitCount++;
            } else if (Character.isLetter(c)) {
                letterCount++;
            }
        }

        if (digitCount > letterCount) {
            System.out.println("Digit");
        } else if (letterCount > digitCount) {
            System.out.println("Letter");
        } else {
            System.out.println("Equal");
        }

        scan.close();
    }
}

