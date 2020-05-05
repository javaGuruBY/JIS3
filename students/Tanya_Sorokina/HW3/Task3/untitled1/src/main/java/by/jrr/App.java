package by.jrr;


import by.jrr.bean.Circle;
import by.jrr.service.CircleService;

public class App {
    public static void main(String[] args) {
        Circle circle = new Circle(9);
        CircleService circleService = new CircleService();
        System.out.println(circleService.calculateArea(circle));
    }
}
