package by.egorbarilo;

import by.egorbarilo.bean.Dog;
import by.egorbarilo.service.DogService;
public class DogDemo {
    public static void main(String[] args) {
        DogService dogService = new DogService();
        Dog firstDog = new Dog(4, "black", "Rax");
        Dog secondDog = new Dog(9, "brown", "Joe");

        System.out.println(firstDog);
        dogService.voice(firstDog);
        dogService.eat(firstDog);
        dogService.sleep(firstDog);
        System.out.println();

        System.out.println(secondDog);
        dogService.voice(secondDog);
        dogService.eat(secondDog);
        dogService.sleep(secondDog);
        System.out.println();

        secondDog.setAge(5);
        secondDog.setColor("white");
        System.out.println("Sorry!" + secondDog.getName() + " is " + secondDog.getColor() + " and " +
                secondDog.getAge() + " years old.");
    }
}