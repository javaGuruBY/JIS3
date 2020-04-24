package service;

import by.abs.bean.Counter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CounterServiceTest {
    private Counter counter;
    private CounterService counterService;

    @BeforeEach
    void setUp() {
        counter = new Counter();
        counterService = new CounterService();
    }

    @Test
    void reset() {
        String testMessage = "counter must refresh to default ";
        Counter expected = new Counter();
        counterService.increment(counter);
        counterService.increment(counter);
        counterService.increment(counter);
        counter = counterService.reset();
        Counter actual = counter;
        assertEquals(expected, actual, testMessage);
    }

    @Test
    void increment() {
        String testMessage = "counter value must be 1";
        int expected = 1;
        counterService.increment(counter);
        int actual = counter.getValue();
        assertEquals(expected, actual, testMessage);
    }

    @Test
    void decrement() {
        String testMessage = "counter value must be 0";
        int expected = 0;
        counterService.decrement(counter);
        int actual = counter.getValue();
        assertEquals(expected, actual, testMessage);
    }
}