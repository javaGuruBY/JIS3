package by.rybak.service;

import by.rybak.bean.Counter;

public class CounterService {
    public void increment(Counter counter) {
        if ((counter.getValue() + counter.getStep()) <= 100) {
            counter.setValue(counter.getValue() + counter.getStep());
        } else {
            System.out.println("sum is more then 100!");
        }
    }

    public void decrement(Counter counter) {
        if ((counter.getValue() - counter.getStep()) >= 0) {
            counter.setValue(counter.getValue() - counter.getStep());
        } else {
            System.out.println("difference is less then 0!");
        }
    }

    public void reset(Counter counter) {
        counter.setValue(0);
        counter.setStep(0);
    }
}
