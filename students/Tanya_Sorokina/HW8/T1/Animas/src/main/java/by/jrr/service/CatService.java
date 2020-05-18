package by.jrr.service;

import by.jrr.bean.Animals;
import by.jrr.bean.Cat;

public class CatService extends MammalService{
    Cat cat = new Cat();


    public void badBehavior(Animals animals){
        System.out.println(animals.getName() + "sharpens claws on a new sofa.");
    }

    public void goodBehavior(Animals animals){
        System.out.println(animals.getName() + " catches mice.");
    }

    @Override
    protected void mammalInformation() {
        super.mammalInformation();
    }

    @Override
    public void eat(Animals animals) {
        System.out.println(animals.getName() +" cat is eating now.");
    }

    @Override
    public void sleep(Animals animals) {
        System.out.println(animals.getName() +" cat is sleeping curled up now.");
    }

    @Override
    public void pintInformationAboutAnimal(Animals animals) {
        System.out.println("Hello! I am a cat. My name is " + animals.getName() +". My id = " + animals.getId() +  ". I am " + animals.getAge() + " years old.");
    }

    @Override
    public void voice(Animals animals) {
        System.out.println("Meyy.");
    }
}
