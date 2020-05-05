package org.example.bean;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

class CounterTest {

    @Test
    void increment() {
        Counter counter = new Counter();
        counter.setValue(100);
        counter.increment(counter);
        int expected = 100;
        int actual = counter.getValue();
        assertEquals(expected, actual, "111");
    }

    @Test
    void decrement() {
        Counter counter = new Counter();
        counter.setValue(0);
        counter.decrement(counter);
        int expected = 0;
        int actual = counter.getValue();
        assertEquals(expected, actual, "222");
    }

    @Test
    void reset() {
        Counter counter = new Counter();
        counter.setValue(50);
        counter.setStep(2);
        Counter expected = new Counter();
        counter.reset(counter);
        assertEquals(expected, counter, "333");

    }

    @Test
    void setValue() {
        Counter counter = new Counter();
        counter.setValue(99);
        int expected = 99;
        int actual = counter.getValue();
        assertEquals(expected, actual, "444");

    }

    @Test
    void getValue() {
        Counter counter =new Counter();
        int expected = 0;
        int actual = counter.getValue();
        assertEquals(expected, actual, "555");
    }

    @Test
    void setStep() {
        Counter counter = new Counter();
        counter.setStep(9);
        int expected = 9;
        int actual = counter.getStep();
        assertEquals(expected, actual, "666");

    }

    @Test
    void getStep() {
        Counter counter =new Counter();
        int expected = 1;
        int actual = counter.getStep();
        assertEquals(expected, actual, "777");
    }
}