package by.bariloegor;

import by.bariloegor.service.PowerCalculatorService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class App {
    public static void main(String[] args) {
        Logger log = LoggerFactory.getLogger(App.class);
        PowerCalculatorService powerCalculatorService = new PowerCalculatorService();
        String result = Integer.toString(powerCalculatorService.exponentiation(2,4));
        log.info(result);
    }
}
