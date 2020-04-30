package by.jrr.animals.bean;

public class Parrot extends Bird {
    public Parrot(String name, int age, int speedFly) {
        super(name, age, speedFly);
    }

    @Override
    public void fly() {
        System.out.println(name + " is fly!");
    }

    @Override
    public void eat() {
        System.out.println(name + " is eating");
    }

    @Override
    public void voice() {
        System.out.println(name + " is sing");
    }

    @Override
    public void sleep() {
        System.out.println("hrr");
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
