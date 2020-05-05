package by.abs.bean;

import java.util.Objects;

public class Parrot extends Bird {
    private String color;
    private int age;



    @Override
   void makeAnEgg() {
        System.out.println("the bird is making an egg");

    }

    @Override
    void makeNoise() {
        System.out.println("the parrot is singing");

    }

    @Override
    void eat() {
        System.out.println("the bird is eating worms");

    }

    @Override
    void sleep() {
        System.out.println("zzzzzzzzz");

    }

    @Override
    public String toString() {
        return "Parrot{" +
                "color='" + color + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Parrot parrot = (Parrot) o;
        return age == parrot.age &&
                Objects.equals(color, parrot.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), color, age);
    }

    @Override
    void roam() {
        System.out.println("the bird is flying");

    }
}
