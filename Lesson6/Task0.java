/*public class Task0 {

    public static void main(String[] args) {

    }

    // Создайте HashSet, заполните его следующими числами: {1, 2, 3, 2, 4, 5, 6, 3}.
    // Распечатайте содержимое данного множества.
    public void initHashSet(){

    }

    // Создайте LinkedHashSet, заполните его следующими числами: {1, 2, 3, 2, 4, 5, 6, 3}.
    // Распечатайте содержимое данного множества.
    public void initLinkedHashSet(){

    }

    // Создайте TreeSet, заполните его следующими числами: {1, 2, 3, 2, 4, 5, 6, 3}.
    // Распечатайте содержимое данного множества.
    public void initTreeSet(){

    }
} */


package Lesson6;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Task0 {
    public static void main(String[] args) {
        Task0 task = new Task0();
        task.initHashSet();
        task.initLinkedHashSet();
        task.initTreeSet();
    }

    // Создайте HashSet, заполните его следующими числами: {1, 2, 3, 2, 4, 5, 6, 3}.
    // Распечатайте содержимое данного множества.
    public void initHashSet() {
        HashSet<Integer> num = new HashSet<>();
        num.add(1);
        num.add(2);
        num.add(3);
        num.add(2);
        num.add(4);
        num.add(5);
        num.add(6);
        num.add(3);
        System.out.println("HashSet: " + num);
    }

    // Создайте LinkedHashSet, заполните его следующими числами: {1, 2, 3, 2, 4, 5, 6, 3}.
    // Распечатайте содержимое данного множества.
    public void initLinkedHashSet() {
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(2);
        set.add(4);
        set.add(5);
        set.add(6);
        set.add(3);
        System.out.println("LinkedHashSet: " + set);
    }

    // Создайте TreeSet, заполните его следующими числами: {1, 2, 3, 2, 4, 5, 6, 3}.
    // Распечатайте содержимое данного множества.
    public void initTreeSet() {
        TreeSet<Integer> set = new TreeSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(2);
        set.add(4);
        set.add(5);
        set.add(6);
        set.add(3);
        System.out.println("TreeSet: " + set);
    }
}
