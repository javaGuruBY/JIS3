package by.mmkle.bean;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleTest {
    Triangle triangle;
    Triangle triangleTest;



    @BeforeEach
    public void setUp(){
        triangle = new Triangle();
        triangleTest = new Triangle();
    }
    @Test
    void getArea() {
        String testMessage = "Should return area of triangle";
        triangle.setFirstSide(3);
        triangle.setSecondSide(4);
        triangle.setThirdSide(5);
        double expected = 6;
        double actual = triangle.getArea();
        assertEquals(expected, actual, 0, testMessage);
    }

    @Test
    void getAndSetTest() {
        String testMessage = "Should return triangle sides";
        triangle.setFirstSide(3);
        triangle.setSecondSide(4);
        triangle.setThirdSide(5);
        boolean expected = true;
        boolean actual = triangle.getFirstSide() == 3 && triangle.getSecondSide() == 4 && triangle.getThirdSide() == 5;
        assertEquals(expected, actual, testMessage);
    }

    @Test
    void testEquals() {
        String testMessage = "Should return true if objects are equal";
        triangle = new Triangle(3, "Triangle", 3, 4, 5);
        triangleTest = new Triangle(3, "Triangle", 3, 4, 5);
        boolean expected = true;
        boolean actual = triangle.equals(triangleTest);
        assertEquals(expected, actual, testMessage);
    }

    @Test
    void testHashCode() {
        String testMessage = "Should return true if objects has same hash";
        triangle = new Triangle(3, "Triangle", 3, 4, 5);
        triangleTest = new Triangle(3, "Triangle", 3, 4, 5);
        boolean expected = true;
        boolean actual = triangle.hashCode() == triangleTest.hashCode();
        assertEquals(expected, actual, testMessage);
    }
}