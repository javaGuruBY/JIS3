package by.bariloegor.bean;

import java.util.Objects;

public class Animal {
    protected String name;
    protected String gender;

    public Animal(String name, String gender) {
        this.name = name;
        this.gender = gender;
    }

    public Animal() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setMale(String gender) {
        this.gender = gender;
    }

    public String eat(){
        return name + " eat ";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return Objects.equals(name, animal.name) &&
                Objects.equals(gender, animal.gender);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, gender);
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }
}
