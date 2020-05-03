package by.khilko.bean;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberRangeTest {
    private NumberRange numbers;

    @BeforeEach
    void setUp() {
        numbers = new NumberRange(12,45);
    }

    @Test
    void getChOne() {
        String message = "Return first number";
        int expected = 12;
        int actual = numbers.getChOne();

        assertEquals(expected, actual, message);
    }

    @Test
    void setChOne() {
        String message = "Set and return first number";
        numbers.setChOne(23);
        int expected = 23;
        int actual = numbers.getChOne();

        assertEquals(expected, actual, message);
    }

    @Test
    void getChTwo() {
        String message = "Return second number";
        int expected = 45;
        int actual = numbers.getChTwo();

        assertEquals(expected, actual, message);
    }

    @Test
    void setChTwo() {
        String message = "Set and return second number";
        numbers.setChTwo(56);
        int expected = 56;
        int actual = numbers.getChTwo();

        assertEquals(expected, actual, message);
    }

    @Test
    void testToString() {
        String message = "Return toString method of object number";
        String expected = "NumberRange{chOne=12, chTwo=45}";
        String actual = numbers.toString();

        assertEquals(expected, actual, message);
    }
}