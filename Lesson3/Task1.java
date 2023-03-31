/*Напишите программу, которая считает натуральное число n c клавиатуры и создаст список, в котором первый и последний элементы будут равны строчке 1, а между ними будет n 0. Выведите список на экран через пробел.  

Sample Input:

3
Sample Output:

1 0 0 0 1 */


package Lesson3;

import java.util.ArrayList;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    ArrayList<Integer> list = new ArrayList<>();
    list.add(1);
    for (int i = 0; i < n; i++) {
      list.add(0);
    }
    list.add(1);
    for (Integer i : list) {
      System.out.print(i + " ");

      scan.close();
    }
  }
}
