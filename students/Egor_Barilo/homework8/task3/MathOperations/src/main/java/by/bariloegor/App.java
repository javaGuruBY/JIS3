package by.bariloegor;

import by.bariloegor.bean.*;

public class App {
    public static void main(String[] args) {
        MathOperation[] mathOperations = { new AdditionOperation(), new SubtractionOperation()};
        OperationExecutor executor = new OperationExecutor();
        executor.execute(mathOperations, 10, 5);
    }
}
