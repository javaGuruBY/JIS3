package by.bariloegor.bean;

import java.util.Objects;

public class Bird extends Animal{
    protected double wingLength;

    public Bird(String name, String gender, double wingLength) {
        super(name, gender);
        this.wingLength = wingLength;
    }

    public Bird() {
    }

    public double getWingLength() {
        return wingLength;
    }

    public void setWingLength(double wingLength) {
        this.wingLength = wingLength;
    }

    @Override
    public String eat(){
        return name + " eat seeds";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Bird bird = (Bird) o;
        return Double.compare(bird.wingLength, wingLength) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), wingLength);
    }

    @Override
    public String toString() {
        return "Bird{" +
                "wingLength=" + wingLength +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }
}
