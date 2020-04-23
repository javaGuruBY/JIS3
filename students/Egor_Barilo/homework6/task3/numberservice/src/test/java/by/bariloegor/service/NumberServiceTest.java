package by.bariloegor.service;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class NumberServiceTest {
    private NumberService numberService;

    @Before
    public void setUp(){
        numberService = new NumberService();
    }

    @Test
    public void isSecondLineMore() {
        boolean[] expected = {true, false};
        int[] firstLineRange = {6, 3};
        int[] secondLineRange = {9, 1};
        for(int i = 0; i < expected.length; i++){
            boolean actual = numberService.isSecondLineMore(firstLineRange[i], secondLineRange[i]);
            assertEquals("Should return is second line range more than first.", expected[i], actual);
        }

    }

    @Test
    public void isNumberEven() {
        boolean[] expected = {true, false};
        int[] numbers = {6, 3};
        for(int i = 0; i < expected.length; i++){
            boolean actual = numberService.isNumberEven(numbers[i]);
            assertEquals("Should return is number even.", expected[i], actual);
        }
    }

    @Test
    public void countRangeSum() {
        int[] expected = {33, 6};
        int[] firstLineRange = {10, 1};
        int[] secondLineRange = {12, 3};
        for(int i = 0; i < expected.length; i++){
            int actual = numberService.countRangeSum(firstLineRange[i], secondLineRange[i]);
            assertEquals("Should count sum of range.", expected[i], actual);
        }
    }

    @Test
    public void countRangeEvenNumbers() {
        int[] expected = {3, 6};
        int[] firstLineRange = {2, 10};
        int[] secondLineRange = {6, 20};
        for(int i = 0; i < expected.length; i++){
            int actual = numberService.countRangeEvenNumbers(firstLineRange[i], secondLineRange[i]);
            assertEquals("Should return count of eve numbers.", expected[i], actual);
        }
    }

}