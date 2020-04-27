package by.bariloegor.bean;

import java.util.Objects;

public class Parrot extends Bird{
    private double beakLength;

    public Parrot(String name, String gender, double wingLength, double beakLength) {
        super(name, gender, wingLength);
        this.beakLength = beakLength;
    }

    public Parrot() {
    }

    public double getBeakLength() {
        return beakLength;
    }

    public void setBeakLength(double beakLength) {
        this.beakLength = beakLength;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Parrot parrot = (Parrot) o;
        return Double.compare(parrot.beakLength, beakLength) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), beakLength);
    }

    @Override
    public String toString() {
        return "Parrot{" +
                "beakLength=" + beakLength +
                ", wingLength=" + wingLength +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }
}
