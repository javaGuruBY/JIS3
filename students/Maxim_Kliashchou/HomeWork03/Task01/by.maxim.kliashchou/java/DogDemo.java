import bean.Dog;
import service.DogService;

public class DogDemo {
    public static void main(String[] args) {
        Dog dogOne = new Dog(5, "White", "John");
        Dog dogTwo = new Dog(7, "Black", "Jessy");
        Dog dogThree = new Dog(3, "Grey", "Ann");

        DogService dogService = new DogService();

        System.out.println(dogOne);
        System.out.println(dogTwo);

        dogOne.setName("Peter");
        dogTwo.setColor("Black&White");
        dogThree.setName("Anny");

        System.out.println("Dogs after changes:");

        System.out.println(dogOne);
        System.out.println(dogTwo);
        System.out.println(dogThree);

        System.out.println("Dogs are doing something:");

        dogService.eat(dogOne);
        dogService.sleep(dogTwo);
        dogService.voice(dogThree);
    }
}