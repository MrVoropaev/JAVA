/*Напишите программу, которая выводит в столбик целые числа от a до b (a >= b) с шагом c. Границы включаются.

Входные данные
Заданы три целых числа а, b, с, где a > b

Выходные данные
Выведите единственное число - ответ на задачу. */

package Lesson1;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int a = scan.nextInt(); 
        int b = scan.nextInt(); 
        int c = scan.nextInt(); 
        
        for (int i = a; i >= b; i -= c) {
            System.out.println(i); 

        scan.close();
        }
    }
}
