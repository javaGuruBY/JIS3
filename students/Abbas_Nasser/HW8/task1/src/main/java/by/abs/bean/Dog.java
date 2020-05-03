package by.abs.bean;

import java.util.Objects;

public class Dog extends Mammal{
    private String color;
    private int age;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Dog() {
    }

    public Dog(boolean isHungry, int weight, String food, double boundaries, double location,
               int numberOfLegs, String color, int age) {
        super(isHungry, weight, food, boundaries, location, numberOfLegs);
        this.color = color;
        this.age = age;
    }

    @Override
    void makeNoise() {
        System.out.println("ruff rufff rufff");

    }

    @Override
    void eat() {
        System.out.println("ammm ammms");

    }

    @Override
    void sleep() {
        System.out.println("zzzzzzzz");
    }

    @Override
    void roam() {
        System.out.println("the dog is walking around trying to catch a bird");

    }

    @Override
    public String toString() {
        return "Dog{" +
                "color='" + color + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Dog dog = (Dog) o;
        return age == dog.age &&
                Objects.equals(color, dog.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), color, age);
    }

    @Override
    void produceMilk() {
        System.out.println("the dog is feeding her puppy");

    }
}

