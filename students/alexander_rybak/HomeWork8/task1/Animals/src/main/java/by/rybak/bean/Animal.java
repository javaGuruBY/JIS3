package by.rybak.bean;

import java.io.Serializable;
import java.util.Objects;

public class Animal implements Serializable {
    public int age;
    public int weight;

    public Animal() {
    }

    public Animal(int age, int weight) {
        this.age = age;
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return age == animal.age &&
                weight == animal.weight;
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, weight);
    }

    @Override
    public String toString() {
        return "Animal{" +
                "age=" + age +
                ", weight=" + weight +
                '}';
    }
}
