package by.bariloegor.bean;

public class MultiplicationOperation implements MathOperation{
    @Override
    public double compute(double a, double b) {
        return a*b;
    }
}
