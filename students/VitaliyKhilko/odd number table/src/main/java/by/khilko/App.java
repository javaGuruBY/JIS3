package by.khilko;

import by.khilko.service.DoWhileOddChecker;
import by.khilko.service.ForOddChecker;
import by.khilko.service.WhileOddChecker;

public class App {
    public static void main(String[] args) {

        ForOddChecker service = new ForOddChecker();
        service.getNumbersFor(3, 56);

        WhileOddChecker serviceTwo = new WhileOddChecker();
        serviceTwo.getNumbersWhile(5, 19);

        DoWhileOddChecker serviceThree = new DoWhileOddChecker();
        serviceThree.getNumbersDoWhile(12, 66);
    }
}
