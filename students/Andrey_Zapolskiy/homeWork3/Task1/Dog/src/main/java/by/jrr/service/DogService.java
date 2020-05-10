package by.jrr.service;

import by.jrr.bean.Dog;
import by.jrr.repository.DogRepository;

public class DogService {
    public void saveDog(Dog dog){
        DogRepository.dogList.add(dog);
    }
    public Dog findDogByName(String dogName){
        for(Dog oneDog: DogRepository.dogList) {
            if (oneDog.getName().equals(dogName)) {
               return oneDog;
//                return new Dog("holy","green",5);
            }
        }
        return new Dog();

    }
}

