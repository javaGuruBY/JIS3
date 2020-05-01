package by.jrr.shape;

import by.jrr.shape.Interface.Shape;
import by.jrr.shape.bean.Circle;
import by.jrr.shape.bean.Square;
import by.jrr.shape.bean.Triangle;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class App {
    public static void main(String[] args) {
        Logger logger = LoggerFactory.getLogger(App.class);
        Shape [] shapes = new Shape[3];
        shapes[0] = new Square("Malevich_Square", 8);
        shapes[1] = new Triangle("Bermudian", 10, 7);
        shapes[2] = new Circle("Pentagrama", 4.5);

        for (Shape shape: shapes
             ) {
            logger.info(shape.getName() + " : " + shape.getArea());
        }
    }
}
