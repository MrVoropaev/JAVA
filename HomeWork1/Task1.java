/*1.Создайте массив, в котором будут храниться кубы чисел от 1 до 1000. Затем вводятся 2 числа из этого диапазона. Используя данные из массива найдите их кубы.
Sample Input:
8
11
Sample Output:
512
1331 */

package HomeWork1;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        int[] cubes = new int[1000];
        for (int i = 1; i <= 1000; i++) {
            cubes[i - 1] = i * i * i;
        }

        Scanner scan = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int firstNum = scan.nextInt();
        System.out.print("Введите второе число: ");
        int secondNum = scan.nextInt();

        System.out.println("Куб числа " + firstNum + " равен " + cubes[firstNum - 1]);
        System.out.println("Куб числа " + secondNum + " равен " + cubes[secondNum - 1]);

        scan.close();
    }
}
