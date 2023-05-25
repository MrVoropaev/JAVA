package src;

import src.calculator.CalculatorFactorable;
import src.calculator.CalculatorFactory;
import src.calculator.log.LogCalculatorFactory;
import src.loggers.ConsoleLogger;
import src.loggers.Loggable;
import src.views.ViewConsole;

public class Main {

    public static void main(String[] args) {
        Loggable logger = new ConsoleLogger();
        CalculatorFactorable factory = new CalculatorFactory();
        CalculatorFactorable logFactory = new LogCalculatorFactory(factory, logger);
        ViewConsole viewConsole = new ViewConsole(logFactory);
        viewConsole.run();
    }
}
