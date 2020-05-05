package by.jrr.service;

import by.jrr.bean.Human;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HumanServiceTest {

    @Test
    void greetTest() {
        Human humanTest = new Human("TiconNescor", 25);
        HumanService humanService = new HumanService();
        String expected = "Hi! My name is TiconNescor, I'm 25 years old";

        String actual = humanService.greet(humanTest);
        assertEquals(expected, actual, "greetTest should be \"Hi! My name is TiconNescor, I'm 25 years old\"");
    }
}