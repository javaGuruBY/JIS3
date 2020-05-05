package service;

import by.abs.bean.Counter;

public class CounterService {

    public static void main(String[] args) {

    }
    public Counter reset() {
        return new Counter();
    }


    public void increment( Counter counter) {
        counter.setValue(counter.getValue() + counter.getStep());

    }


    public void decrement(Counter counter){
        counter.setValue(counter.getValue() - counter.getStep());
    }
}
