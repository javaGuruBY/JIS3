package by.jrr.service;
import by.jrr.bean.Circle;
import static by.jrr.bean.Circle.PI;

public class CircleService {

    public  double calculateArea(Circle circle) {
        return circle.getRadius() * circle.getRadius() * PI ;
    }
}
