package service;

import bean.Dog;

public class DogService {

    public void voice(Dog dog) {
        System.out.println("Гав-Гав-Гав");
    }
    public void eat(Dog dog) {
        System.out.println("Ням-Ням-ням");
    }
    public void sleep(Dog dog) {
        System.out.println("Хрр-р-р-р-рап");
    }
}