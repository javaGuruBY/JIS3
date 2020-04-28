package by.bariloegor;

import by.bariloegor.bean.Circle;
import by.bariloegor.bean.Shape;
import by.bariloegor.bean.Square;
import by.bariloegor.bean.Triangle;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class App {
    public static void main(String[] args) {
        Logger log = LoggerFactory.getLogger(App.class);
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle("Circle", 2.3);
        shapes[1] = new Square("Square", 5);
        shapes[2] = new Triangle("Triangle", 10, 7);
        for(Shape shape : shapes){
            String shapeInfo = shape.getName() + " " + shape.getArea();
            log.info(shapeInfo);
        }
    }
}
