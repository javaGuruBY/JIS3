package by.mmkle.bean;

import java.io.Serializable;
import java.util.Objects;

public class Square extends AbstractShape implements Serializable {
    private double sideLength;

    public Square() {
    }

    public Square(int numOfAngles, String name, double sideLength) {
        super(numOfAngles, name);
        this.sideLength = sideLength;
    }

    public double getSideLength() {
        return sideLength;
    }

    public void setSideLength(double sideLength) {
        this.sideLength = sideLength;
    }

    @Override
    public double getArea() {
        return sideLength * sideLength;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Square square = (Square) o;
        return Double.compare(square.sideLength, sideLength) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(sideLength);
    }

    @Override
    public String toString() {
        return "Square{" +
                "sideLength=" + sideLength +
                ", numOfAngles=" + numOfAngles +
                ", name='" + name + '\'' +
                '}';
    }
}
