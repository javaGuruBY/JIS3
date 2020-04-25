package by.rybak.bean;

public class Cat extends Mammal{
    public Cat() {
    }

    public Cat(int age, int weight) {
        super(age, weight);
    }

    public Cat(int age, int weight, int numberOfLegs) {
        super(age, weight, numberOfLegs);
    }

    @Override
    public void voice(){
        System.out.println("Cat meows...");
    }
}
