package by.bariloegor;

import by.bariloegor.bean.Counter;
import by.bariloegor.service.CounterService;

public class App {
    public static void main(String[] args) {
        CounterService counterService = new CounterService();
        Counter firstCounter = new Counter();

        firstCounter.setStep(10);
        firstCounter.setValue(5);
        for(int i = 0; i < 9; i++){
            counterService.increment(firstCounter);
        }
        counterService.increment(firstCounter);
        counterService.reset(firstCounter);
        firstCounter.setStep(5);
        counterService.decrement(firstCounter);
    }
}
