package by.bariloegor.bean;

public class DivisionOperation implements MathOperation{
    @Override
    public double compute(double a, double b){
        return a/b;
    }
}
