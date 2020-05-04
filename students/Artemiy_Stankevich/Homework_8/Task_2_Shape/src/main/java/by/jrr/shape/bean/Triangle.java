package by.jrr.shape.bean;

import by.jrr.shape.Interface.Shape;
import by.jrr.shape.abstractClass.AbstractShape;

public class Triangle extends AbstractShape implements Shape {

    private int baseSide;
    private int height;

    public Triangle(String name, int baseSide, int height) {
        super(name);
        this.baseSide = baseSide;
        this.height = height;
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public double getArea() {
        return 0.5 * height * baseSide;
    }
}
