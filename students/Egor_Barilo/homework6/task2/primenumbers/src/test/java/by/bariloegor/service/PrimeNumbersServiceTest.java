package by.bariloegor.service;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class PrimeNumbersServiceTest {
    private PrimeNumbersService primeNumbersService;

    @Before
    public void setUp(){
        primeNumbersService = new PrimeNumbersService();
    }

    @Test
    public void isNumberPrime() {
        boolean[] expected = {true, false};
        int[] numbers = {43, 4};
        for(int i = 0; i < expected.length; i++){
            boolean actual = primeNumbersService.isNumberPrime(numbers[i]);
            assertEquals("Should return is number prime.", expected[i], actual);
        }
    }

    @Test
    public void primeNumbersCalculating(){
        List<Integer> expected = Arrays.asList(50,5501);
        List<Integer> actual = primeNumbersService.primeNumbersCalculating();
        assertEquals("Should calculate sum and count of prime numbers from 1 to 500.", expected, actual);
    }
}