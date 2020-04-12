package service;
import bean.Dog;

public class ServiceDog {

    public void gret(Dog dog){
        System.out.println("Моя кличка : " + dog.getName()+ ", " + " Мой возраст : " + dog.getAge()+ ", " + " My color is : " + dog.getDogColor());
    }
}
