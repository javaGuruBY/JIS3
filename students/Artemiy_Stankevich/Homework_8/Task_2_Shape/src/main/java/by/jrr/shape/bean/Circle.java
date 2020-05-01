package by.jrr.shape.bean;

import by.jrr.shape.Interface.Shape;
import by.jrr.shape.abstractClass.AbstractShape;

public class Circle extends AbstractShape implements Shape {

    private double radiusCircle;

    public Circle(String name, double radiusCircle) {
        super(name);
        this.radiusCircle = radiusCircle;
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public double getArea() {
        return radiusCircle * radiusCircle * Math.PI;
    }
}
