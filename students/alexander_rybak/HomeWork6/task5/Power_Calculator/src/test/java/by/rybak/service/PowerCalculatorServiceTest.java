package by.rybak.service;

import by.rybak.bean.PowerCalculator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PowerCalculatorServiceTest {
    PowerCalculator calculator;
    PowerCalculatorService service;
    
    @BeforeEach
    public void setUo(){
        calculator = new PowerCalculator(3);
        service = new PowerCalculatorService();
    }

    @Test
    void pow() {
        double expected = 27.0;
        double actual = service.pow(calculator,3);
        assertEquals(expected, actual);

        double expected1 = 3.0;
        double actual1 = service.pow(calculator,-3);
        assertEquals(expected1, actual1);
        
    }
}