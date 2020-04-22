package by.bariloegor;

import by.bariloegor.service.OddCheckerService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class App {
    public static void main(String[] args) {
        Logger log = LoggerFactory.getLogger(App.class);
        OddCheckerService.forOddChecker();
        OddCheckerService.whileOddChecker();
        OddCheckerService.whileDoOddChecker();
    }
}
