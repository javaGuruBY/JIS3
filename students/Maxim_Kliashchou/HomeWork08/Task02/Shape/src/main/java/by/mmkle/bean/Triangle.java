package by.mmkle.bean;

import java.io.Serializable;
import java.util.Objects;

public class Triangle extends AbstractShape implements Serializable {
    private double firstSide;
    private double secondSide;
    private double thirdSide;

    public Triangle() {
    }

    public Triangle(int numOfAngles, String name, double firstSide, double secondSide, double thirdSide) {
        super(numOfAngles, name);
        this.firstSide = firstSide;
        this.secondSide = secondSide;
        this.thirdSide = thirdSide;
    }

    @Override
    public double getArea() {
        double p = getPerimeter() / 2;
        return Math.sqrt(p * (p - firstSide) * (p - secondSide) * (p - thirdSide));
    }

    public double getFirstSide() {
        return firstSide;
    }

    public void setFirstSide(double firstSide) {
        this.firstSide = firstSide;
    }

    public double getSecondSide() {
        return secondSide;
    }

    public void setSecondSide(double secondSide) {
        this.secondSide = secondSide;
    }

    public double getThirdSide() {
        return thirdSide;
    }

    public void setThirdSide(double thirdSide) {
        this.thirdSide = thirdSide;
    }

    private double getPerimeter() {
        return firstSide + secondSide + thirdSide;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Triangle triangle = (Triangle) o;
        return Double.compare(triangle.firstSide, firstSide) == 0 &&
                Double.compare(triangle.secondSide, secondSide) == 0 &&
                Double.compare(triangle.thirdSide, thirdSide) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstSide, secondSide, thirdSide);
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "firstSide=" + firstSide +
                ", secondSide=" + secondSide +
                ", thirdSide=" + thirdSide +
                ", numOfAngles=" + numOfAngles +
                ", name='" + name + '\'' +
                '}';
    }
}
