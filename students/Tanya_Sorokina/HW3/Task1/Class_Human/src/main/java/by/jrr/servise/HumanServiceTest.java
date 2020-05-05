package by.jrr.servise;
import by.jrr.bean.Human;

public class HumanServiceTest {

    public HumanServiceTest() {
    }

    private void assertEquals(String expected, String actual, String s) {
    }

    void greetTest() {
        Human humanTest = new Human("Varvara", 18);
        HumanService humanService = new HumanService();
        String expected = "Hi! My name is Varvara, I'm 18 years old";

        String actual = humanService.greet(humanTest);
        assertEquals(expected, actual, "greetTest should be \"Hi! My name is Varvara, I'm 18 years old\"");
    }



}
