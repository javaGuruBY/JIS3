package by.bariloegor.bean;

public class SubtractionOperation implements MathOperation{
    @Override
    public double compute(double a, double b) {
        return a-b;
    }
}
