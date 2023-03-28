/*водится строчка текста, затем, на следующей строке, одна буква латинского алфавита. Найдите, сколько раз в тексте встречается введённый символ в любом регистре. Учтите, что цифры не имеют разницы в записи нижнего и верхнего регистров.

Sample Input:

Good morning my dear friend. My fish.
m
Sample Output:

3 */


package Lesson2;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String text = scan.nextLine().toLowerCase();
        String letter = scan.nextLine().toLowerCase();
        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == letter.charAt(0)) {
                count++;
            }
        }
        System.out.println(count);

        scan.close();
    }
}
