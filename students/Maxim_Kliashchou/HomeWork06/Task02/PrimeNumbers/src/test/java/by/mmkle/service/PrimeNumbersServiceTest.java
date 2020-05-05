package by.mmkle.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PrimeNumbersServiceTest {
    PrimeNumbersService service;

    @BeforeEach
    public void setUp(){
        service = new PrimeNumbersService();
    }

    @Test
    void sumOfPrimeNumbers() {
        String testMesage = "";
        List<Integer> expected = Arrays.asList(5501, 50);
        List<Integer> actual = service.sumOfPrimeNumbers();
        assertEquals(expected, actual, testMesage);
    }
}