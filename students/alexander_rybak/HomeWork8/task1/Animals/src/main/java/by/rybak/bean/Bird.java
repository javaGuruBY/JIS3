package by.rybak.bean;

public class Bird extends Animal{
    private int numberOfWings = 2;
    private int wingspan;
    public Bird() {
    }

    public Bird(int age, int weight) {
        super(age, weight);
    }

    public Bird(int age, int weight, int wingspan) {
        super(age, weight);
        this.wingspan = wingspan;
    }

    protected void flying(){
        System.out.println("Bird is flying...");
    }
}
