/*import java.util.ArrayList;
import java.util.List;

public class Task_5 {

    // Пусть дан произвольный список целых чисел
    public static void main(String[] args) {

    }

    // Нужно удалить из него четные числа
    public List<Integer> removeEvenValue(List<Integer> list){

        return new ArrayList<>();
    }

    // Найти минимальное значение
    public Integer getMin(List<Integer> list){

        return 0;
    }

    // Найти максимальное значение
    public Integer getMax(List<Integer> list){

        return 0;
    }

    // Найти среднее значение
    public Integer getAverage(List<Integer> list){

        return 0;
    }
} */


package Lesson3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task5 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 9, 2, 6, 4, 3, 5, 7, 8, 0));
        System.out.println(list);
        removeEvenValue(list);
        System.out.println(getMin(list));
        System.out.println(getMax(list));
        System.out.println(getAverage(list));
    }

    // Нужно удалить из него четные числа
    public static List<Integer> removeEvenValue(List<Integer> list){
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 == 0) {
                list.remove(i);
                i--;
            }
        }
        System.out.println(list);
        return new ArrayList<>();
    }



    // Найти минимальное значение
    public static Integer getMin(List<Integer> list){
        int min = list.get(0);
        for (Integer i: list) {
            if (i < min)
                min = i;
        }
        return min;
    }

    // Найти максимальное значение
    public static Integer getMax(List<Integer> list){
        int max = list.get(0);
        for (Integer i: list) {
            if (i > max)
                max = i;
        }
        return max;
    }

    // Найти среднее значение
    public static Integer getAverage(List<Integer> list){
        int sum = 0;
        for (int i = 0; i < list.size(); i++)
        {
            sum += list.get(i);
        }
        return sum / list.size();
    }
}