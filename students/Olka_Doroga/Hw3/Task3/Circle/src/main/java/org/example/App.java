package org.example;

import org.example.bean.Circle;
import org.example.service.CircleService;

public class App {
    public static void main(String[] args) {
        Circle circle = new Circle(2);
        CircleService circleService = new CircleService();

        System.out.println(circleService.calculateArea(circle));
    }

}
