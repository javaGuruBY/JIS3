package by.abs.bean;

public class MathOpsDemo {
    public static void main(String[] args) {
        OperationExecutor service = new OperationExecutor();

        MathOperation[] ops = {
                new AdditionOps(),
                new SubstractionOps(),
                new MultiplicationOps(),
                new DivisionOps()
        };

       service.execute(ops, 6, 6); //8, 2

    }
}
