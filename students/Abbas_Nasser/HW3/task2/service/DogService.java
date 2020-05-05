package service;

import bean.Dog;

    public class DogService {
        public void voice(Dog dog){
            System.out.println(dog.getName() + ": ruff ruff ruff");
        }

        public void eat(Dog dog){
            System.out.println(dog.getName() + ": am nam om nom");
        }

        public void sleep(Dog dog){
            System.out.println(dog.getName() + ": Z-z-z-z-z-z");
        }
    }

