package by.jrr.mathOperation.bean;

import by.jrr.mathOperation.Interface.MathOperation;

public class SubtractionOperation extends OperationExecutor implements MathOperation {

    public double compute(double a, double b) {
        return a - b;
    }
    @Override
    public void execute(MathOperation[] operations, double a, double b) {
        compute(a,b);
    }
}
