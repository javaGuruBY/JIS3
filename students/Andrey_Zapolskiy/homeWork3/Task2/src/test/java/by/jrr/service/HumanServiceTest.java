package by.jrr.service;

import by.jrr.bean.Human;
import by.jrr.repository.HumanRepository;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HumanServiceTest {

    @Test
    void greetTest() {

            Human expectedHuman = new Human("charlie", 35);

            HumanService humanService = new HumanService();
            Human actualHuman = humanService.greet(expectedHuman);


            assertEquals(expectedHuman, actualHuman, "greetTest should return charlie 35 years old");

    }
}