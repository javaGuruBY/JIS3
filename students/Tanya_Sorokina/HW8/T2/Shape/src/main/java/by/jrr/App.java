package by.jrr;

import by.jrr.bean.Circle;
import by.jrr.bean.Shape;
import by.jrr.bean.Square;
import by.jrr.bean.Triangle;

public class App {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Square("Test square", 5.5);
        shapes[1] = new Circle("Test circle", 2.5);
        shapes[2] = new Triangle("Test triangle", 2.0, 2.8);

        for (Shape shape : shapes) {

            System.out.println(shape.getName() + " : " + shape.getArea());

        }
    }
}
