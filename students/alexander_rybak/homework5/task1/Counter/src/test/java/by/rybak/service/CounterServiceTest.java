package by.rybak.service;

import by.rybak.bean.Counter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CounterServiceTest {
    Counter counter;
    CounterService service;

    @BeforeEach
    public void initialization(){
        counter = new Counter(23,5);
        service = new CounterService();
    }
    
    @Test
    public void increment() {
        int expected = 28;
        service.increment(counter);
        int actual = counter.getValue();

        assertEquals(expected, actual, "Should return right sum");
    }

    @Test
    public void decrement() {
        int expected = 18;
        service.decrement(counter);
        int actual = counter.getValue();

        assertEquals(expected, actual, "Should return right difference");
    }

    @Test
    public void reset() {
        int expected = 0;
        service.reset(counter);
        int actual = counter.getValue();

        assertEquals(expected, actual, "Should return right reset");
    }
}