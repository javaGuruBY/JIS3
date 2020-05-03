package by.khilko;

import by.khilko.service.PowerCalculatorService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class App {
    public static void main(String[] args) {
        Logger log = LoggerFactory.getLogger(App.class);

        PowerCalculatorService service = new PowerCalculatorService();

        String getResult = Integer.toString(service.raisingGivenNumberToGivenDegreeintNumber(2,8));
        log.info(getResult);
    }
}

