package by.jrr.animals.bean;

public class Cat extends Mammal {

    public Cat(String name, int age, String color, byte numberOfLegs) {
        super(name, age, color, numberOfLegs);
    }

    @Override
    public void eat() {
        System.out.println(name + " is eating: om-nom-nom");
    }

    @Override
    public void voice() {
        System.out.println(name + " МЯУ");
    }

    @Override
    public void sleep() {
        System.out.println("hrrrrrap");
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
