package by.rybak.service;

import by.rybak.interfaces.MathOperation;

public class MultiplicationOperationService implements MathOperation {
    @Override
    public double compute(double a, double b) {
        return a * b;
    }
}
