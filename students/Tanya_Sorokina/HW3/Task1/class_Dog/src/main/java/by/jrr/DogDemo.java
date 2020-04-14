package by.jrr;
import by.jrr.bean.Dog;
import by.jrr.servise.DogService;

public class DogDemo {

    public static void main(String [] args) {

        Dog dog1 = new Dog("Bim", 5, "white");
        Dog dog2 = new Dog("Lord", 12, "red");
        DogService dogService = new DogService();

        System.out.println("My dog name is " + dog1.getName() + ", he is " + dog1.getAge()
                + " years old." + " His coat is " + dog1.getColor() + " color.");
        dog1.eat();
        dog1.voice();
        System.out.println("My dog name is " + dog2.getName() + ", he is " + dog2.getAge()
                + " years old." + " His coat is " + dog2.getColor() + " color.");
        dog2.sleep();
    }
}
