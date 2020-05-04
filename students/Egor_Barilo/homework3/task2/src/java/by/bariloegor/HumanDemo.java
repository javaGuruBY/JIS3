package by.bariloegor;

import by.bariloegor.bean.Human;
import by.bariloegor.service.HumanService;

public class HumanDemo {
    public static void main(String[] args) {
        HumanService humanService = new HumanService();
        Human firstHuman = new Human("Vincent", 35);
        Human secondHuman = new Human("Jules", 40);

        humanService.greet(firstHuman);
        System.out.println();
        humanService.greet(secondHuman);
    }
}
