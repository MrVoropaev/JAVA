package src.loggers;

import java.time.LocalDateTime;

public class ConsoleLogger implements Loggable{
    @Override
    public void log(String msg) {
        LocalDateTime now = LocalDateTime.now();
        System.out.printf("LOG [%s]: %s \n", now, msg);
    }
}
