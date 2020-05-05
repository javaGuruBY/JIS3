package by.khilko;

import by.khilko.bean.Dog;
import by.khilko.service.DogService;

public class AppDog {
    public static void main(String[] args) {
        Dog dog = new Dog("Sharik","white",2);
        DogService dogservice = new DogService();
        dogservice.saveDog(dog);

        Dog dogrepository = dogservice.findDogName("Sharik");
        System.out.println(dogrepository);
    }
}
