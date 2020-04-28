package by.khilko;

import by.khilko.bean.Counter;

public class CounterDemo {
    public static void main(String[] args) {
        Counter counter = new Counter(23,5);
        counter.getValue();
        counter.getStep();

        Counter counter2 = new Counter();
        counter2.setValue(68);
        counter2.setStep(7);
        counter2.getValue();
        counter2.getStep();
        counter2.toString();
    }
}
