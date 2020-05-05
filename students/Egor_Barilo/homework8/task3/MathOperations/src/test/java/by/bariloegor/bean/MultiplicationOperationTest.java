package by.bariloegor.bean;

import org.junit.Test;

import static org.junit.Assert.*;

public class MultiplicationOperationTest {

    @Test
    public void computeTest() {
        MultiplicationOperation multiplicationOperation = new MultiplicationOperation();
        double[] expected = {1200, 350};
        double[] a = {20, 5};
        double[] b = {60, 70};
        for(int i = 0; i < expected.length; i++){
            double actual = multiplicationOperation.compute(a[i], b[i]);
            assertEquals("Should return multiplication of a and b.", expected[i], actual, 0);
        }
    }
}