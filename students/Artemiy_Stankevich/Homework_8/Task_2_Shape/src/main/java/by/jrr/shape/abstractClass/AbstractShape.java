package by.jrr.shape.abstractClass;

import by.jrr.shape.Interface.Shape;

public class AbstractShape implements Shape {
    private String name;

    public AbstractShape(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public double getArea() {
        return 0;
    }
}
