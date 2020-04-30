package by.jrr.animals.bean;

import java.util.Objects;

public class Bird extends Animal {

    protected int speedFly;

    public Bird(String name, int age, int speedFly) {
        super(name, age);
        this.speedFly = speedFly;
    }

    public void fly() {
        System.out.println("I am fly");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Bird bird = (Bird) o;
        return speedFly == bird.speedFly;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), speedFly);
    }

    @Override
    public String toString() {
        return "Bird{" +
                "speedFly=" + speedFly +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
