/* На первой строке записывается натуральное число n - количество строчек в книге. Затем вводится n строк - строки книги. потом вводится натуральное число m - количество продуктов, на которые у человека аллергия. Потом вводится m строк - вида "продукт1 - продукт2", где продукт1 - продукт, на который у человека аллергия и продукт2 - продукт, на который следует заменить продукт1. Гарантируется что любой продукт состоит из 1 слова. название продуктов написаны строчными буквами. Гарантируется, что продукты, на которые нужно выполнить замену, не встречаются изначально в тексте.
Выходные данные
Замените все продукты в поваренной книге Васи и выведите их построчно на экран. На окончания не обращайте внимание. ВАЖНО!!! Если продукт, который следует заменить написан с большой буквы, то и замена тоже должна начинаться с большой буквы!
Sample Input:
2
Рецепт 1. Арахис 100гр, мороженое 200гр. Возьмите арахис и измелчите его. Посыпьте измельчённый арахис на мороженое.
Рецепт 2. Клубника 100гр, сгущенка 3кг. Смешать, есть) Радоваться жизни.
3
арахис - колбаса
клубника - вишня
сгущенка - молоко
Sample Output:
Рецепт 1. Колбаса 100гр, мороженое 200гр. Возьмите колбаса и измелчите его. Посыпьте измельчённый колбаса на мороженое.
Рецепт 2. Вишня 100гр, молоко 3кг. Смешать, есть) Радоваться жизни.*/


package HomeWork2;

import java.util.*;

public class Task3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        scan.nextLine();

        List<String> book = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            book.add(scan.nextLine());
        }

        int m = scan.nextInt();
        scan.nextLine();

        Map<String, String> allergens = new HashMap<>();
        for (int i = 0; i < m; i++) {
            String[] line = scan.nextLine().split(" - ");
            allergens.put(line[0], line[1]);
        }

        for (int i = 0; i < book.size(); i++) {
            String line = book.get(i);
            for (Map.Entry<String, String> entry : allergens.entrySet()) {
                String allergen = entry.getKey();
                String replacement = entry.getValue();
                line = line.replaceAll("\\b" + allergen + "\\b",
                        Character.isUpperCase(replacement.charAt(0))
                        ? Character.toUpperCase(replacement.charAt(0)) + replacement.substring(1)
                        : replacement);
            }
            book.set(i, line);
        }

        for (String line : book) {
            System.out.println(line);
        }
        scan.close();
    }
}