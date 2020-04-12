package service;
import bean.Human;

public class ServiceHuman {
    public void greet(Human human){
        System.out.println("Good afternoon! I have a strange Russian name " + human.getName() + ". "+ "Today I turned " + human.getAge() + " !!!");
    }
}
