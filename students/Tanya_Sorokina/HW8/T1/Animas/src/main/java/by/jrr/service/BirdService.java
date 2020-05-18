package by.jrr.service;

import by.jrr.bean.Animals;
import by.jrr.bean.Bird;

public class BirdService extends AnimalService{
    Bird bird = new Bird();

    protected void birdInformation(){
        System.out.println("Class feature - can fly.");
    }

    public void Fly(Animals animals){
        System.out.println(animals.getName() + " is flying now.");
    }

    @Override
    public void eat(Animals animals) {
        System.out.println(animals.getName() + " is eating now.");
    }

    @Override
    public void sleep(Animals animals) {
        System.out.println(animals.getName() + " sleep sitting on a branch");
    }

    @Override
    public void pintInformationAboutAnimal(Animals animals) {
        super.pintInformationAboutAnimal(animals);
    }

    @Override
    public void voice(Animals animals) {
        System.out.println("Birds voice.");
    }
}
