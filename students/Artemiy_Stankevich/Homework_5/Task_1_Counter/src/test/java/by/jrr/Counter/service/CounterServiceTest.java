package by.jrr.Counter.service;

import by.jrr.Counter.bean.Counter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class CounterServiceTest {
    Counter counterTest;
    CounterService counterService;
    @BeforeEach
    void init () {
        counterTest = new Counter();
        counterService = new CounterService();
    }
    @Test
    void incrementTest() throws Exception {
        counterTest.setStep(10);
        int expected = counterTest.getValue() + counterTest.getStep();;
        int actual = counterService.increment(counterTest);
        assertEquals(expected, actual, "[ERROR]");
    }

    @Test
    void decrementTest() throws Exception {
        counterTest.setValue(15);
        counterTest.setStep(10);
        int expected = counterTest.getValue() - counterTest.getStep();;
        int actual = counterService.decrement(counterTest);
        assertEquals(expected, actual, "[ERROR]");
    }

    @Test
    void resetTest() throws Exception {
        counterTest.setValue(10);
        counterTest.setStep(9);
        int expected = 0;
        counterService.reset(counterTest);
        assertEquals(expected, counterTest.getStep(), "[ERROR]");
        assertEquals(expected, counterTest.getValue(), "[ERROR]");
    }

    @Test()
    public void ExceptionTest() throws Exception {
        counterTest.setValue(10);
        assertThrows(Exception.class,() -> {
            counterTest.setValue(122);
        });
        assertThrows(Exception.class,() -> {
            counterTest.setValue(-1);
        });
        assertThrows(Exception.class,() -> {
            counterTest.setStep(12);
        });
        assertThrows(Exception.class,() -> {
            counterTest.setStep(-10);
        });
    }
}