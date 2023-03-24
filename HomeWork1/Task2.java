/*Вводится число n, затем n чисел целых, по одному на каждой строке. Затем вводится число, на которое нужно умножить все введённые выше числа. Выведите на экран результат умножения построчно.
Sample Input:
4
1
2
3
5
2
Sample Output:
2
4
6
10 */


package HomeWork1;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите количество чисел: ");
        int n = scan.nextInt();
        int[] nums = new int[n];

        System.out.println("Введите числа по одному на строку:");
        for (int i = 0; i < n; i++) {
            nums[i] = scan.nextInt();
        }

        System.out.print("Введите число, на которое нужно умножить: ");
        int multiple = scan.nextInt();

        System.out.println("Результат:");
        for (int num : nums) {
            System.out.println(num * multiple);
        }
        scan.close();
    }
}    