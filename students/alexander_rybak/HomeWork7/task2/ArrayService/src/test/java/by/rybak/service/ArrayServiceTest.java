package by.rybak.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class ArrayServiceTest {
    ArrayService service;

    @BeforeEach
    void setUp() {
        service = new ArrayService();
    }

    @Test
    void create() {
        int size = 3;
        String expected = Arrays.toString(new int[size]);
        String actual = Arrays.toString(service.create(size));

        assertEquals(expected, actual);
    }

    @Test
    void sum() {
        int expected = 15;
        int actual = service.sum(new int[]{1,2,3,4,5});

        assertEquals(expected, actual);
    }

    @Test
    void avg() {
        double[] expected = {0, 6};
        double[] actual = new double[expected.length];
        actual[0] = service.avg(new int[5]);
        actual[1] = service.avg(new int[]{12,7,2,3});

        assertEquals(expected[0], actual[0]);
        assertEquals(expected[1], actual[1]);
    }
}