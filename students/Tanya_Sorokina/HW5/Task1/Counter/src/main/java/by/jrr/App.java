package by.jrr;


import by.jrr.bean.Counter;
import by.jrr.service.CounterService;

public class App {
    public static void main(String[] args) throws Exception {
        Counter counter = new Counter(0, 2);
        CounterService counterService = new CounterService();
        System.out.println(counterService.increment(counter));
    }
    
}
