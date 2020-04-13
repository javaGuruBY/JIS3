package by.jrr.service;

import by.jrr.bean.Circle;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleServiceTest {

    @Test
    void calculateAreaTest() {
        Circle circle = new Circle(5);
        CircleService circleService = new CircleService();

        double expectedArea = Math.PI * Math.pow(circle.getRadius(), 2);
        double actualArea = circleService.calculateArea(circle);
        assertEquals(expectedArea, actualArea,
                "calculateAreaTest should return area of a circle = 392.6990816987241");
    }
}