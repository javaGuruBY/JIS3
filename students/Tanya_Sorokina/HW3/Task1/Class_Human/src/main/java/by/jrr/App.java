package by.jrr;
import by.jrr.bean.Human;
import by.jrr.servise.HumanService;

public class App {
    public static void main(String[] args) {
        Human human = new Human( "Garry", 15);
        HumanService humanServise = new HumanService();
        System.out.println(humanServise.greet(human));
    }
}
