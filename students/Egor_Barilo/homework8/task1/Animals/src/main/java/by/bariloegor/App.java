package by.bariloegor;

import by.bariloegor.bean.Dog;
import by.bariloegor.bean.Mammal;
import by.bariloegor.bean.Parrot;

public class App {
    public static void main(String[] args) {
        Dog dog = new Dog("Bobby", "Male", 1.3);
        System.out.println(dog.toString());
        System.out.println(dog.eat());
        Parrot parrot = new Parrot("Gosha", "Male", 3.3, 0.5);
        System.out.println(parrot.toString());
        System.out.println(parrot.eat());
        Mammal mammal = new Mammal("Bear", "Female", "Brown");
        System.out.println(mammal.toString());
        System.out.println(mammal.eat());
    }
}
