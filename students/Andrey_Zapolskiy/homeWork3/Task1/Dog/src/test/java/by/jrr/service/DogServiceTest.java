package by.jrr.service;

import by.jrr.bean.Dog;
import by.jrr.repository.DogRepository;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DogServiceTest {

    @Test
    void findDogByNameTest() {
        Dog expectedDog = new Dog("chappy","blue", 4);
        DogRepository.dogList.add(expectedDog);
        DogService dogService = new DogService();
        String dogName = "chappy";

        Dog actualDog = dogService.findDogByName(dogName);

        assertEquals(expectedDog, actualDog, "findDogByName should return dog chappy");
    }
}