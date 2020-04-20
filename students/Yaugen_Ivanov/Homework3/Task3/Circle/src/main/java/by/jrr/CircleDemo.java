package by.jrr;

import by.jrr.bean.Circle;
import by.jrr.service.CircleService;

public class CircleDemo {
    
        public static void main(String[] args) {
            Circle findAreaCircle = new Circle(22);
            CircleService circle = new CircleService();
            circle.calculateArea(findAreaCircle);
        }
    
}
