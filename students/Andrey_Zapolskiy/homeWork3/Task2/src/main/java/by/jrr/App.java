package by.jrr;

import by.jrr.bean.Human;
import by.jrr.service.HumanService;

public class App {
    public static void main(String[] args) {
        Human human = new Human("charlie", 35);
        HumanService humanService = new HumanService();

//        humanService.saveHuman(human);
        humanService.greet(human);
    }

}
