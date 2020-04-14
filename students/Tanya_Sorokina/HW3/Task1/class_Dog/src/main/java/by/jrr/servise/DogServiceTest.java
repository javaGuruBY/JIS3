package by.jrr.servise;

import by.jrr.bean.Dog;

import static by.jrr.repository.DogRepository.dogList;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class DogServiceTest {
    void saveDog() {
        Dog dogSave = new Dog("Aza", 13, "black-white");
        boolean expected = dogList.add(dogSave);
        DogService dogService = new DogService();
        boolean actual = dogService.saveDog(dogSave);
        assertEquals(expected, actual, "saveDog should be Dog{name='Aza', age=13, color='black-white'} ");
    }
}
