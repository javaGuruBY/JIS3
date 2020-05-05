package by.khilko.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PowerCalculatorServiceTest {
    private PowerCalculatorService service;

    @BeforeEach
    void setUp() {
        service = new PowerCalculatorService();
    }

    @Test
    void raisingGivenNumberToGivenDegreeintNumber() {
        String message = "Should do exponentiation";
        int expected = 256;
        int actual = service.raisingGivenNumberToGivenDegreeintNumber(2,8);
        assertEquals(expected, actual, message);
    }

}