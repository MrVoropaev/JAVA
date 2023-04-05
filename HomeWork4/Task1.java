/* import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
public class Task_3 {
// Дан Deque состоящий из последовательности цифр.
// Необходимо проверить, что последовательность цифр является палиндромом
public static void main(String[] args) {
    Deque<Integer> deque = new ArrayDeque<>(Arrays.asList(1,2,3,4,5,6));

}


public boolean checkOn(Deque<Integer> deque){

    return false;
}
}*/

package HomeWork4;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;


public class Task1 {
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>(Arrays.asList(6,5,4,3,4,5,6));

        boolean res = true;
        for (int i = 0; i < deque.size() / 2; i ++) {
            int f = deque.pollFirst();
            int l = deque.pollLast();
            if (f != l) {
                res = false;
                break;
            }
        }

        System.out.println(res ? "Палиндром" : "Не палиндром");
    }    
}

//Альтернативно:
/*package HomeWork4;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class Task1 {
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>(Arrays.asList(1,2,3,4,5,6));
        System.out.println(checkOnPalindrome(deque));
        Deque<Integer> deque2 = new ArrayDeque<>(Arrays.asList(1,2,3,3,2,1));
        System.out.println(checkOnPalindrome(deque2));
        Deque<Integer> deque3 = new ArrayDeque<>(Arrays.asList(1,2,3,2,2,1));
        System.out.println(checkOnPalindrome(deque3));
    }

    public static boolean checkOnPalindrome(Deque<Integer> deque){
        while (deque.size() > 1){
            if (deque.poll() != deque.pollLast()) {
                return false;
            }
        }
        return true;
    }
} */
