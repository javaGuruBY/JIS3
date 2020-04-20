package by.jrr.service;

import by.jrr.bean.Circle;

public class CircleService {
    public void calculateArea(Circle circle){
        double S = Math.PI * ( circle.getRadius() * circle.getRadius());
        System.out.println(S);
    }
}
