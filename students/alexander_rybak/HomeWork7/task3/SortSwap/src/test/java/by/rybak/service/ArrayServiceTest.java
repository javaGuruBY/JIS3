package by.rybak.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

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
        int actual = service.sum(new int[]{1, 2, 3, 4, 5});

        assertEquals(expected, actual);
    }

    @Test
    void avg() {
        double[] expected = {0, 6};
        double[] actual = new double[expected.length];
        actual[0] = service.avg(new int[5]);
        actual[1] = service.avg(new int[]{12, 7, 2, 3});

        assertEquals(expected[0], actual[0]);
        assertEquals(expected[1], actual[1]);
    }

    @Test
    void sort() {
        int[] mas = new int[]{1, 4, 6, 7, 45, 23, 2, -32, 6, 0};
        int[] expected = {-32, 0, 1, 2, 4, 6, 6, 7, 23, 45};
        service.sort(mas);
        int[] actual = mas;

        assertArrayEquals(expected, actual);
    }

    @Test
    void swap() {
        int[] mas = new int[]{1, 4, 6, 7, 45, 23, 2, -32, 6, 0};
        int[] expected = {0, 6, -32, 2, 23, 45, 7, 6, 4, 1};
        service.swap(mas);
        int[] actual = mas;

        assertArrayEquals(expected, actual);
    }
}