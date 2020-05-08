package by.abs.bean;

public class Triangle extends AbstractShape{

private double side1;
private double side2;
private double side3;


    public Triangle(String name, double side1, double side2, double side3) {
        super(name);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public Triangle() {
    }



    private double getPerimeter(){
        return side1 + side2 + side3;
    }

    @Override
    public double getArea() {
        double p = getPerimeter() / 2;
        return Math.sqrt( p * ( p - side1) + ( p - side2) + ( p - side3));

    }
}
