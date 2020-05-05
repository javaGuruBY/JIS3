package by.bariloegor.bean;

import org.junit.Test;

import static org.junit.Assert.*;

public class SubtractionOperationTest {

    @Test
    public void computeTest() {
        SubtractionOperation subtractionOperation = new SubtractionOperation();
        double[] expected = {80,102};
        double[] a = {140, 200};
        double[] b = {60, 98};
        for(int i = 0; i < expected.length; i++){
            double actual = subtractionOperation.compute(a[i], b[i]);
            assertEquals("Should return subtraction of a and b.", expected[i], actual, 0);
        }
    }
}