package by.bariloegor.bean;

import org.junit.Test;

import static org.junit.Assert.*;

public class SquareTest {

    @Test
    public void getAreaTest() {
        double[] expected = {25, 400};
        double[] sides = {5, 20};
        for(int i = 0; i < expected.length; i++){
            Square square = new Square("Square", sides[i]);
            double actual = square.getArea();
            assertEquals("Shoud return area of square.", expected[i], actual, 0);
        }
    }
}