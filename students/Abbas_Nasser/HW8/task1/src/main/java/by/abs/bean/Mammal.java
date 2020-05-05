package by.abs.bean;

import java.util.Objects;

public  abstract class Mammal extends Animal {

    public int numberOfLegs;

    abstract void produceMilk();

    public Mammal() {
    }

    public Mammal(boolean isHungry, int weight, String food, double boundaries,
                  double location, int numberOfLegs) {
        super(isHungry, weight, food, boundaries, location);
        this.numberOfLegs = numberOfLegs;
    }

    @Override
    public String toString() {
        return "Mammal{" +
                "numberOfLegs=" + numberOfLegs +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Mammal mammal = (Mammal) o;
        return numberOfLegs == mammal.numberOfLegs;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), numberOfLegs);
    }

    public int getNumberOfLegs() {
        return numberOfLegs;
    }

    public void setNumberOfLegs(int numberOfLegs) {
        this.numberOfLegs = numberOfLegs;
    }
}
