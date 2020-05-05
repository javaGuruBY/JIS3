package by.jrr.service;

import by.jrr.bean.Circle;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleServiceTest {

    @Test
    void calculateArea() {
        Circle circle = new Circle(3);
        CircleService circleService = new CircleService();
        double expected = 28.26;
        double actuale = circleService.calculateArea(circle);
        assertEquals(expected, actuale, "[Error]");
    }
}