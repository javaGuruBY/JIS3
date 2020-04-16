package by.jrr;

import by.jrr.bean.Dog;
import by.jrr.service.DogService;
import org.junit.jupiter.api.Test;

import static by.jrr.repository.DogRepository.dogList;

class DogServiceTest {

    @Test
    public void findDogByName() {
        Dog expectedDog = new Dog("Baddy", 2, "Black");
        dogList.add(expectedDog);
        DogService dogService = new DogService();
        String dogName = "Tanos";
        Dog actualDog = dogService.findDogByName(dogName);

        assertEquals(expectedDog, actualDog, "findDogByName should return dog Baddy");
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
