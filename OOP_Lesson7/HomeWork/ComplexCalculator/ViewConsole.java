package src.views;


import src.calculator.CalculatorFactorable;
import src.calculator.ComplexCalculable;
import src.calculator.ComplexNumberCalculator;

import java.util.Scanner;

public class ViewConsole {

    private final static String INPUT_SECOND_ARG = "Введите второй аргумент ";

    private CalculatorFactorable calculatorFactory;

    public ViewConsole(CalculatorFactorable calculatorFactory) {

        this.calculatorFactory = calculatorFactory;
    }

    public void run() {
        while (true) {
            ComplexNumberCalculator primaryArg = promptComplex("Введите первый аргумент ");
            ComplexCalculable calculator = calculatorFactory.create(primaryArg);
            while (true) {
                String cmd = prompt("Введите команду (+, -, *, /, =) : ");
                if (cmd.equals("+")) {
                    ComplexNumberCalculator arg = promptComplex(INPUT_SECOND_ARG);
                    calculator.sum(arg);
                    continue;
                }
                if (cmd.equals("-")) {
                    ComplexNumberCalculator arg = promptComplex(INPUT_SECOND_ARG);
                    calculator.sub(arg);
                    continue;
                }
                if (cmd.equals("*")) {
                    ComplexNumberCalculator arg = promptComplex(INPUT_SECOND_ARG);
                    calculator.mul(arg);
                    continue;
                }
                if (cmd.equals("/")) {
                    ComplexNumberCalculator arg = promptComplex(INPUT_SECOND_ARG);
                    calculator.div(arg);
                    continue;
                }
                if (cmd.equals("=")) {
                    ComplexNumberCalculator result = calculator.getResult();
                    System.out.printf("Результат %s\n", result);
                    break;
                }
            }
            String cmd = prompt("Еще посчитать (Y/N)?");
            if (cmd.equals("Y")) {
                continue;
            }
            break;
        }
    }

    private String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }

    private ComplexNumberCalculator promptComplex(String message) {
        Scanner in = new Scanner(System.in);
        System.out.println(message);
        System.out.print("Введите действительную часть : ");
        double a = in.nextDouble();
        System.out.print("Введите мнимую часть : ");
        double b = in.nextDouble();
        return new ComplexNumberCalculator(a, b);
    }
}
