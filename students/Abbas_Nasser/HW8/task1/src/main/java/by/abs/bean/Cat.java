package by.abs.bean;

import java.util.Objects;

public class Cat extends Mammal {
    private String color;
    private int age;

    @Override
    public String toString() {
        return "Cat{" +
                "color='" + color + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Cat cat = (Cat) o;
        return age == cat.age &&
                Objects.equals(color, cat.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), color, age);
    }

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

    public Cat() {
    }

    public Cat(boolean isHungry, int weight, String food, double boundaries, double location,
               int numberOfLegs, String color, int age) {
        super(isHungry, weight, food, boundaries, location, numberOfLegs);
        this.color = color;
        this.age = age;
    }

    @Override
    void produceMilk() {
        System.out.println("the cat is feeding her kitten");
    }

    @Override
    void makeNoise() {
        System.out.println("meow");
    }

    @Override
    void eat() {
        System.out.println("ammm ammm naamm");
    }

    @Override
    void sleep() {
        System.out.println("zzzzzzzzzzz");
    }

    @Override
    void roam() {
        System.out.println("the cat is jumping on the tree");
    }
}
