package src.calculator;

public interface ComplexCalculable {
    ComplexCalculator sum(ComplexNumberCalculator secondaryArg);
    ComplexCalculator sub(ComplexNumberCalculator secondaryArg);
    ComplexCalculator mul(ComplexNumberCalculator secondaryArg);
    ComplexCalculator div(ComplexNumberCalculator secondaryArg);
    ComplexNumberCalculator getResult();
}
