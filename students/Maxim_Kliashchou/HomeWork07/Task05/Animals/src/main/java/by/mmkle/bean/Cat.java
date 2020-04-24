package by.mmkle.bean;

public class Cat extends Mammal {
    public Cat(String name, int age, String color) {
        super(name, age, color);
    }

    @Override
    public String voice() {
        return "cat says meow";
    }
}
