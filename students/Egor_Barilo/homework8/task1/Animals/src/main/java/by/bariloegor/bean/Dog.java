package by.bariloegor.bean;

import java.util.Objects;

public class Dog extends Animal{
    private double noseLength;

    public Dog(String name, String gender, double noseLength) {
        super(name, gender);
        this.noseLength = noseLength;
    }

    public Dog() {
    }

    public double getNoseLength() {
        return noseLength;
    }

    public void setNoseLength(double noseLength) {
        this.noseLength = noseLength;
    }

    @Override
    public String eat(){
        return name + " eat bone";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Dog dog = (Dog) o;
        return Double.compare(dog.noseLength, noseLength) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), noseLength);
    }

    @Override
    public String toString() {
        return "Dog{" +
                "noseLength=" + noseLength +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }
}
