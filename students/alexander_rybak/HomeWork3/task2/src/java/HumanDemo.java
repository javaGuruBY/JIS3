import bean.*;
import service.*;


public class HumanDemo {
    public static void main(String[] args) {
        Human alex = new Human("Alex", 19);
        HumanService humanService = new HumanService();

        humanService.greet(alex);
    }
}