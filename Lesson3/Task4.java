/* import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task_4 {

    // Дан список содержащий строки и числа в строковом формате.
    // C помощью итератора пройти по списку и вывести в консоль что является строкой, а что числом
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("a", "2", "b", "3", "c", "4"));
        printResultOfCheck(list);
    }

    public static void printResultOfCheck(List<String> list){

    }

}*/


package Lesson3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Iterator;


public class Task4 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("a", "2", "b", "3", "c", "4"));
        printResultOfCheck(list);
    }

    public static void printResultOfCheck(List<String> list){
        Iterator<String> iterator = list.iterator();
        while(iterator.hasNext()) {
            String element = iterator.next();
            if(Character.isDigit(element.charAt(0))) {
                System.out.println(element);
            } else {
                System.out.println(element);
            }
        }
    }
}
