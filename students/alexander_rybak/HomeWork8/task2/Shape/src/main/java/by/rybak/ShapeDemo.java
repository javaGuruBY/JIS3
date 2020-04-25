package by.rybak;

import by.rybak.bean.Circle;
import by.rybak.bean.Square;
import by.rybak.bean.Triangle;

import by.rybak.interfaces.Shape;

public class ShapeDemo {

    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] =  new Circle( 3);
        shapes[1] =  new Triangle(2,3,4);
        shapes[2] =  new Square(4);
        
        for(Shape shape: shapes){
            System.out.println(shape.getName() + ": area = " + shape.getArea());
        }
    }

}
