package by.rybak;

public class DogDemo {

    public static void main(String[] args) {
        Dog firstDog = new Dog(8, "black", "John");
        Dog secondDog = new Dog(2, "white", "Peter");

        System.out.println("information about two dogs:");

        System.out.println("the first dog name is " + firstDog.getName() + " color is " + firstDog.getColor() + " age = " + firstDog.getAge());
        System.out.println("the second dog name is " + secondDog.getName() + " color is " + secondDog.getColor() + " age = " + secondDog.getAge());

        firstDog.setName("Bella");
        secondDog.setColor("red");
        secondDog.setAge(5);

        System.out.println("information about two dogs after changes:");

        System.out.println("the first dog name is " + firstDog.getName() + " color is " + firstDog.getColor() + " age = " + firstDog.getAge());
        System.out.println("the second dog name is " + secondDog.getName() + " color is " + secondDog.getColor() + " age = " + secondDog.getAge());

        firstDog.sleep();
        secondDog.eat();
        secondDog.voice();
    }
}
