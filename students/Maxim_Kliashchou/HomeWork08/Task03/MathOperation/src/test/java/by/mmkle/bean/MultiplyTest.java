package by.mmkle.bean;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MultiplyTest {
    Multiply multiply;
    @BeforeEach
    public void setUp(){
        multiply = new Multiply();
    }

    
    @Test
    void compute() {
        String testMessage = "Should multiply two numbers";
        double firstValue = 2;
        double secondValue = 5;
        double expected = 10;
        double actual = multiply.compute(firstValue, secondValue);
        assertEquals(expected, actual, testMessage);
        
    }
}