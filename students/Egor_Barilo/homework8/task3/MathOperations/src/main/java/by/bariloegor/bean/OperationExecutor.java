package by.bariloegor.bean;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class OperationExecutor{
    public void execute(MathOperation[] operations, double a, double b){
        Logger log = LoggerFactory.getLogger(OperationExecutor.class);
        for(MathOperation operation : operations){
            String result = "Result equal " + operation.compute(a,b);
            log.info(result);
        }
    }
}
