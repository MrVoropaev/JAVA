/*Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов. */


package HomeWork5;

import java.util.*;

public class Task1 {
    public static void main(String[] args) {
        Map<String, List<String>> phoneBook = new HashMap<>(); // создаем объект HashMap, где ключ - имя, значение - список телефонов

        addEntry(phoneBook, "Иванов", "89851112233");
        addEntry(phoneBook, "Иванов", "89998887766");
        addEntry(phoneBook, "Петров", "89876543211");
        addEntry(phoneBook, "Сидоров", "81234567890");

        System.out.println("Телефоны:");
        printPhoneBook(phoneBook);

        String name = "Иванов";
        List<String> phones = phoneBook.getOrDefault(name, Collections.emptyList());
        System.out.printf("Телефоны %s: %s%n", name, phones);

    }

    private static void addEntry(Map<String, List<String>> phoneBook, String name, String phone) {
        List<String> phones = phoneBook.getOrDefault(name, new ArrayList<>()); 
        phones.add(phone); 
        phoneBook.put(name, phones);
    }

    private static void printPhoneBook(Map<String, List<String>> phoneBook) {
        for (Map.Entry<String, List<String>> entry : phoneBook.entrySet()) {
            String name = entry.getKey();
            List<String> phones = entry.getValue();
            System.out.printf("%s: %s%n", name, phones);
        }
    }
}
