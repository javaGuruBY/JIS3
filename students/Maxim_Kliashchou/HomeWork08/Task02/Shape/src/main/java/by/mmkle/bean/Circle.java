package by.mmkle.bean;

import java.io.Serializable;
import java.util.Objects;

public class Circle extends AbstractShape implements Serializable {
    private double radius;

    public Circle() {
    }

    public Circle(int numOfAngles, String name, double radius) {
        super(numOfAngles, name);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Circle circle = (Circle) o;
        return Double.compare(circle.radius, radius) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(radius);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", numOfAngles=" + numOfAngles +
                ", name='" + name + '\'' +
                '}';
    }
}
