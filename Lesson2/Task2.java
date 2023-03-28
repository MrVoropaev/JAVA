/*Формат входных данных:
На первой строке вводится любимая буква Маши, на второй - Олега. Затем вводится строка, в которой перечислены слова, которые написаны в газете.

Формат выходных данных:
На первой строчке выведите, сколько слов выписала Маша, а на второй - сколько слов выписал Олег.  

Sample Input:

а
в
Автокатастрофа анклав вилка Ванна Шкаф Вагон Азов веранда
Sample Output:

2
3 */


package Lesson2;

import java.util.Scanner;

public class Task2 {
    
public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
        String mashaLetter = scan.nextLine();
        String olegLetter = scan.nextLine();
        String words = scan.nextLine();
        String[] wordsArray = words.split(" ");
        int mashaCount = 0;
        int olegCount = 0;
        for (String word : wordsArray) {
            if (word.toLowerCase().startsWith(mashaLetter.toLowerCase())) { // если слово начинается с буквы Маши
                mashaCount++; 
            }
            if (word.toLowerCase().startsWith(olegLetter.toLowerCase())) { // если слово начинается с буквы Олега
                olegCount++; 
            
            }
        }
        System.out.println(mashaCount);
        System.out.println(olegCount);
    }
}
}