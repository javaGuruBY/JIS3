package by.jrr.servise;
import by.jrr.bean.Dog;
import by.jrr.repository.DogRepository;

public class DogService {
    public boolean saveDog(Dog dog) {
        DogRepository.dogList.add(dog);
        return true;
    }
}
