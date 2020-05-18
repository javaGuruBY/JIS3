package by.jrr.service;
import by.jrr.bean.Animals;

public class AnimalService {
    Animals animals = new Animals();
    public void eat(Animals animals){
        System.out.println(animals.getName() +" is eating now.");
    }
    public void sleep(Animals animals){
        System.out.println(animals.getName() +" is sleeping now.");
    }

    public void pintInformationAboutAnimal(Animals animals){
        System.out.println("Hello! My name is " + animals.getName() +". My id = " + animals.getId() +  ". I am " + animals.getAge() + " years old.");
    }
    public void voice(Animals animals){
        System.out.println("Animal voice.");
    }
}
