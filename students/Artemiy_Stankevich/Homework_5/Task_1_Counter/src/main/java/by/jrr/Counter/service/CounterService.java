package by.jrr.Counter.service;

import by.jrr.Counter.bean.Counter;

public class CounterService {

    public int increment(Counter counter) throws Exception {
        int result = counter.getValue() + counter.getStep();;
        if (result > 100) {
            throw new Exception("Variable value can not be biggest than 100");
        }
        return result;
    }
    public int decrement (Counter counter) throws Exception {
        int result = counter.getValue() - counter.getStep();;
        if (result < 0) {
            throw new Exception("Variable value can not be biggest than 100");
        }
        return result;
    }
    public void reset(Counter counter) throws Exception {
        counter.setValue(0);
        counter.setStep(0);
    }

}
