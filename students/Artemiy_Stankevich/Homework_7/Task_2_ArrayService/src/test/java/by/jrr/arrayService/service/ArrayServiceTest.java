package by.jrr.arrayService.service;

import by.jrr.arrayService.service.ArrayService;
import org.junit.jupiter.api.Test;

import javax.xml.stream.FactoryConfigurationError;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class ArrayServiceTest {
ArrayService arrayService = new ArrayService();

    @Test
    void createTest() {
        int size = 10;
        String expected = Arrays.toString(new int[size]);
        String actual = Arrays.toString(arrayService.create(size));
        assertEquals(expected, actual, "[ERROR: invalid] \n" +
                "the number of cells in size does not match the number in the created array");
    }
    @Test
    void sumTest() {
        int expected = 10;
        int actual = arrayService.sum(new int[]{1,2,3,4});
        assertEquals(expected, actual, "[ERROR]");
    }

    @Test
    void avgTest() {
        double expected = 4.5;
        double actual = arrayService.avg(new int[] {2,3,4,5,6,7});
        assertEquals(expected, actual, "[ERROR]");
    }
    @Test
    void avgTestIfArrayIsNull() {
        double expected = 0;
        double actual = arrayService.avg(new int[5]);
        assertEquals(expected, actual, "[ERROR]");
    }
}