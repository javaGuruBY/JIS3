package by.rybak;

import by.rybak.interfaces.MathOperation;
import by.rybak.service.*;

public class MathOperationDemo {
    public static void main(String[] args) {
        OperationExecutorService service = new OperationExecutorService();

        MathOperation[] operations = {
            new AdditionOperationService(),
            new DivisionOperationService(),
            new SubtractionOperationService(),
            new MultiplicationOperationService(),
        };

        service.execute(operations, 8,5);
    }
}
