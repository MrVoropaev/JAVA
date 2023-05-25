package src.calculator.log;

import src.calculator.ComplexCalculable;
import src.calculator.ComplexCalculator;
import src.calculator.ComplexNumberCalculator;
import src.loggers.Loggable;

public class LogComplexCalculator implements ComplexCalculable {

    private ComplexCalculable calculator;
    private Loggable logger;

    public LogComplexCalculator(ComplexCalculable calculator, Loggable logger){
        this.calculator = calculator;
        this.logger = logger;
        this.logger.log(String.format("Первый аргумент = %s",this.calculator.getResult()));
    }

    @Override
    public ComplexCalculator sum(ComplexNumberCalculator secondaryArg) {
        logger.log(String.format("Суммируем с %s", secondaryArg));
        return calculator.sum(secondaryArg);
    }

    @Override
    public ComplexCalculator sub(ComplexNumberCalculator secondaryArg) {
        logger.log(String.format("Вычитаем %s", secondaryArg));
        return calculator.sub(secondaryArg);
    }

    @Override
    public ComplexCalculator mul(ComplexNumberCalculator secondaryArg) {
        logger.log(String.format("Умножаем на %s", secondaryArg));
        return calculator.mul(secondaryArg);
    }

    @Override
    public ComplexCalculator div(ComplexNumberCalculator secondaryArg) {
        logger.log(String.format("Делим на %s", secondaryArg));
        return calculator.div(secondaryArg);
    }

    @Override
    public ComplexNumberCalculator getResult() {
        ComplexNumberCalculator result = calculator.getResult();
        logger.log(String.format("Получился результат %s", result));
        return result;
    }
}
