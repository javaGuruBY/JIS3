package by.khilko.service;
import by.khilko.bean.Dog;
import by.khilko.repository.DogRepository;

public class DogService {

    public void saveDog(Dog dog){
        DogRepository.dogList.add(dog);
    }

    public Dog findDogName(String dogName){
        for(Dog thisDog: DogRepository.dogList){
            if(thisDog.getName().equals(dogName)){
                return thisDog;
            }
        }
        return new Dog();
    }

    public void gret(Dog dog){
        System.out.println("Моя кличка : " + dog.getName()+ ", " + " Мой возраст : " + dog.getAge()+ ", " + " My color is : " + dog.getDogColor());
    }
}

