package org.example.service;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class ArrayServiceTest {

    @Test
    void create() {
        ArrayService array = new ArrayService();
        int[][] expected = {{0,0,0}, {0}, {}};
        int[] size = {3,1,0};
        for (int i = 0; i < expected.length; i++) {
            int[] actual = array.create(size[i]);
            assertEquals(Arrays.toString(expected[i]), Arrays.toString(actual), "create");
        }
    }

    @Test
    void sum() {
        ArrayService array = new ArrayService();
        int[] expected = {20, 4, 12};
        int[][] input = {{12,4,4}, {1,3}, {12, -1, -2, 3}};
        for (int i = 0; i < expected.length; i++) {
            int actual = array.sum(input[i]);
            assertEquals(expected[i], actual, "sum");
        }
    }

    @Test
    void avg() {
        ArrayService array = new ArrayService();
        double[] expected = {10, 13, 0};
        int[][] input = {{5,15,10}, {3, 12, 24}, {}};
        for (int i = 0; i < expected.length; i++) {
            double actual = array.avg(input[i]);
            assertEquals(expected[i], actual, "avg");
        }
    }
}