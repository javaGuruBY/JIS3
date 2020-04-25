package by.rybak.service;

import by.rybak.interfaces.MathOperation;

public class OperationExecutorService {
    public void execute(MathOperation[] operations, double a, double b) {
        for (MathOperation operation : operations) {
            System.out.println(operation.compute(a, b));
        }
    }
}
