package by.bariloegor.service;

import by.bariloegor.bean.Counter;

public class CounterService {
    private boolean isMoreThanHundred(int value){
        return value>100;
    }

    private boolean isLessThanZero(int value){
        return value<0;
    }

    public void increment(Counter counter){
        int newCounterValue = counter.getValue() + counter.getStep();
        if(!isMoreThanHundred(newCounterValue)){
          counter.setValue(newCounterValue);
        }
    }

    public void decrement(Counter counter){
        int newCounterValue = counter.getValue() - counter.getStep();
        if(!isLessThanZero(newCounterValue)){
            counter.setValue(newCounterValue);
        }
    }

    public void reset(Counter counter){
        counter.setValue(0);
        counter.setStep(1);
    }

}
