package org.example.service;

import org.example.bean.Dog;
import org.example.repository.DogRepository;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DogServiceTest {

    @Test
    void findDogByName() {
        Dog expectedDog = new Dog(3, "black", "Chappi");
        DogRepository.dogList.add(expectedDog);
        DogService dogService = new DogService();
        String dogName = "Chappi";

        Dog actualDog = dogService.findDogByName(dogName);

        assertEquals(expectedDog, actualDog, "inderDogByName should return dog Chappi");

    }
}