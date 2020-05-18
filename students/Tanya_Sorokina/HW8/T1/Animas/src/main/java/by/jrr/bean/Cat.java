package by.jrr.bean;

public class Cat extends Mammal{
    public Cat() {
        super();
    }

    public Cat(String name, int id, int age) {
        super(name, id, age);
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
