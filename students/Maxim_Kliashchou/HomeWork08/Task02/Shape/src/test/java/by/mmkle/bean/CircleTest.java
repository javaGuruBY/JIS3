package by.mmkle.bean;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {
    Circle circle;
    Circle circleTest;

    @BeforeEach
    public void setUp(){
        circle = new Circle();
        circleTest = new Circle();
    }
    @Test
    void getArea() {
        String testMessage = "Should return area of circle";
        circle.setRadius(1);
        double expected = Math.PI;
        double actual = circle.getArea();
        assertEquals(expected, actual, 0, testMessage);
    }

    @Test
    void getRadius() {
        String testMessage = "Should return radius of circle";
        circle.setRadius(5);
        double expected = 5;
        double actual = circle.getRadius();
        assertEquals(expected, actual, 0, testMessage);
    }

    @Test
    void testEquals() {
        String testMessage = "Should return true if objects are equals";
        circleTest = new Circle(0, "Circle", 1);
        circle = new Circle(0, "Circle", 1);
        boolean expected = true;
        boolean actual = circleTest.equals(circle);
        assertEquals(expected, actual, testMessage);
    }

    @Test
    void testHashCode() {
        String testMessage = "Should return same hash if objects are equals";
        circleTest = new Circle(0, "Circle", 1);
        circle = new Circle(0, "Circle", 1);
        boolean expected = true;
        boolean actual = circleTest.hashCode() == circle.hashCode();
        assertEquals(expected, actual, testMessage);
    }

}