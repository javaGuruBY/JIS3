package by.jrr.service;

import by.jrr.bean.Human;

public class HumanService {

   public String greet(Human human) {
       return "Hi! My name is " + human.getName()+ ", I'm " + human.getAge() + " years old";
    }
}
