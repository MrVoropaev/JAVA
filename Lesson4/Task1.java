/*Напишите программу, которая реализует структуру данных очередь, используя список.

Условие задачи таково: пользователь листает список музыки и добавляет в плейлист 
понравившиеся ему композиции. Когда песня доигрывает, включается следующая.
 Вам необходимо вывести на экран через пробел композиции, которые будут играть далее.

Сначала вводится число n - количество запросов к вашей программе. 
Каждый из запросов будет иметь один следующих видов:

push <Название трека> - добавляет трек в плейлист
pop - удаляет из плейлиста первый трек. При этом на экран выводится запись вида "воспроизводится <название трека>"
После выполнения всех запросов выведите оставшиеся в очереди треки. Гарантируется, что название трека состоит из одного слова.

Sample Input:

4
push Трек1
push Трек3
pop
push ТрекТрек
Sample Output:

воспроизводится Трек1
Трек3 ТрекТрек

*/


package Lesson4;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // количество запросов
        sc.nextLine(); // очистить буфер после чтения числа
        Queue<String> playlist = new LinkedList<>(); // создаем пустой плейлист

        for (int i = 0; i < n; i++) {
            String[] query = sc.nextLine().split(" "); // читаем запрос и разбиваем его на слова
            if (query[0].equals("push")) {
                playlist.add(query[1]); // добавляем трек в плейлист
            } else if (query[0].equals("pop")) {
                String track = playlist.poll(); // достаем первый трек из плейлиста
                System.out.println("воспроизводится " + track); // выводим на экран
            }
        }

        // выводим оставшиеся треки в плейлисте через пробел
        while (!playlist.isEmpty()) {
            System.out.print(playlist.poll() + " ");

        sc.close();    
        }

    }
    
}

/*public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        // List<String> musicList = new ArrayList<>(Arrays.asList("Трек1", "Трек2", "Трек3", "Трек4", "Трек5", "Трек6"));
        int n = scanner.nextInt();
        List<String> playlist = new ArrayList<>();
        for (int i = 0; i < n; i++) { 
            String str = scanner.next();
            if (str.equals("push")) {
                String str1 = scanner.next();
                playlist.add(str1);
            } else if (str.equals("pop")) {
                System.out.println("Воспроизводится " + playlist.remove(0));
            }
        }
        System.out.println(playlist);
    } */