package src.calculator;

public class ComplexCalculator implements ComplexCalculable {

    private ComplexNumberCalculator primaryArg;

    public ComplexCalculator(ComplexNumberCalculator primaryArg) {
        this.primaryArg = primaryArg;
    }

    public ComplexCalculator sum(ComplexNumberCalculator secondaryArg) {
        primaryArg = new ComplexNumberCalculator(primaryArg.getA() + secondaryArg.getA(), primaryArg.getB() + secondaryArg.getB());
        return this;
    }

    public ComplexCalculator sub(ComplexNumberCalculator secondaryArg) {
        primaryArg = new ComplexNumberCalculator(primaryArg.getA() - secondaryArg.getA(), primaryArg.getB() - secondaryArg.getB());
        return this;
    }

    public ComplexCalculator mul(ComplexNumberCalculator secondaryArg) {
        double a = primaryArg.getA() * secondaryArg.getA() - primaryArg.getB() * secondaryArg.getB();
        double b = primaryArg.getA() * secondaryArg.getB() + primaryArg.getB() * secondaryArg.getA();
        primaryArg = new ComplexNumberCalculator(a, b);
        return this;
    }

    public ComplexCalculator div(ComplexNumberCalculator secondaryArg) {
        double a = primaryArg.getA();
        double b = primaryArg.getB();
        double c = secondaryArg.getA();
        double d = secondaryArg.getB();
        primaryArg = new ComplexNumberCalculator((a * c + b * d) / (c * c + d * d), (b * c - a * d) / (c * c + d * d));
        return this;
    }

    public ComplexNumberCalculator getResult(){
        return primaryArg;
    }
}