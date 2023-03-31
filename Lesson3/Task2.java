/*Напишите программу, которая считает натуральное число n c клавиатуры и создаст список, в котором будут хранится строковые представления чисел от 0 до n-1. Затем программа считывает число m (m <= n) и строку s. Вставьте строку s на позицию m. Выведите список на экран через пробел.  

Sample Input:

5
2
Строка
Sample Output:

0 1 Строка 2 3 4 */


package Lesson3;

import java.util.ArrayList;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    ArrayList<String> list = new ArrayList<>();
    for (int i = 0; i < n; i++) {
      list.add(String.valueOf(i));
    }
    int m = scan.nextInt();
    String s = scan.next();
    list.add(m, s);
    for (String str : list) {
      System.out.print(str + " ");
    
      scan.close();
    }
  }
}
