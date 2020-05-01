package by.jrr.shape.bean;

import by.jrr.shape.Interface.Shape;
import by.jrr.shape.abstractClass.AbstractShape;

public class Square extends AbstractShape implements Shape {
    private int longSide;

    public Square(String name, int longSide) {
        super(name);
        this.longSide = longSide;
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public double getArea() {
        return longSide * longSide;
    }
}
