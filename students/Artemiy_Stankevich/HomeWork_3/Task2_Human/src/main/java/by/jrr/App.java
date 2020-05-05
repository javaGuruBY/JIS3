package by.jrr;

import by.jrr.bean.Human;
import by.jrr.service.HumanService;

public class App {
    public static void main(String[] args) {
        Human human = new Human("Ticon", 25);
        HumanService humanService = new HumanService();
        System.out.println(humanService.greet(human));
    }
}
