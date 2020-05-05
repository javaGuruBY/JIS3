package by.mmkle.service;

import by.mmkle.interfaces.MathOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class OperationExecutor {
    Logger log = LoggerFactory.getLogger(OperationExecutor.class);

    public void execute(MathOperation[] operations, double a, double b){
        for (MathOperation operation : operations) {
            log.info("Operation result: " + operation.compute(a, b));
        }
    }
}
