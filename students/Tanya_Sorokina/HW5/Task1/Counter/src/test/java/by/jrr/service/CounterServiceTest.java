package by.jrr.service;

import by.jrr.bean.Counter;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class CounterServiceTest {


    @Test
    void incrementTest() throws Exception {
        Counter counterT = new Counter(0,0);
        CounterService counterServiceT = new CounterService();
        counterT.setStep(10);
        counterT.setValue(50);
        int expected = counterT.getValue() + counterT.getStep();
        int actual = counterServiceT.increment(counterT);
        assertEquals(expected, actual, "Error");
        System.out.println("incrementTest has passed");
    }


    @Test
    void decrementTest() throws Exception {
        Counter counterT = new Counter(0,0);
        CounterService counterServiceT = new CounterService();
        counterT.setStep(10);
        counterT.setValue(25);
        int expected = counterT.getValue() - counterT.getStep();
        int actual = counterServiceT.decrement(counterT);
        assertEquals(expected, actual, "Error");
        System.out.println("decrementTest has passed");

    }

    @Test
    void resetTest() throws Exception {
        Counter counterT = new Counter(0,0);
        CounterService counterServiceT = new CounterService();
        counterT.setValue(10);
        counterT.setStep(9);
        int expected = 0;
        counterServiceT.reset(counterT);
        assertEquals(expected, counterT.getStep(), "[ERROR]");
        assertEquals(expected, counterT.getValue(), "[ERROR]");
        System.out.println("resetTest has passed");
    }

}