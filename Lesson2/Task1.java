/*Дана строка, в которой через пробел перечислены цифры. На следующей строке вводится цифра. Определите индексы первого и последнего её вхождения.

Sample Input:

4 5 3 5 2 6 4 6 6 8 1 2 3 8 4 0 9 7
4
Sample Output:

0
28 */


package Lesson2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        int number = scan.nextInt();
        String[] numbersArray = input.split(" ");
        int firstIndex = -1;
        int lastIndex = -1;
        for (int i = 0; i < numbersArray.length; i++) {
            if (Integer.parseInt(numbersArray[i]) == number) { 
                if (firstIndex == -1) { 
                    firstIndex = i; 
                }
                lastIndex = i; 
            }
        }
        System.out.println(firstIndex + "\n" + lastIndex);
        
        scan.close();
    }
}
