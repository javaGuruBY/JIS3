package by.rybak.bean;

import by.rybak.interfaces.Shape;

public class Circle extends AbstractShape implements Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
        this.name = "circle";
    }

    @Override
    public String getName(){
        return name;
    }
    
    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
    
}
