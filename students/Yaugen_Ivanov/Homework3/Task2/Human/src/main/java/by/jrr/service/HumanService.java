package by.jrr.service;

import by.jrr.bean.Human;

public class HumanService {
        public void greet(Human human){
            System.out.println("Hello my Name Is " + human.getName() + ". "+ "I'm turning today " + human.getAge() + " !");
        }
    }

