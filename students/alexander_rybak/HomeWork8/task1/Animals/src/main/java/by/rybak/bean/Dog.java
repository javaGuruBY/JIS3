package by.rybak.bean;

public class Dog extends Mammal{
    public Dog() {
    }

    public Dog(int age, int weight) {
        super(age, weight);
    }

    public Dog(int age, int weight, int numberOfLegs) {
        super(age, weight, numberOfLegs);
    }

    @Override
    protected void voice(){
        System.out.println("Dog is barking...");
    }
}
