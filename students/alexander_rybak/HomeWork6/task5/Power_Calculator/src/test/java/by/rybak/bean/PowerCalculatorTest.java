package by.rybak.bean;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PowerCalculatorTest {
    PowerCalculator calculator;

    @BeforeEach
    public void setUp(){
        calculator = new PowerCalculator(3);
    }

    @Test
    void getNumber() {
        double expected = 3;
        double actual = calculator.getNumber();

        assertEquals(expected, actual);
    }

    @Test
    void setNumber() {
        double expected = 9;
        calculator.setNumber(9);
        double actual = calculator.getNumber();

        assertEquals(expected, actual);
    }

    @Test
    void testEquals() {
        PowerCalculator calculation1 = new PowerCalculator(3);
        boolean actual = calculator.equals(calculation1);
        boolean actual1 = calculator.equals(calculator);

        PowerCalculator calculation2 = new PowerCalculator();
        boolean actual2 = calculation2.equals(calculation1);

        PowerCalculator calculation3 = new PowerCalculator(4);
        boolean actual3 = calculation3.equals(calculation1);

        assertTrue(actual);
        assertTrue(actual1);
        assertFalse(actual2);
        assertFalse(actual3);
    }

    @Test
    void testToString() {
        String expected = "PowerCalculator{number=3.0}";
        String actual = calculator.toString();

        assertEquals(expected, actual);
    }
}