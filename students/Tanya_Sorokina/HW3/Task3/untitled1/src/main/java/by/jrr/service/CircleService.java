package by.jrr.service;
import by.jrr.bean.Circle;

public class CircleService {

    public double calculateArea(Circle circle) {
        return Circle.getRadius() * Circle.getRadius() * Circle.PI;
    }
}
