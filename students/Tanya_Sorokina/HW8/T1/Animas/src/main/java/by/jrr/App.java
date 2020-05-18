package by.jrr;

import by.jrr.bean.*;
import by.jrr.service.*;

public class App {
    public static void main(String[] args) {
        Animals animal1 = new Animals("Unknown animal", 55, 2);
        AnimalService animalService = new AnimalService();
        animalService.pintInformationAboutAnimal(animal1);
        animalService.eat(animal1);
        animalService.sleep(animal1);
        animalService.voice(animal1);

        System.out.println();
        Animals mammal1 = new Mammal("Any mammal", 102, 5);
        MammalService mammalService = new MammalService();
        mammalService.pintInformationAboutAnimal(mammal1);
        mammalService.eat(mammal1);
        mammalService.sleep(mammal1);
        mammalService.voice(mammal1);

        System.out.println();
        Animals bird1 = new Bird("Some bird", 1055, 3);
        BirdService birdService = new BirdService();
        birdService.pintInformationAboutAnimal(bird1);
        birdService.eat(bird1);
        birdService.sleep(bird1);
        birdService.Fly(bird1);
        birdService.voice(bird1);

        System.out.println();
        Animals vasya = new Cat("Vasya", 987, 4);
        CatService catService = new CatService();
        catService.pintInformationAboutAnimal(vasya);
        catService.eat(vasya);
        catService.sleep(vasya);
        catService.badBehavior(vasya);
        catService.goodBehavior(vasya);
        catService.voice(vasya);

        System.out.println();
        Mammal dog1 = new Dog("Aza", 1589, 12);
        DogService dogService = new DogService();
        dogService.pintInformationAboutAnimal(dog1);
        dogService.eat(dog1);
        dogService.sleep(dog1);
        dogService.voice(dog1);

        System.out.println();
        Bird parrot1 = new Parrot("Kesha", 199, 1);
        ParrotService parrotService = new ParrotService();
        parrotService.pintInformationAboutAnimal(parrot1);
        parrotService.eat(parrot1);
        parrotService.Fly(parrot1);
        parrotService.sleep(parrot1);
        parrotService.voice(parrot1);

    }
}
