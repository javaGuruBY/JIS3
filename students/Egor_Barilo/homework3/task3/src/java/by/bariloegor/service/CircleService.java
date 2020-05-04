package by.bariloegor.service;

import by.bariloegor.bean.Circle;

public class CircleService {
    public double calculateArea(Circle circle){
        return Math.PI * (circle.getRadius() * circle.getRadius());
    }
}
