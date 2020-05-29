package by.jrr;

import by.jrr.service.*;

public class App {
    public static void main(String[] args) {
        OperationExecutorService operationExecutor = new OperationExecutorService();

        MathOperation[] ops = {
                new AdditionOperationService(),
                new SubtractionOperationService(),
                new MultiplicationOperationService(),
                new DivisionOperationService()
        };
        operationExecutor.execute(ops, 10, 3); //8, 2
    }
}
