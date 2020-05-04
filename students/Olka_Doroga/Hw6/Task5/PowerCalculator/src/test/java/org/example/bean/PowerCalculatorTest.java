package org.example.bean;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PowerCalculatorTest {

    @Test
    void powerCalculatorPos() {
        PowerCalculator powerCalculator = new PowerCalculator();
        int expected = 9;
        int actual = powerCalculator.powerCalculator(3,2);
        assertEquals(expected, actual, "111");
    }

    @Test
    void powerCalculatorNeg() {
        PowerCalculator powerCalculator = new PowerCalculator();
        int expected = 1;
        int actual = powerCalculator.powerCalculator(-3,2);
        assertEquals(expected, actual, "222");
    }
}