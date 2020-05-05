package by.mmkle.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberServiceTest {
    NumberService service;

    @BeforeEach
    public void setUp(){
        service = new NumberService();
    }

    @Test
    void rangeSum() {
        String testMesage = "Should sum numbers in range";
        int[] expected = {25, 15, 25};
        int[] starts = {3, 1, 7};
        int[] finish = {7, 5, 3};
        for (int i = 0; i < expected.length; i++){
            int actual = service.rangeSum(starts[i], finish[i]);
            assertEquals(expected[i], actual, testMesage);
        }
    }

    @Test
    void rangeEvenSum() {
        String testMesage = "Should count even numbers in range";
        int[] expected = {4, 5, 5};
        int[] starts = {2, 1, 10};
        int[] finish = {8, 10, 1};
        for (int i = 0; i < expected.length; i++){
            int actual = service.rangeEvenSum(starts[i], finish[i]);
            assertEquals(expected[i], actual, testMesage);
        }

    }
}