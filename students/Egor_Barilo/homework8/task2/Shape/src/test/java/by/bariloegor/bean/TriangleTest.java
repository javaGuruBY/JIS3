package by.bariloegor.bean;

import org.junit.Test;

import static org.junit.Assert.*;

public class TriangleTest {

    @Test
    public void getAreaTest() {
        double[] expected = {25, 300};
        double[] bases = {10, 20};
        double[] highers = {5, 30};
        for(int i = 0; i < expected.length; i++){
            Triangle triangle = new Triangle("Triangle", bases[i], highers[i]);
            double actual = triangle.getArea();
            assertEquals("Should return area of Triangle.", expected[i], actual, 0);
        }
    }
}