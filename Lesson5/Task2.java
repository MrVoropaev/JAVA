/* ask_2

Вводится число n, затем n целых чисел. Для каждого числа выведите слово YES (в отдельной строке), если это число ранее встречалось в последовательности или NO,  если не встречалось.

Sample Input:
6
1 2 3 2 3 4

Sample Output:
NO
NO
NO
YES
YES
NO


class Task_2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

    }
}
*/


package Lesson5;

import java.util.*;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            if (set.contains(num)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
                set.add(num);
    
            }
        }
    }
}
