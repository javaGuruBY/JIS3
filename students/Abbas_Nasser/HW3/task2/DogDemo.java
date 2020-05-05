import bean.Dog;
import service.DogService;

public class DogDemo {

    public static void main(String[] args) {
        Dog dogOne = new Dog(7, "brown", "hunter");
        Dog dogTwo = new Dog(3, "Black", "Bug");
        Dog dogThree = new Dog(5, "white", "turbo");

        DogService dogService = new DogService();

        System.out.println(dogOne);
        System.out.println(dogTwo);
        System.out.println(dogThree);

        dogOne.setName("maylo");
        dogTwo.setColor("Black & white");
        dogThree.setName("bugzy");

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