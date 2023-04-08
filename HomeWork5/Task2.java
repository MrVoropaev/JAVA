/* Пусть дан список сотрудников:
Иван Иванов
Светлана Петрова
Кристина Белова
Анна Мусина
Анна Крутова
Иван Юрин
Петр Лыков
Павел Чернов
Петр Чернышов
Мария Федорова
Марина Светлова
Мария Савина
Мария Рыкова
Марина Лугова
Анна Владимирова
Иван Мечников
Петр Петин
Иван Ежов
Написать программу, которая найдёт и выведет повторяющиеся имена с количеством повторений. Отсортировать по убыванию популярности.*/


package HomeWork5;

import java.util.*;

public class Task2 {
    public static void main(String[] args) {
        List<String> employees = Arrays.asList(
                "Иван Иванов",
                "Светлана Петрова",
                "Кристина Белова",
                "Анна Мусина",
                "Анна Крутова",
                "Иван Юрин",
                "Петр Лыков",
                "Павел Чернов",
                "Петр Чернышов",
                "Мария Федорова",
                "Марина Светлова",
                "Мария Савина",
                "Мария Рыкова",
                "Марина Лугова",
                "Анна Владимирова",
                "Иван Мечников",
                "Петр Петин",
                "Иван Ежов"
        );

        Map<String, Integer> duplicates = new HashMap<>(); 

        for (String employee : employees) {
            String name = employee.split(" ")[0]; 
            int count = duplicates.getOrDefault(name, 0); 
            duplicates.put(name, count + 1); 
        }

        List<Map.Entry<String, Integer>> sortedDuplicates = new ArrayList<>(duplicates.entrySet());
        sortedDuplicates.sort(Map.Entry.<String, Integer>comparingByValue().reversed());

        System.out.println("Имена с повторениями:");
        for (Map.Entry<String, Integer> entry : sortedDuplicates) {
            if (entry.getValue() > 1) {
                System.out.printf("%s: %d%n", entry.getKey(), entry.getValue());
            }
        }

    }

}
