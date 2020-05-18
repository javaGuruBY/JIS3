package by.jrr.service;

import by.jrr.bean.Animals;
import by.jrr.bean.Parrot;

public class ParrotService extends BirdService{
    Parrot parrot = new Parrot();

    @Override
    protected void birdInformation() {
        super.birdInformation();
    }

    @Override
    public void Fly(Animals animals) {
        super.Fly(animals);
    }

    @Override
    public void eat(Animals animals) {
        super.eat(animals);
    }

    @Override
    public void sleep(Animals animals) {
        System.out.println(animals.getName() + " sleep sitting on a perch");;
    }

    @Override
    public void pintInformationAboutAnimal(Animals animals) {
        System.out.println("Hello! I am parrot. My name is " + animals.getName() +". My id = " + animals.getId() +  ". I am " + animals.getAge() + " years old.");
    }

    @Override
    public void voice(Animals animals) {
        System.out.println("You won’t believe it, but I can repeat any sounds, even a person’s voice.");
    }
}
