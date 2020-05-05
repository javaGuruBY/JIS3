package by.jrr.bean;

import com.sun.tools.attach.AgentInitializationException;

public class Dog extends Mammal{

    public Dog() {
    }

    public Dog(int age, String color, String name, int valueOfLegs) {
        super(age, color, name, valueOfLegs);
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

    @Override
    public void voice() {
        super.voice();
        System.out.println("Гав-гав");
    }

    @Override
    public void eat() {
        super.eat();
        System.out.println("Хрум-хрум");
    }

    @Override
    public void sleep() {
        super.sleep();
        System.out.println("Хрр-хрр");
    }

    public void wavingTail() {
        System.out.println("Dog waving his tail");
    }


}
