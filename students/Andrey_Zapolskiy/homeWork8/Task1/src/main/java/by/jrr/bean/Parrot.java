package by.jrr.bean;

public class Parrot extends Bird {
    public Parrot() {
    }

    public Parrot(int age, String color, String name) {
        super(age, color, name);
    }

    @Override
    public void voice() {
        super.voice();
        System.out.println("hallelujah");
    }

    @Override
    public void eat() {
        super.eat();
        System.out.println("Gimme some fish, bro");
    }

    @Override
    public void sleep() {
        super.sleep();
        System.out.println("Too lazy to do something, good night");
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
