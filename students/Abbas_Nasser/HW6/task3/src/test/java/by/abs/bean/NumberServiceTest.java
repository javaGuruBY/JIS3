package by.abs.bean;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberServiceTest {

     NumberService service;
    @BeforeEach
    void setUp() {
        service = new NumberService();
    }

    @Test
    void rangeSum() {
        String testMessage = "must sum numbers in range";
        int[] expected = {9, 7, 7};
        int[] starts = {9, 2, 7};
        int[] finish = {7, 7, 3};
        for (int i = 0; i < expected.length; i++){
            int actual = service.rangeSum(starts[i], finish[i]);
            assertEquals(expected[i], actual, testMessage);
        }
    }

    @Test
    void rangeEvenCount() {
        String testMessage = "must count even numbers in range";
        int[] expected = {4, 5, 2};
        int[] starts = {2, 2, 6};
        int[] finish = {8, 10, 9};
        for (int i = 0; i < expected.length; i++){
            int actual = service.rangeEvenCount(starts[i], finish[i]);
            assertEquals(expected[i], actual, testMessage);
        }
    }
}