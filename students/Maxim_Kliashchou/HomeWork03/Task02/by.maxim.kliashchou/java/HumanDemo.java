import bean.Human;
import service.HumanService;

public class HumanDemo {
    public static void main(String[] args) {
        Human humanOne = new Human("Max", 19);
        Human humanTwo = new Human("Eve", 20);

        HumanService humanService = new HumanService();

        humanService.greet(humanOne);
        humanService.greet(humanTwo);
    }
}