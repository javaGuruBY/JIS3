package by.abs.bean;

import java.util.Objects;

public abstract class Bird extends Animal {
    public boolean hasWings;
    public  boolean canFly;

    public Bird() {
    }

    public Bird(boolean isHungry, int weight, String food, double boundaries,
                double location, boolean hasWings, boolean canFly) {
        super(isHungry, weight, food, boundaries, location);
        this.hasWings = hasWings;
        this.canFly = canFly;
    }



    abstract void makeAnEgg();

    @Override
    public String toString() {
        return "Bird{" +
                "hasWings=" + hasWings +
                ", canFly=" + canFly +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Bird bird = (Bird) o;
        return hasWings == bird.hasWings &&
                canFly == bird.canFly;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), hasWings, canFly);
    }

    public boolean isHasWings() {
        return hasWings;
    }

    public void setHasWings(boolean hasWings) {
        this.hasWings = hasWings;
    }

    public boolean isCanFly() {
        return canFly;
    }

    public void setCanFly(boolean canFly) {
        this.canFly = canFly;
    }
}
