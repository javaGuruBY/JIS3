package org.example;

import org.example.bean.Dog;
import org.example.service.DogService;

public class App {
    public static void main(String[] args) {
        Dog dog = new Dog(3, "black", "Chappi");
        DogService dogService = new DogService();
        DogService.saveDog(dog);

        Dog dogFromRepository = dogService.findDogByName("Chappi");
        System.out.println(dogFromRepository);
    }
}
