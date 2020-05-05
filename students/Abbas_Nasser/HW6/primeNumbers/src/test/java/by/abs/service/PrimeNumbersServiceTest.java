package by.abs.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PrimeNumbersServiceTest {
    PrimeNumbersService service;

    @BeforeEach
    void setUp() {
        service = new PrimeNumbersService();
    }

    @Test
    void sumOfPrimeNumbers() {

        String testMessage = "must return 5501, 50";
      List<Integer> expected = Arrays.asList(5501, 50);
      List<Integer> actual = service.sumOfPrimeNumbers();
      assertEquals(expected, actual, testMessage);
    }
}