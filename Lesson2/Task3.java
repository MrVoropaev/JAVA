/*Для того чтобы выходить в Интернет, каждому компьютеру присваивается так называемый IP-адрес. Он состоит из четырех целых чисел в диапазоне от 0 до 255, разделенных точками. В следующих трех строках показаны три правильных IP-адреса:

127.0.0.0
192.168.0.01
255.00.255.255
Напишите программу, которая определяет, является ли заданная строка правильным IP-адресом.
Входные данные
На вход программе подается строка длиной не более 15 символов, которая включает цифры и точки.

Выходные данные
Если строка является правильным IP-адресом, необходимо вывести YES, иначе NO.

Примечание:
У вас не получится просто так взять и создать строку, которая содержит точку. Иначе говоря строчка кода:

String s = ".";
просто на просто не сработает. Точнее сработает неверно. Для корректного создания строки, содержащей точку используйте экранирование.

String s = "\\.";
Sample Input 1:

192.168.1.2
Sample Output 1:

YES
Sample Input 2:

192.11.690.0
Sample Output 2:

NO
Sample Input 3:

67.67.67
Sample Output 3:

NO
 */


package Lesson2;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Task3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();

        Pattern pattern = Pattern.compile("^((25[0-5]|2[0-4]\\d|[01]?\\d\\d?)\\.){3}(25[0-5]|2[0-4]\\d|[01]?\\d\\d?)$");
        Matcher matcher = pattern.matcher(input);

        if (matcher.matches()) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
        scan.close();
    }
}
    
