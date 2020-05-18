package by.jrr.service;

import by.jrr.bean.Animals;
import by.jrr.bean.Mammal;

import java.util.Objects;

public class MammalService extends AnimalService{
    Mammal mammal = new Mammal();

    protected void mammalInformation(){
        System.out.println("Class feature - feeding of cubs with milk.");
    }

    @Override
    public void eat(Animals animals) {
        System.out.println(animals.getName() +" mammal is eating now.");
    }

    @Override
    public void sleep(Animals animals) {
        System.out.println(animals.getName() +" mammal is sleeping now.");
    }

    @Override
    public void pintInformationAboutAnimal(Animals animals) {
        System.out.println("Hello! I am Mammal. My name is " + animals.getName() +". My id = " + animals.getId() +  ". I am " + animals.getAge() + " years old.");
    }

    @Override
    public void voice(Animals animals) {
        System.out.println("Mammal voice.");
    }
}
