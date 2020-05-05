package by.rybak.bean;

public class Parrot extends Bird{
    public Parrot() {
    }

    public Parrot(int age, int weight) {
        super(age, weight);
    }

    public Parrot(int age, int weight, int wingspan) {
        super(age, weight, wingspan);
    }

    @Override
    protected void flying(){
        System.out.println("Parrot is flying...");
    }

    public void voice(){
        System.out.println("Parrot is talking...");
    }
}
