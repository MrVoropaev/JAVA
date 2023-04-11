/*public class Homework {

    // 1) Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
    // 2) Создать коллекцию ноутбуков.
    // 3) Написать мапу, которая будет содержать критерий (или критерии) фильтрации и выведет
    //      ноутбуки, отвечающие фильтру.
    //      Пример: ОЗУ - Значение, Объем ЖД - Значение, Операционная система - Значение, Цвет - Значение
    // 4) Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.
    public static void main(String[] args) {

    }

    public List<Notebook> initListNotebooks(){

        return null;
    }

    public List<Notebook> filter(Map<String, String> params, List<Notebook> notebooks){

        return null;
    }

} */


package Lesson6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Task2 {

    public static void main(String[] args) {
        Task2 homework = new Task2();

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