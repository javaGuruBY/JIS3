package by.bariloegor.bean;

import org.junit.Test;

import static org.junit.Assert.*;

public class DivisionOperationTest {

    @Test
    public void compute() {
        DivisionOperation divisionOperation = new DivisionOperation();
        double[] expected = {3,4};
        double[] a = {60, 1000};
        double[] b = {20, 250};
        for(int i = 0; i < expected.length; i++){
            double actual = divisionOperation.compute(a[i], b[i]);
            assertEquals("Should return addition of a and b.", expected[i], actual, 0);
        }
    }
}