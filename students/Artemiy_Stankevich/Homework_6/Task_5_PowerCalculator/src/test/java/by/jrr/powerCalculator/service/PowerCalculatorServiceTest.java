package by.jrr.powerCalculator.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PowerCalculatorServiceTest {
PowerCalculatorService powerCalculatorService = new PowerCalculatorService();
    @Test
    void raisingToAGivenDegreeTest() throws Exception {
        int expected = 196;
        int actual = powerCalculatorService.raisingToAGivenDegree(14, 2);
        assertEquals(expected, actual, "[ERROR]");
    }
    @Test
    void raisingToAGivenDegreeIfNumbersAreLessThanZeroTest() throws Exception {
        assertThrows(Exception.class,() -> {
            powerCalculatorService.raisingToAGivenDegree(-2,-1);
        });

    }
}