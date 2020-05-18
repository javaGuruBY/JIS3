package by.jrr.bean;

public class AbstractShape implements Shape {
    private String name;

    public AbstractShape(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public double getArea() {
        return 0;
    }
}
