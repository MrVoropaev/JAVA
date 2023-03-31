/*Дан список с десятью случайными числами, нужно отсортировать
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 9, 2, 6, 4, 3, 5, 7, 8, 0));

    }

    public List<Integer> sortByCollections(List<Integer> list){

        return new ArrayList<>();
    }

    public List<Integer> sortByComparator(List<Integer> list){

        return new ArrayList<>(); */

package Lesson3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class Task3 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 9, 2, 6, 4, 3, 5, 7, 8, 0));
        System.out.println("Исходный список: " + list);

        Comparator<Integer> reverseComparator = (o1, o2) -> o2 - o1;
        Collections.sort(list, reverseComparator);

        System.out.println("Отсортированный список: " + list);
    }
}
