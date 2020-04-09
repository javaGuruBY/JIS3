package by.bariloegor.service;

import by.bariloegor.bean.Human;

public class HumanService {
    public void greet(Human human){
        System.out.println("Hi!I'm " + human.getName() + " and I " + human.getAge() + " years old.");
    }
}
