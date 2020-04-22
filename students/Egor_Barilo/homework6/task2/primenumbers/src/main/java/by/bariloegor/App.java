package by.bariloegor;

import by.bariloegor.service.PrimeNumbersService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class App {
    public static void main(String[] args) {
        Logger log = LoggerFactory.getLogger(App.class);
        PrimeNumbersService primeNumbersService = new PrimeNumbersService();
        String result = primeNumbersService.primeNumbersCalculating().toString();
        log.info(result);
    }
}
