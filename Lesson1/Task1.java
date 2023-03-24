
/*Улитка ползёт по вертикальному шесту высотой h метров, поднимаясь за день на a метров, а за ночь спускаясь на b метров. На какой день улитка доползёт до вершины шеста?

Программа получает на вход натуральные числа h, a, b. Гарантируется, что a>b.

Программа должна вывести одно натуральное число.*/


package Lesson1;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int h = scan.nextInt();
        int a = scan.nextInt();
        int b = scan.nextInt();

        int days = (h - b - 1) / (a - b) + 1;

        System.out.println(days);

        scan.close();

    }
}
