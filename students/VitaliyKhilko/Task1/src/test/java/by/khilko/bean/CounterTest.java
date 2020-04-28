package by.khilko.bean;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CounterTest {

    @Test
    void getValue() {
        Counter counter = new Counter(55,4);

        String message = "Should return value";
        int expected = 55;
        int actual = counter.getValue();

        assertEquals(expected, actual, message);
    }

    @Test
    void setValue() {
        Counter counter = new Counter();
        counter.setValue(77);

        String message = "Should return set value";
        int expected = 77;
        int actual = counter.getValue();

        assertEquals(expected, actual, message);

    }

    @Test
    void getStep() {
        Counter counter = new Counter(55,4);

        String message = "Should return step";
        int expected = 4;
        int actual = counter.getStep();

        assertEquals(expected, actual, message);
    }

    @Test
    void setStep() {
        Counter counter = new Counter();
        counter.setStep(2);

        String message = "Should return set step";
        int expected = 2;
        int actual = counter.getStep();

        assertEquals(expected, actual, message);
    }

    @Test
    void testToString() {
        Counter counter = new Counter(34,6);

        String message = "Should return toString";
        String expected = "Counter{value=34, step=6}";
        String actual = counter.toString();

        assertEquals(expected, actual, message);
    }
}