package by.abs.bean;

import java.util.Objects;

public abstract class Animal {
    protected boolean isHungry;
    protected int weight;
   protected String food;
    protected double boundaries;
    protected double location;

    public Animal(boolean isHungry, int weight, String food, double boundaries, double location) {
        this.isHungry = isHungry;
        this.weight = weight;
        this.food = food;
        this.boundaries = boundaries;
        this.location = location;
    }

    public Animal() {
    }


    abstract void makeNoise();
    abstract void eat();
    abstract void sleep();
    abstract void roam();

    @Override
    public String toString() {
        return "Animal{" +
                "isHungry=" + isHungry +
                ", weight=" + weight +
                "food=" + food +
                ", boundaries=" + boundaries +
                ", location=" + location +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return isHungry == animal.isHungry &&
                weight == animal.weight &&
               food == animal.food &&
                Double.compare(animal.boundaries, boundaries) == 0 &&
                Double.compare(animal.location, location) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(isHungry, weight, food, boundaries, location);
    }

    public boolean isHungry() {
        return isHungry;
    }

    public void setHungry(boolean hungry) {
        isHungry = hungry;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public double getBoundaries() {
        return boundaries;
    }

    public void setBoundaries(double boundaries) {
        this.boundaries = boundaries;
    }

    public double getLocation() {
        return location;
    }

    public void setLocation(double location) {
        this.location = location;
    }

}
