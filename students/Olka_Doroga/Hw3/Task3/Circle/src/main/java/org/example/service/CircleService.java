package org.example.service;

import org.example.bean.Circle;

public class CircleService {
    public double calculateArea(Circle circle){
        return (3.14 * 3.14) * circle.getRadius();
    }
}
