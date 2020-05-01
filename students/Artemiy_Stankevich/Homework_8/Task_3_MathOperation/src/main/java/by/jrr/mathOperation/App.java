package by.jrr.mathOperation;

import by.jrr.mathOperation.Interface.MathOperation;
import by.jrr.mathOperation.bean.*;

public class App {
    public static void main(String[] args) {
        OperationExecutor executor = new OperationExecutor();
        MathOperation [] opp = {
                new AdditionOperation(),
                new SubtractionOperation(),
                new MultiplicationOperation(),
                new DivisionOperation()
        };
        executor.execute(opp, 2,5);
    }
}
