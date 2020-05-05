
import bean.Human;
import service.HumanService;

public class HumanDemo {
    public static void main(String[] args) {
        Human humanOne = new Human("Adam", 27);
        Human humanTwo = new Human("john", 19);

        HumanService humanService = new HumanService();

        humanService.greet(humanOne);
        humanService.greet(humanTwo);
    }
}