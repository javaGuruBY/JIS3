package by.rybak.bean;

public class Mammal extends Animal{
    private int numberOfLegs;
    public Mammal() {
    }

    public Mammal(int age, int weight) {
        super(age, weight);
    }

    public Mammal(int age, int weight, int numberOfLegs) {
        super(age, weight);
        this.numberOfLegs = numberOfLegs;
    }

    protected void voice(){
        System.out.println("Mammal make sound...");
    }
}
