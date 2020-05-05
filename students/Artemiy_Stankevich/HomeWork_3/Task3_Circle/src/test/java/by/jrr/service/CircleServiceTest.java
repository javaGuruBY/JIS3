package by.jrr.service;

import by.jrr.bean.Circle;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleServiceTest {

    @Test
    void calculateAreaTest() {
        Circle circleTest = new Circle(2);
        CircleService circleService = new CircleService();
        double expected = 12.56;
        double actual = circleService.calculateArea(circleTest);
        assertEquals(expected, actual, "[ERROR] calculateAreaTest should return 12.56");
    }
}