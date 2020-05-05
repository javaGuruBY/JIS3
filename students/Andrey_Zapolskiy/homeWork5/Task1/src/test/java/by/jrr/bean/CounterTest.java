package by.jrr.bean;



import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

class CounterTest {


    @Test
    void increment() {
        Counter actualResult = new Counter();
        int expectedResult = 1;

        actualResult.increment();
        assertEquals(expectedResult, actualResult.getValue(), "counter should be 2");

    }

    @Test
    void decrement() {
        Counter actualResult = new Counter();
        int expectedResult = 3;
        actualResult.setValue(4);
        actualResult.decrement();
        assertEquals(expectedResult, actualResult.getValue(), "counter should be 3");
    }

    @Test
    void clear() {
        Counter actualResult = new Counter();
        int expectedResult = 0;
        actualResult.setValue(100);
        actualResult.increment();
        assertEquals(expectedResult, actualResult.getValue(), "counter should be 0");
    }

    @Test
    void setValue() {
        Counter actualResult = new Counter();
        int expectedResult = 5;
        actualResult.setValue(5);
        assertEquals(expectedResult, actualResult.getValue(), "should be 5");
    }

    @Test
    void getValue() {
        Counter actualResult = new Counter();
        int expectedResult = 0;

        assertEquals(expectedResult, actualResult.getValue(), "should be 1");
    }

    @Test
    void setStep() {
        Counter actualResult = new Counter();
        int expectedResult = 1;
        actualResult.setValue(1);
        assertEquals(expectedResult, actualResult.getStep(), "should be 1");
    }

    @Test
    void getStep() {
        Counter actualResult = new Counter();
        int expectedResult = 1;

        assertEquals(expectedResult, actualResult.getStep(), "should be 1");
    }
}