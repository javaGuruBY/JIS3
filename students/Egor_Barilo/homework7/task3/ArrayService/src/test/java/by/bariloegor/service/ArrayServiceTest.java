package by.bariloegor.service;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ArrayServiceTest {
    private ArrayService arrayService;

    @Before
    public void setUp(){
        arrayService = new ArrayService();
    }

    @Test
    public void createTest() {
        int[] size = {5,9};
        for (int value : size) {
            int[] expected = new int[value];
            int[] actual = arrayService.create(value);
            assertEquals("Should create array with setted size.", expected.length, actual.length);
        }

    }

    @Test
    public void printArrayTest() {
        String[] expected = {"1 2 3 4 5 ","5 4 3 2 "};
        int[][] arrays = {{1,2,3,4,5}, {5,4,3,2}};
        for(int i = 0; i < expected.length; i++){
            String actual = arrayService.printArray(arrays[i]);
            assertEquals("Should print array.", expected[i], actual);
        }
    }

    @Test
    public void sumTest() {
        int[] expected = {25, 100};
        int[][] arrays = {{5, 10, 7, 3}, {20,50,15,15}};
        for(int i = 0; i < expected.length; i++){
            int actual = arrayService.sum(arrays[i]);
            assertEquals("Should count sum of array numbers.", expected[i], actual);
        }
    }

    @Test
    public void avgTest() {
        double[] expected = {5.0, 6.0};
        int[][] arrays = {{5,4,2,9,5},{2,9,5,12,2}};
        for(int i = 0; i < expected.length; i++){
            double actual = arrayService.avg(arrays[i]);
            assertEquals("Should count AVG of array number.", expected[i], actual, 0);
        }
    }
    
    @Test
    public void sortTest(){
        int[][] expected = {{1,2,3,4,5}, {-20,-10,0,10,20}};
        int[][] arrays = {{2,5,3,1,4}, {0, 10, -10, 20, -20}};
        for(int i = 0; i < expected.length; i++){
            arrayService.sort(arrays[i]);
            int[] actual = arrays[i];
            assertArrayEquals("Should sort array.", expected[i], actual);
        }
    }
    
    @Test
    public void swapTest(){
        int[][] expected = {{5,6,7,8,9}, {10,20,30,40,50}};
        int[][] arrays = {{9,8,7,6,5}, {50,40,30,20,10}};
        for(int i = 0; i < expected.length; i++){
            arrayService.swap(arrays[i]);
            int[] actual = arrays[i];
            assertArrayEquals("Should swap array.", expected[i], actual);
        }
    }
}