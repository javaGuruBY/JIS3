package by.jrr.bean;

public class Square extends AbstractShape implements Shape{

    private double sideLength;

    public Square(String name, double sideLength) {
        super(name);
        this.sideLength = sideLength;
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public double getArea() {
        return sideLength*sideLength;
    }
}
