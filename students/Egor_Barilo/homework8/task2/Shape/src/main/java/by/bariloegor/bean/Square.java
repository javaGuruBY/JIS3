package by.bariloegor.bean;

import java.util.Objects;

public class Square extends AbstractShape implements Shape {
    private double side;

    public Square(String name, double side) {
        super(name);
        this.side = side;
    }

    @Override
    public double getArea(){
        return Math.pow(side, 2);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Square square = (Square) o;
        return Double.compare(square.side, side) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), side);
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                ", name='" + name + '\'' +
                ", area=" + area +
                '}';
    }
}
