import bean.Dog;
import service.DogService;

public class DogDemo {
    public static void main(String[] args) {
        Dog dog = new Dog();
        DogService dogService = new DogService();
        dog.setName("Bamblbee");
        dog.setAge(10);
        dog.setColor("Black");
        dogService.voice(dog);
        dogService.eat(dog);
        dogService.sleep(dog);
        System.out.println("My dog name is " + dog.getName() + ", he is " + dog.getAge() + " years old."
                + " His coat is " + dog.getColor() + " color.");
    }
}