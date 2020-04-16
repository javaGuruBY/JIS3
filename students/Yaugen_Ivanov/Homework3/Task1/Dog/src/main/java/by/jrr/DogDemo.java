package by.jrr;

import by.jrr.bean.Dog;
import by.jrr.service.DogService;

public class DogDemo {
    public static void main(String[] args) {
        Dog dog = new Dog("Baddy", 2, "black");
        DogService dogService = new DogService();
        System.out.println("My dog name is " + dog.getName() + ", he is " + dog.getAge()
                + " years old." + " His coat is " + dog.getColor() + " color.");
    }