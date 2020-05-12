package by.jrr.bean;

import java.util.Objects;

public class Cat extends Mammal {
    int numberOfWhiskers;

    public int getNumberOfWhiskers() {
        return numberOfWhiskers;
    }

    public void setNumberOfWhiskers(int numberOfWhiskers) {
        this.numberOfWhiskers = numberOfWhiskers;
    }

    public Cat() {
    }

    public Cat(int age, String color, String name, int valueOfLegs) {
        super(age, color, name, valueOfLegs);
    }

    @Override
    public void voice() {
        super.voice();
        System.out.println("Meow");
    }

    @Override
    public void eat() {
        super.eat();
        System.out.println("Хрум-хрум-хрум");
    }

    @Override
    public void sleep() {
        super.sleep();
        System.out.println("Zzz-Zzz");
    }

    public void wavingTail() {
        System.out.println("Cat licking his fur");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Cat cat = (Cat) o;
        return getNumberOfWhiskers() == cat.getNumberOfWhiskers();
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getNumberOfWhiskers());
    }

    @Override
    public String toString() {
        return "Cat{" +
                "numberOfWhiskers=" + numberOfWhiskers +
                '}';
    }
}
