/*Task_1

Вводится число n, затем n целых чисел. 
Определите, сколько различных чисел было введено.

Sample Input:
7
1 1 2 2 2 3 3

Sample Output:
3


class Task_1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

    }
} */


package Lesson5;

import java.util.*;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            set.add(sc.nextInt());
        }
        System.out.println(set.size());

        sc.close();
    }
}
