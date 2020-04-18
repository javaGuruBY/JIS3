package by.rybak.bean;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrimeNumbersTest {
    PrimeNumbers numbers;

    @BeforeEach
    public void initialization(){
        numbers = new PrimeNumbers();
    }

    @Test
    void testToString() {
        String expected = "PrimeNumbers{start=1, end=500}";
        String actual = numbers.toString();

        assertEquals(expected,actual,"Should return right strings");
    }

    @Test
    void testEquals() {
        PrimeNumbers numbers1 = new PrimeNumbers();
        boolean actual = numbers.equals(numbers1);
        assertTrue(actual);

        numbers1.setStart(235);
        boolean actual1 = numbers.equals(numbers1);
        assertFalse(actual1);
    }
    
}