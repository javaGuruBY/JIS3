package by.bariloegor;

import by.bariloegor.bean.Circle;
import by.bariloegor.service.CircleService;

public class CircleDemo {
    public static void main(String[] args) {
        CircleService circleService = new CircleService();
        Circle firstCircle = new Circle(5.0);
        Circle secondCircle = new Circle(9.0);

        System.out.println("Area of first circle is " + circleService.calculateArea(firstCircle));
        System.out.println("Area of second circle is " + circleService.calculateArea(secondCircle));
    }
}
