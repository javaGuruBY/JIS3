package by.mmkle.bean;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquareTest {
    Square square;
    Square squareTest;

    @BeforeEach
    public void setUp(){
        square = new Square();
        squareTest = new Square();
    }
    @Test
    void getArea() {
        String testMessage = "Should return area of square";
        square.setSideLength(2);
        double expected = 4;
        double actual = square.getArea();
        assertEquals(expected, actual, 0, testMessage);
    }

    @Test
    void getSideLength() {
        String testMessage = "Should return side length of square";
        square.setSideLength(2);
        double expected = 2;
        double actual = square.getSideLength();
        assertEquals(expected, actual, 0, testMessage);
    }

    @Test
    void testEquals() {
        String testMessage = "Should return true if objects are equals";
        squareTest = new Square(4, "Square", 2);
        square = new Square(4, "Square", 2);
        boolean expected = true;
        boolean actual = squareTest.equals(square);
        assertEquals(expected, actual, testMessage);
    }

    @Test
    void testHashCode() {
        String testMessage = "Should return same hash";
        squareTest = new Square(4, "Square", 2);
        square = new Square(4, "Square", 2);
        boolean expected = true;
        boolean actual = square.hashCode() == squareTest.hashCode();
        assertEquals(expected, actual, testMessage);
    }
}