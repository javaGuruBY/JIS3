package by.rybak;

import by.rybak.bean.Counter;
import by.rybak.service.CounterService;

public class CounterDemo {
    public static void main(String[] args) {
        Counter counter = new Counter(12,3);
        CounterService service = new CounterService();

        service.increment(counter); //15
        System.out.println(counter);

        counter.setStep(101);
        service.decrement(counter);// warning
        service.increment(counter); // warning
        counter.setStep(4);
        service.decrement(counter);//11
        System.out.println(counter);

        service.reset(counter);
        System.out.println(counter);
    }
}
