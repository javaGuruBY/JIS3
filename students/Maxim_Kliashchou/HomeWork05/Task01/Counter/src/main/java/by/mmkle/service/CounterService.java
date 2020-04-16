package by.mmkle.service;

import by.mmkle.bean.Counter;

public class CounterService {
    public void increment(Counter counter){
        counter.setValue(counter.getValue() + counter.getStep());
    }

    public void decrement(Counter counter){
        counter.setValue(counter.getValue() - counter.getStep());
    }

    public Counter reset(){
        return new Counter();
    }
}
