package by.mmkle.bean;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinusTest {
    Minus minus;
    @BeforeEach
    public void setUp(){
        minus = new Minus();
    }

    @Test
    void compute() {
        String testMessage = "Should dec two numbers";
        double firstValue = 2;
        double secondValue = 5;
        double expected = -3;
        double actual = minus.compute(firstValue, secondValue);
        assertEquals(expected, actual, testMessage);
    }
}