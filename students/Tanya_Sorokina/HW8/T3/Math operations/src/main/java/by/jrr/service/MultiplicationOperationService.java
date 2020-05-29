package by.jrr.service;

public class MultiplicationOperationService extends OperationExecutorService implements MathOperation{
    @Override
    public void execute(MathOperation[] operations, double a, double b) {
        compute(a, b);
    }

    @Override
    public double compute(double a, double b) {
        return a * b;
    }
}
