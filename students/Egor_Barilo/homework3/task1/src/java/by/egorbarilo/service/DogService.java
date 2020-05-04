package by.egorbarilo.service;
import by.egorbarilo.bean.Dog;

public class DogService {
    public void voice(Dog dog){
        System.out.println(dog.getName() + " said - Wuf! (Hi!)");
    }

    public void eat(Dog dog){
        System.out.println("This " + dog.getColor() + " good boy is eating - Wuf-Wuf! (Yummy!)");
    }

    public void sleep(Dog dog){
        System.out.println("This " + dog.getAge() + " years old doggy is sleeping - Wrrrruf... (Snore.)");
    }
}
