package by.bariloegor.bean;

import org.junit.Test;

import static org.junit.Assert.*;

public class AdditionOperationTest {

    @Test
    public void computeTest() {
        AdditionOperation additionOperation = new AdditionOperation();
        double[] expected = {80,102};
        double[] a = {20, 32};
        double[] b = {60, 70};
        for(int i = 0; i < expected.length; i++){
            double actual = additionOperation.compute(a[i], b[i]);
            assertEquals("Should return addition of a and b.", expected[i], actual, 0);
        }
    }
}