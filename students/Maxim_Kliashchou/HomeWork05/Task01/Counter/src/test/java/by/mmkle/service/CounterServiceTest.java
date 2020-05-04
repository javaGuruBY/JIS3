package by.mmkle.service;

import by.mmkle.bean.Counter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CounterServiceTest {
    private Counter counter;
    private CounterService counterService;
    @BeforeEach
    void setUp(){
        counter = new Counter();
        counterService = new CounterService();
    }
    @Test
    void incrementValueInRange() {
        String testMessage = "Value should be 1";
        int expected = 1;
        counterService.increment(counter);
        int actual = counter.getValue();
        assertEquals(expected, actual, testMessage);
    }

    @Test
    void incrementValueOutRange() {
        String testMessage = "Value should be 100";
        int expected = 100;
        counter.setValue(100);
        counterService.increment(counter);
        int actual = counter.getValue();
        assertEquals(expected, actual, testMessage);
    }

    @Test
    void decrementValueInRange() {
        String testMessage = "Value should be 19";
        int expected = 19;
        counter.setValue(20);
        counterService.decrement(counter);
        int actual = counter.getValue();
        assertEquals(expected, actual, testMessage);
    }

    @Test
    void decrementValueOutRange() {
        String testMessage = "Value should be 0";
        int expected = 0;
        counterService.decrement(counter);
        int actual = counter.getValue();
        assertEquals(expected, actual, testMessage);
    }

    @Test
    void reset() {
        String testMessage = "Counter should refresh to default value";
        Counter expected = new Counter();
        counterService.increment(counter);
        counterService.increment(counter);
        counterService.increment(counter);
        counter = counterService.reset();
        Counter actual = counter;
        assertEquals(expected, actual, testMessage);
    }
}