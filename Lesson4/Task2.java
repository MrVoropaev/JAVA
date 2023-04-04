/*Напишите программу, которая реализует структуру данных стек, используя список.

Условие задачи таково: мальчик Петя использует свой стул в качестве многоместной вешалки. А именно: накидывает на него вещи. Иногда он забирает верхнюю вещь. Нужно вывести на экран порядок его вещей от спинку стула.

Сначала водится число n - количество запросов в вашей программе. Каждый из запросов будет иметь один следующих видов:

push <одежда> - Петя вешает на стул элемент одежды
pop - снимает одежду со стула. При этом на экран выводится запись вида "Петя взял <одежда>"
После выполнения всех запросов выведите оставшиеся на стуле вещи. Гарантируется, что название вещи состоит из одного слова.

Sample Input:

4
push Футболка
push Рубашка
pop
push Джинсы
Sample Output:

Петя взял Рубашка
Футболка Джинсы */



package Lesson4;

import java.util.LinkedList;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // количество запросов
        sc.nextLine(); // очистить буфер после чтения числа
        LinkedList<String> stack = new LinkedList<>(); // создаем пустой стек

        for (int i = 0; i < n; i++) {
            String[] query = sc.nextLine().split(" "); // читаем запрос и разбиваем его на слова
            if (query[0].equals("push")) {
                stack.push(query[1]); // добавляем элемент в стек
            } else if (query[0].equals("pop")) {
                String item = stack.pop(); // достаем верхний элемент из стека
                System.out.println("Петя взял " + item); // выводим на экран
            }
        }

        // выводим оставшиеся элементы в стеке в порядке от спинки стула
        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }
        sc.close();  
    }
}
/*package Seminar_4;
import java.util.*;
public class task_02 {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int n = scanner.nextInt();
        List<String> playlist = new ArrayList<>();
        for (int i = 0; i < n; i++) { 
            String str = scanner.next();
            if (str.equals("push")) {
                String str1 = scanner.next();
                playlist.add(str1);
            } else if (str.equals("pop")) {
                System.out.println("Петя взял  " + playlist.remove(playlist.size() - 1));
            }
        }
        System.out.println(playlist);
    }
} */
