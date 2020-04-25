package by.rybak.service;

import by.rybak.interfaces.MathOperation;

public class DivisionOperationService implements MathOperation {
    @Override
    public double compute(double a, double b) {
        return a / b;
    }
}
