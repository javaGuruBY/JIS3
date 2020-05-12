package by.jrr.bean;

public class Bird extends Animal {
    public Bird() {
    }

    public Bird(int age, String color, String name) {
        super(age, color, name);
    }

    @Override
    public String getColor() {
        return super.getColor();
    }

    @Override
    public void setColor(String color) {
        super.setColor(color);
    }

    @Override
    public void voice() {
        super.voice();
        System.out.println("Birds can sing");
    }

    @Override
    public void eat() {
        super.eat();
        System.out.println("Birds love cherries");
    }

    @Override
    public void sleep() {
        super.sleep();
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
