/*Task_3

import java.util.List;

public class Task_3 {

    // Дана последовательность чисел. Необходимо вернуть число совпадающих пар в этой последовательности
    // Пример 1:     In: arr = [1, 2]  Out: 0
    // Пример 2:     In: arr = [1, 1, 2]  Out: 1
    // Пример 3:     In: arr = [1, 1, 1, 2, 2]  Out: 4
    public static void main(final String[] args) {

    }

    public Integer getNumberOfCouples(final List<Integer> list){

        return 0;
    }

}

 */


package Lesson5;

import java.util.*;

public class Task3 {
    public static void main(String[] args) {
            List<Integer> array = List.of(1, 1, 1, 2, 2); 
            System.out.println(getNumberOfCouples(array)); 
        }
        
        public static Integer getNumberOfCouples(final List<Integer> list) {
            int count = 0;
            for (int i = 0; i < list.size() - 1; i++) {
                int x = list.get(i);
                for (int j = i + 1; j < list.size(); j++) {
                    int y = list.get(j);
                    if (x == y) {
                        count++;
                    }
                }
            }
            return count;
        }
    }
