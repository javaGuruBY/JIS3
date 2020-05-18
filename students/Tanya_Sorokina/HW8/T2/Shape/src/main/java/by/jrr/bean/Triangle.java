package by.jrr.bean;

public class Triangle extends AbstractShape implements Shape{

    private double triangleBase;
    private double triangleHeight;

    public Triangle(String name, double triangleBase, double triangleHeight) {
        super(name);
        this.triangleBase = triangleBase;
        this.triangleHeight = triangleHeight;
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public double getArea() {
        return 0.5 * triangleBase * triangleHeight;
    }
}
