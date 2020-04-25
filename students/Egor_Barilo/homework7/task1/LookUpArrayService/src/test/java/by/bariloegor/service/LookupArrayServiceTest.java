package by.bariloegor.service;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class LookupArrayServiceTest {
    private LookupArrayService lookupArrayService;

    @Before
    public void setUp(){
        lookupArrayService = new LookupArrayService();
    }

    @Test
    public void findMax() {
        int[][] array = {{2,25,4,0}, {90,53,2,1}};
        int[] expected = {25,90};
            for(int j = 0; j < array.length; j++){
                int actual = lookupArrayService.findMax(array[j]);
                assertEquals("Should find max number.", expected[j], actual);
            }
    }

    @Test
    public void findMin() {
        int[][] array = {{100,6,2,19,53},{4,63,19,20,33}};
        int[] expected = {2,4};
        for(int i = 0; i < array.length; i++){
                int actual = lookupArrayService.findMin(array[i]);
                assertEquals("Should find min number.", expected[i], actual);
        }
    }

    @Test
    public void indexOfMax() {
        int[][] array = {{2,25,4,0}, {90,53,2,1}};
        int[] expected = {1,0};
        for(int i = 0; i < array.length; i++){
            int actual = lookupArrayService.indexOfMax(array[i]);
            assertEquals("Should find index of max number.", expected[i], actual);
        }
    }

    @Test
    public void indexOfMin() {
        int[][] array = {{2,25,4,0}, {90,53,2,1}};
        int[] expected = {3,3};
        for(int i = 0; i < array.length; i++){
            int actual = lookupArrayService.indexOfMin(array[i]);
            assertEquals("Should find index of min number.", expected[i], actual);
        }
    }

    @Test
    public void indexOf() {
        int[][] array = {{2,25,4,0}, {90,53,2,1}};
        int[] value = {4,1};
        int[] expected = {2,3};
        for(int i = 0; i < array.length; i++){
            int actual = lookupArrayService.indexOf(array[i], value[i]);
            assertEquals("Should find index of min number.", expected[i], actual);
        }
    }
}