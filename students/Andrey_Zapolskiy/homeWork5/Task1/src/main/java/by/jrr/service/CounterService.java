package by.jrr.service;

import by.jrr.bean.Counter;

public class CounterService {
    public static void main(String[] args) {
        Counter counter = new Counter();
        counter.setValue(50);
        counter.decrement();
        counter.setStep(10);
        counter.increment();
    }
}
