package by.rybak.bean;

import by.rybak.interfaces.Shape;

public class Square extends AbstractShape implements Shape {
    private double side;

    public Square(double side) {
        this.side = side;
        this.name = "square";
    }

    @Override
    public String getName(){
        return name;
    }

    @Override
    public double getArea() {
        return side * side;
    }
    
}
