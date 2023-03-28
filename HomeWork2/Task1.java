/* Посчитайте сколько драгоценных камней в куче обычных камней
Пример:
jewels = “aB”, stones = “aaaAbbbB”
Результат в консоль ”a3B1”*/


package HomeWork2;

public class Task1 {
    public static void main(String[] args) {
        String letter = "aB";
        String line = "aaaAbbbB";
        
        String result = "";
        for (int i = 0; i < letter.length(); i++) {
            int count = 0;
            for (int j = 0; j < line.length(); j++) {
                if (Character.isLetter(line.charAt(j)) && letter.charAt(i) == line.charAt(j)) {
                    count++;
                }
            }
            result += letter.charAt(i) + "" + count;
        }
        
        System.out.println(result);
    }
}
