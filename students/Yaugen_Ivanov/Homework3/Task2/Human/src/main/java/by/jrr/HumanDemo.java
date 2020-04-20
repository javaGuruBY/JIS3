package by.jrr;

import by.jrr.bean.Human;
import by.jrr.service.HumanService;

public class HumanDemo {
    public static void main(String[] args) {
        System.out.println();
        Human menOne = new Human("Yaugen",31);
        HumanService service = new HumanService();
        service.greet(menOne);
        System.out.println();
        Human menTwo = new Human("Petr",25);
        HumanService service2 = new HumanService();
        service2.greet(menTwo);
        System.out.println();
        Human humanThree = new Human("Anna",12);
        HumanService service3 = new HumanService();
        service3.greet(humanThree);
        System.out.println();
    }
}