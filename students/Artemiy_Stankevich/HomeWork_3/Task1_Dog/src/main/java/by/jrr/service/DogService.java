package by.jrr.service;

import by.jrr.bean.Dog;
import by.jrr.repository.DogRepository;

public class DogService {

    public boolean saveDog(Dog dog) {
        DogRepository.dogList.add(dog);
        return true;
    }

    public Dog findDogByName(String dogName) {
        for(Dog oneDog: DogRepository.dogList) {
            if (oneDog.getName().equals(dogName)) {
                return oneDog;
            }
        }
        return new Dog();
    }
}
