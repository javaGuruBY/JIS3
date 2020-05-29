package by.jrr.service;

public class OperationExecutorService implements MathOperation{

   public void execute (MathOperation[] operations, double a, double b){
    for (MathOperation operation: operations){
        System.out.println(operation.getClass().getSimpleName() + " result = " + operation.compute(a, b));
        }
   }

    @Override
    public double compute(double a, double b) {
        return compute(a, b);
    }
}
