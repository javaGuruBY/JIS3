package by.jrr.bean;

import static java.lang.Math.PI;

public class Circle extends AbstractShape implements Shape{

    private double radius;

    public Circle(String name, double radius){
        super(name);
        this.radius = radius;
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public double getArea() {
        return radius*radius*PI;
    }
}
