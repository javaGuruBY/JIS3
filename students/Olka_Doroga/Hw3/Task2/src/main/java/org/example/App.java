package org.example;

import org.example.bean.Human;
import org.example.service.HumanService;

public class App {
    public static void main(String[] args) {
        Human human = new Human("John", 50);
        HumanService humanService = new HumanService();
        humanService.greet(human);

    }
}
