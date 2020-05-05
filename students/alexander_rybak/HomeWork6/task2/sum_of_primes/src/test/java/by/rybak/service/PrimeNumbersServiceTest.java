package by.rybak.service;

import by.rybak.bean.PrimeNumbers;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrimeNumbersServiceTest {
    PrimeNumbers numbers;
    PrimeNumbersService service;

    @BeforeEach
    public void initialization() {
        numbers = new PrimeNumbers();
        service = new PrimeNumbersService();
    }

    @Test
    void sumOfPrimes() {
        int[] expected = {5501, 50};
        int[] actual = service.sumOfPrimes(numbers);

        assertEquals(expected[0], actual[0], "Should return right sum!");
        assertEquals(expected[1], actual[1], "Should return right counter");
    }

    @Test
    void isPrime() {
        boolean[] actual = new boolean[4];
        actual[0] = service.isPrime(-5);
        actual[1] = service.isPrime(8);
        actual[2] = service.isPrime(9);
        actual[3] = service.isPrime(17);
        for (int i = 0; i < actual.length - 1; i++) {
            assertFalse(actual[i]);
        }
        assertTrue(actual[3]);
    }
}