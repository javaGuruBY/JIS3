package by.jrr.service;

import by.jrr.bean.Human;
import by.jrr.repository.HumanRepository;

public class HumanService {



    public void saveHuman(Human human){
            HumanRepository.humanList.add(human);
        }

        public Human greet(Human human) {

            System.out.println("Hi! My name is " + human.getName()+ ", I'm "
                        + human.getAge() + " years old");
            return human;
        }
}

