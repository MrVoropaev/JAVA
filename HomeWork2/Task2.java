/*  Вам дается строка S и целочисленный массив индексов int index[s.length].
Напишите программу, которая перетасует символы в S таким образом,
что символ c i-й позиции переместится на индекс index[i] в результирующей строке.
Пример: s = “cba”, index = [3,2,1] result “abc”*/


package HomeWork2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Введите строку: ");
        String s = scan.nextLine();
        
        int[] index = new int[s.length()];
        System.out.println("Введите индексы:");
        for (int i = 0; i < s.length(); i++) {
            index[i] = scan.nextInt();
        }
        
        char[] resultChars = new char[s.length()];
        
        for (int i = 0; i < s.length(); i++) {
            resultChars[index[i]] = s.charAt(i);
        }
        
        String result = new String(resultChars);
        System.out.println(result);
        scan.close();
    }
    
}


