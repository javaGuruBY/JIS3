package by.jrr.animals.bean;

public class Dog extends Mammal {

    public Dog(String name, int age, String color, byte numberOfLegs) {
        super(name, age, color, numberOfLegs);
    }

    @Override
    public void eat() {
        System.out.println(name + " grrrr om-nom-nom");
    }

    @Override
    public void voice() {
        System.out.println("GAV");
    }

    @Override
    public void sleep() {
        System.out.println(name + " is sleep");
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
