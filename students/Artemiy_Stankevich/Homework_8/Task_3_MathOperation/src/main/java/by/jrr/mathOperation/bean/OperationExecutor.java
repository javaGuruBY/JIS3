package by.jrr.mathOperation.bean;

import by.jrr.mathOperation.Interface.MathOperation;

public class OperationExecutor implements MathOperation {

    public void execute(MathOperation[] operations, double a, double b) {
        for (MathOperation math: operations
             ) {
            System.out.println(math.compute(a,b));
        }
    }

    public double compute(double a, double b) {
        return 0;
    }
}
