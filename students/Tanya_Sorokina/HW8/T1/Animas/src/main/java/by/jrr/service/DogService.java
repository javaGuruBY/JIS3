package by.jrr.service;

import by.jrr.bean.Animals;
import by.jrr.bean.Dog;

public class DogService extends MammalService{
    Dog dog = new Dog();

    @Override
    protected void mammalInformation() {
        super.mammalInformation();
    }

    @Override
    public void eat(Animals animals) {
        System.out.println(animals.getName() +" dog is eating now.");
    }

    @Override
    public void sleep(Animals animals) {
        System.out.println(animals.getName() +" dog is sleeping on its back with its paws to the top now.");
    }

    @Override
    public void pintInformationAboutAnimal(Animals animals) {
        System.out.println("Hello! I am a dog. My name is " + animals.getName() +". My id = " + animals.getId() +  ". I am " + animals.getAge() + " years old.");
    }

    @Override
    public void voice(Animals animals) {
        System.out.println("Woof-woof.");
    }
}
