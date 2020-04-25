package by.mmkle.bean;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DivideTest {
    Divide divide;
    @BeforeEach
    public void setUp(){
        divide = new Divide();
    }


    @Test
    void compute() {
        String testMessage = "Should divide two numbers";
        double firstValue = 5;
        double secondValue = 2;
        double expected = 2.5;
        double actual = divide.compute(firstValue, secondValue);
        assertEquals(expected, actual, 0, testMessage);

    }
}