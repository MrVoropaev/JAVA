/*import java.util.Deque;

public class Task_5 {

    //Дана строка содержащая только символы '(', ')', '{', '}', '[' и ']', определите,
    // является ли входная строка логически правильной.
    // Входная строка логически правильная, если:
    // 1) Открытые скобки должны быть закрыты скобками того же типа.
    // 2) Открытые скобки должны быть закрыты в правильном порядке. Каждая закрывающая скобка имеет соответствующую
    // открытую скобку того же типа.
    // ()[] = true
    // () = true
    // {[()]} = true
    // ()() = true
    // )()( = false

    public static void main(String[] args) {

    }

    public boolean validate(Deque<Integer> deque){

        return false;
    }
}
 */


package Lesson4;

import java.util.Deque;
import java.util.ArrayDeque;

public class Task5 {
    public static void main(String[] args) {
        String s1 = "()[]";
        String s2 = "()";
        String s3 = "{[()]}";
        String s4 = "()()";
        String s5 = ")(()(";
        System.out.println(validate(s1));
        System.out.println(validate(s2));
        System.out.println(validate(s3));
        System.out.println(validate(s4));
        System.out.println(validate(s5));
    }
    public static boolean validate(String s){
        Deque<Character> deque = new ArrayDeque<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(c == '(' || c == '{' || c == '['){
                deque.push(c);
            } else if(c == ')' && !deque.isEmpty() && deque.peek() == '('){
                deque.pop();
            } else if(c == '}' && !deque.isEmpty() && deque.peek() == '{'){
                deque.pop();
            } else if(c == ']' && !deque.isEmpty() && deque.peek() == '['){
                deque.pop();
            } else {
                return false;
            }
        }
        return deque.isEmpty(); // если все скобки закрыты, то очередь должна быть пустой
    }
}
