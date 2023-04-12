/*Подумать над структурой класса Ноутбук для магазина техники — выделить поля и методы. Реализовать в Java.
Создать множество ноутбуков.
Написать метод, который будет запрашивать у пользователя критерий (или критерии) фильтрации и выведет ноутбуки, отвечающие фильтру. Критерии фильтрации можно хранить в Map. Например:
“Введите цифру, соответствующую необходимому критерию:
1 - ОЗУ
2 - Объём ЖД
3 - Операционная система
4 - Цвет …
Далее нужно запросить минимальные значения для указанных критериев — сохранить параметры фильтрации можно также в Map.
Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям. */

package HomeWork6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Task1 {
    public static void main(String[] args) {
        Task1 homework = new Task1();

        List<Notebook> notebooks = homework.initListNotebooks();

        Map<String, String> filterCriteria = new HashMap<>();
        filterCriteria.put("RAM", "8");
        filterCriteria.put("Storage", "256");
        filterCriteria.put("OS", "Windows");
        filterCriteria.put("Color", "Black");

        List<Notebook> filteredNotebooks = homework.filter(filterCriteria, notebooks);

        for (Notebook notebook : filteredNotebooks) {
            System.out.println(notebook);
        }
    }

    public List<Notebook> initListNotebooks() {
        List<Notebook> notebooks = new ArrayList<>();
        notebooks.add(new Notebook("ASUS", "Windows", 8, 256, "Black"));
        notebooks.add(new Notebook("Acer", "Windows", 8, 500, "Silver"));
        notebooks.add(new Notebook("HP", "Windows", 16, 512, "Black"));
        notebooks.add(new Notebook("Lenovo", "MacOS", 8, 256, "Black"));

        return notebooks;
    }

    public List<Notebook> filter(Map<String, String> params, List<Notebook> notebooks) {
        return notebooks.stream()
                .filter(notebook -> {
                    for (Map.Entry<String, String> entry : params.entrySet()) {
                        if (!notebook.matches(entry.getKey(), entry.getValue())) {
                            return false;
                        }
                    }
                    return true;
                })
                .collect(Collectors.toList());
    }
}

class Notebook {
    private String brand;
    private String OS;
    private int RAM;
    private int Storage;
    private String color;

    public Notebook(String brand, String OS, int RAM, int Storage, String color) {
        this.brand = brand;
        this.OS = OS;
        this.RAM = RAM;
        this.Storage = Storage;
        this.color = color;
    }

    public boolean matches(String key, String value) {
        switch (key) {
            case "Brand":
                return brand.equalsIgnoreCase(value);
            case "OS":
                return OS.equalsIgnoreCase(value);
            case "RAM":
                return RAM == Integer.parseInt(value);
            case "Storage":
                return Storage == Integer.parseInt(value);
            case "Color":
                return color.equalsIgnoreCase(value);
            default:
                return false;
        }
    }

    @Override
    public String toString() {
        return "Notebook{" +
                "brand='" + brand + '\'' +
                ", OS='" + OS + '\'' +
                ", RAM=" + RAM +
                ", Storage=" + Storage +
                ", color='" + color + '\'' +
                '}';
    }
}
