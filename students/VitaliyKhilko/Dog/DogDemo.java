import bean.Dog;
import service.ServiceDog;

public class DogDemo {
    public static void main(String[] args) {
        System.out.println("---------------------------------------------------");
        Dog dog1 = new Dog("Шарик", "Серый", 3);
        ServiceDog service = new ServiceDog();
        service.gret(dog1);
        dog1.voice();
        dog1.eat();
        dog1.voice();
        dog1.sleep();
        System.out.println("---------------------------------------------------");
        Dog dog2 = new Dog("Рекс", "Рыжий", 4);
        ServiceDog service2 = new ServiceDog();
        service2.gret(dog2);
        dog2.voice();
        dog2.eat();
        dog2.voice();
        dog2.sleep();
        System.out.println("---------------------------------------------------");
        Dog dog3 = new Dog("Шарик", "Белый", 7);
        ServiceDog service3 = new ServiceDog();
        service3.gret(dog3);

    }
}