package by.abs.bean;



public class OperationExecutor {

    public void execute(MathOperation[] operations, double a, double b){
        for (MathOperation operation : operations) {
            System.out.println( operation.getClass().getSimpleName() + " result: " + operation.compute(a, b));
        }
}
}
