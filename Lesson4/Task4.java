/* import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class Task_4 {

    //Даны два Deque представляющие два неотрицательных целых числа. Цифры хранятся в обратном порядке,
    // и каждый из их узлов содержит одну цифру.
    // Сложите два числа и верните сумму в виде связанного списка.
    public static void main(String[] args) {
        Deque<Integer> d1 = new ArrayDeque<>(Arrays.asList(1,2,3));
        Deque<Integer> d2 = new ArrayDeque<>(Arrays.asList(5,4,7));
        // result [6,6,0,1]

    }


    public Deque<Integer> sum(Deque<Integer> d1, Deque<Integer> d2) {

        return new ArrayDeque<>();
    }
}*/

package Lesson4;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class Task4 {
    public static void main(String[] args) {
        Deque<Integer> d1 = new ArrayDeque<>(Arrays.asList(1,2,3));
        Deque<Integer> d2 = new ArrayDeque<>(Arrays.asList(5,4,7));
        System.out.println(sum(d1,d2));
    }

    public static Deque<Integer> sum(Deque<Integer> d1, Deque<Integer> d2) {
        Deque<Integer> result = new ArrayDeque<>();
        int carry = 0; // переменная для хранения старшего разряда при сложении двух цифр
        while (!d1.isEmpty() || !d2.isEmpty()){
            int sum = carry + (d1.isEmpty() ? 0 : d1.poll()) + (d2.isEmpty() ? 0 : d2.poll());
            result.add(sum % 10);
            carry = sum / 10;
        }
        if(carry > 0)
            result.add(carry);
        return result;
    }

    /*package seminar4;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

public class task_4 {

    //Даны два Deque представляющие два неотрицательных целых числа. Цифры хранятся в обратном порядке,
    // и каждый из их узлов содержит одну цифру.
    // Сложите два числа и верните сумму в виде связанного списка.
    public static void main(String[] args) {
        Deque<Integer> d1 = new ArrayDeque<>(Arrays.asList(1,2,3));
        Deque<Integer> d2 = new ArrayDeque<>(Arrays.asList(5,4,7));
        // result [6,6,0,1]
        LinkedList<Integer> ll = new LinkedList<Integer>();
        String str = new String(); 
        String str1 = new String(); 
        int d1Size = d1.size();
        int d2Size = d2.size();      
        for (int index = 0; index < d1Size; index++) {
            str += d1.pollLast();
            //ll.add(d1.peekLast() + d2.peekLast());    
        }
        for (int i = 0; i < d2Size; i++) {
            str1 += d2.pollLast();
        }
        //System.out.println(str);
        //System.out.println(str1);
        int summ =  Integer.parseInt(str) + Integer.parseInt(str1);

        while (summ > 0 ) {
            ll.add(summ%10);
            summ = summ/10;
            
        }
        System.out.println(ll);
    }
} */
}

