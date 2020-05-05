package by.bariloegor.bean;

public class AdditionOperation implements MathOperation{

    @Override
    public double compute(double a, double b) {
        return a+b;
    }
}
