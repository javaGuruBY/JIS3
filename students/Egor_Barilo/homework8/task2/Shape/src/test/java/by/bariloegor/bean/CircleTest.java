package by.bariloegor.bean;

import org.junit.Test;

import static org.junit.Assert.*;

public class CircleTest {

    @Test
    public void getAreaTest() {
        double[] expected = {62832, 251327};
        double[] radius = {100, 200};
        for(int i = 0; i < expected.length; i++){
            Circle circle = new Circle("Circle", radius[i]);
            int actual = (int) Math.round(circle.getArea());
            assertEquals("Should return area of circle", expected[i], actual, 0);
        }
    }
}