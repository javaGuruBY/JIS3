package service;

import bean.Dog;

public class DogService {
    public void voice(Dog dog){
        System.out.println(dog.getName() + ": Woof-woof-woof");
    }

    public void eat(Dog dog){
        System.out.println(dog.getName() + ": Om nom nom");
    }

    public void sleep(Dog dog){
        System.out.println(dog.getName() + ": Z-z-z-z-z-z");
    }
}