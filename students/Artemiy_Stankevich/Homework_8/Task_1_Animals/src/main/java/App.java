import by.jrr.animals.bean.*;

public class App {
    public static void main(String[] args) {
        Animal dog1 = new Dog("Chappy", 10,"black", (byte) 4);
        dog1.eat();
        dog1.voice();
        dog1.sleep();

        Animal cat1 = new Cat("Tonya", 1, "silver", (byte) 4);
        cat1.eat();
        cat1.voice();
        cat1.sleep();

        Bird bird = new Parrot("Kesha", 11, 40);
        bird.eat();
        bird.fly();

    }
}
