package org.example.service;

import org.example.bean.Dog;
import org.example.repository.DogRepository;

public class DogService {

    public static void saveDog(Dog dog) {
        DogRepository.dogList.add(dog);
    }

    public Dog findDogByName(String dogName){
        for (Dog someDog : DogRepository.dogList) {
            if (someDog.getName().equals(dogName)) {
                return someDog;
            }
            
        }
        return new Dog();
    }

}
