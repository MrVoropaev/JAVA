/*Вводится массив (сначала количество элементов, потом сами элементы). Найдите сумму его элементов с чётными индексами и выведите её. А потом выведите числа, которые суммировались. */


package Lesson1;

import java.util.Scanner;
import java.util.ArrayList;

public class Task6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt(); // Количество элементов в массиве
        int[] array = new int[n]; // Создание массива
        
        // Заполнение массива
        for (int i = 0; i < n; i++) {
            array[i] = scan.nextInt();
        }
        
        int sum = 0; // Начальное значение суммы элементов с четными индексами
        ArrayList<Integer> indices = new ArrayList<>(); // Индексы элементов, которые суммируются
        
        for (int i = 0; i < n; i += 2) {
            sum += array[i]; // Суммируем элементы с четными индексами
            indices.add(i); // Добавляем индекс в список
        }
        
        // Выводим сумму и числа, которые суммируются
        System.out.println(sum);
        for (int index : indices) {
            System.out.print(array[index] + " ");

        scan.close();
        }
    }
}

