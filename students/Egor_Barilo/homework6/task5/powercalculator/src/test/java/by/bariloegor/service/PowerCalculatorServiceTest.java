package by.bariloegor.service;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PowerCalculatorServiceTest {
    PowerCalculatorService powerCalculatorService;

    @Before
    public void setUp(){
        powerCalculatorService = new PowerCalculatorService();
    }

    @Test
    public void exponentiation() {
        int[] expected = {64, 100000};
        int[] number = {2, 10};
        int[] degree = {6, 5};
        for(int i = 0; i < expected.length; i++){
            int actual = powerCalculatorService.exponentiation(number[i], degree[i]);
            assertEquals("Should do exponentiation.", expected[i], actual);
        }
    }
}