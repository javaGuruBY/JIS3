
package by.jrr.service;

import by.jrr.bean.Dog;
import org.junit.jupiter.api.Test;

import static by.jrr.repository.DogRepository.dogList;
import static org.junit.jupiter.api.Assertions.*;

class DogServiceTest {

    @Test
    void findDogByName() {
        Dog expectedDog = new Dog("Tanos", 6, "Бурдюк");
        dogList.add(expectedDog);
        DogService dogService = new DogService();
        String dogName = "Tanos";
        Dog actualDog = dogService.findDogByName(dogName);

        assertEquals(expectedDog, actualDog, "findDogByName should return dog Tanos");
    }

    @Test
    void saveDog() {
        Dog dogSave = new Dog("Vitalik", 1, "black");
        boolean expected = dogList.add(dogSave);
        DogService dogService = new DogService();
        boolean actual = dogService.saveDog(dogSave);
        assertEquals(expected, actual, "saveDog should be Dog{name='Vitalik', age=1, color='black'} ");
    }
}