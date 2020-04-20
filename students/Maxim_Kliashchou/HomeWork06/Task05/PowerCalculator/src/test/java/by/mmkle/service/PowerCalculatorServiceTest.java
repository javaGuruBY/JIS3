package by.mmkle.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PowerCalculatorServiceTest {
    PowerCalculatorService service;

    @BeforeEach
    public void setUp(){
        service = new PowerCalculatorService();
    }

    @Test
    void pow() {
        String testMessage = "Should calculate number in power";
        long[] expected = {4, 27, 1};
        long[] numbers = {2, 3, 0};
        long[] powers = {2, 3, 0};

        for (int i = 0; i < expected.length; i++){
            long actual = service.pow(numbers[i], powers[i]);
            assertEquals(expected[i], actual, testMessage);
        }
    }
}