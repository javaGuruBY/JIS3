package by.mmkle.bean;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlusTest {
    Plus plus;

    @BeforeEach
    public void setUp(){
        plus = new Plus();
    }
    @Test
    void compute() {
        String testMessage = "Should sum two numbers";
        double firstValue = 2;
        double secondValue = 5;
        double expected = 7;
        double actual = plus.compute(firstValue, secondValue);
        assertEquals(expected, actual, testMessage);
    }
}