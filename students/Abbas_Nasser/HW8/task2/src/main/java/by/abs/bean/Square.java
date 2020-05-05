package by.abs.bean;


public class Square extends AbstractShape {
    private int numOfSides;
    private double side;

    public Square(String name, int numOfSides, double side) {
        super(name);
        this.numOfSides = numOfSides;
        this.side = side;
    }

    public Square() {
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getArea() {
        return side * side;
    }
}
