package by.jrr.animals.bean;

import java.util.Objects;

public class Mammal extends Animal {
    private String color;
    private byte numberOfLegs;

    public Mammal(String name, int age, String color, byte numberOfLegs) {
        super(name, age);
        this.color = color;
        this.numberOfLegs = numberOfLegs;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Mammal mammal = (Mammal) o;
        return numberOfLegs == mammal.numberOfLegs &&
                Objects.equals(color, mammal.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), color, numberOfLegs);
    }

    @Override
    public String toString() {
        return "Mammal{" +
                "color='" + color + '\'' +
                ", numberOfLegs=" + numberOfLegs +
                '}';
    }
}
