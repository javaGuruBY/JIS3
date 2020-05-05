package by.jrr.bean;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PowerCalculatorTest {

    @Test
    void powerCalculatorTest() {
        PowerCalculator powerCalculator = new PowerCalculator();
        powerCalculator.raiseToThePowerCalculator(5, 2);
        int expected = 25;
        int actual = powerCalculator.raiseToThePowerCalculator(5, 2);
        assertEquals(expected, actual, "Error");
        System.out.println("powerCalculatorTest has passed");
    }
}