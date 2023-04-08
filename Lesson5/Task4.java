/*import java.util.List;
import java.util.Map;

public class Task_4 {

    // Вам дан массив путей, где пути[i] = [”Город А”, “Город Б”] означают, что существует прямой путь, идущий от
    // ”Город А” до“Город Б”. Верните город назначения, то есть город без какого-либо пути, ведущего в другой город.
    // Пример 1: Input: s = [["Москва","Самара"], ["Курск","Пенза"],["Самара","Курск"]]  Output: Пенза
    // Пример 2: Input: s = [["Москва","Самара"]]  Output: Самара
    public static void main(final String[] args) {

    }

    public String getFinalCity(final Map<String, String> map){
        return "";
    }

} */


package Lesson5;

import java.util.*;

public class Task4 {
    public static void main(String[] args) {
        String[][] paths = {{"Москва", "Самара"}, {"Курск", "Пенза"}, {"Самара", "Курск"}};

        String finalCity = getFinalCity(paths);

        System.out.println(finalCity);
    }

    public static String getFinalCity(String[][] paths) {

        Map<String, String> map = new HashMap<>();

        for (String[] path : paths) {
            map.put(path[0], path[1]);
        }

        String finalCity = "";

        for (String[] path : paths) {
            if (!map.containsValue(path[0])) {
                finalCity = path[0];
                break;
            }
        }

        if (finalCity.equals("")) {
            finalCity = paths[paths.length - 1][1];
        }

        return finalCity;
    }
} 
