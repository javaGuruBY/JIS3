package by.bariloegor.bean;

import java.util.Objects;

public abstract class AbstractShape implements Shape {
    protected String name;
    protected double area;

    public AbstractShape() {
    }

    public AbstractShape(String name){
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public double getArea() {
        return this.area;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AbstractShape that = (AbstractShape) o;
        return Double.compare(that.area, area) == 0 &&
                Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, area);
    }

    @Override
    public String toString() {
        return "AbstractShape{" +
                "name='" + name + '\'' +
                ", area=" + area +
                '}';
    }
}
