/*Напишите программу, которая принимает с консоли число в формате byte и записывает его в файл ”result.txt”.
требуется перехватить все возможные ошибки и вывести их в логгер.
После написания, попробуйте подать на вход числа 100 и 200 и проследите разницу в результате */


package Lesson2;

import java.util.logging.Logger;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Scanner;

public class Task6 {
    private static Scanner scan = new Scanner(System.in);
    private static final Logger logger = Logger.getLogger(Task6.class.getName());
    public static void main(String[] args) {
        logger.info("program start");

        String myByteStr = scan.nextLine();
        Byte myByte = 0;
        try {
            Byte.parseByte(myByteStr);
        } catch (Exception e) {
            logger.warning(e.getMessage());
        }
        
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("byte.txt"));
            writer.write(myByte);
            logger.info("write OK!");
            writer.close();
        } catch (Exception e) {
            logger.warning(e.getMessage());
        }

        logger.info("program end");
    }
}