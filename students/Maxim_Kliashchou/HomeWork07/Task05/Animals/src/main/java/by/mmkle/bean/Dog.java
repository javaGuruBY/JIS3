package by.mmkle.bean;

public class Dog extends Mammal {
    public Dog(String name, int age, String color) {
        super(name, age, color);
    }

    @Override
    public String voice() {
        return "dog says woof";
    }
}
