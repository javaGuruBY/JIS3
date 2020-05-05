package by.mmkle.bean;

import by.mmkle.interfaces.MathOperation;

public class Divide implements MathOperation {
    @Override
    public double compute(double a, double b) {
        return a / b;
    }
}
