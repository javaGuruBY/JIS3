package by.bariloegor.bean;

import java.util.Objects;

public class Triangle extends AbstractShape implements Shape {
    private double base;
    private double high;

    public Triangle(String name, double base, double high) {
        super(name);
        this.base = base;
        this.high = high;
    }

    @Override
    public double getArea(){
        return (base * high) / 2;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Triangle triangle = (Triangle) o;
        return Double.compare(triangle.base, base) == 0 &&
                Double.compare(triangle.high, high) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), base, high);
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "base=" + base +
                ", high=" + high +
                ", name='" + name + '\'' +
                ", area=" + area +
                '}';
    }
}
