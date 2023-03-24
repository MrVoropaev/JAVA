/*Дан список. Выведите те его элементы, которые встречаются в списке только один раз. Элементы нужно выводить в том порядке, в котором они встречаются в списке.

Входные данные
Вводится список чисел. Все числа списка находятся на одной строке.

Выходные данные
Выведите ответ на задачу. */

package Lesson1;

import java.util.*;

public class Task7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < 7; i++) {
            list.add(scan.nextInt());
        }

        Map<Integer, Integer> counts = new HashMap<>();
        for (int num : list) {
            counts.put(num, counts.getOrDefault(num, 0) + 1);
        }

        for (int num : list) {
            if (counts.get(num) == 1) {
                System.out.print(num + " ");
            }
            counts.put(num, counts.get(num) + 1);

            scan.close();
        }
    }
}

        
