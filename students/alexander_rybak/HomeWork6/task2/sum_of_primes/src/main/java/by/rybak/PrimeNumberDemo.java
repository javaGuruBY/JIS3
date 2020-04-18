package by.rybak;

import by.rybak.bean.PrimeNumbers;
import by.rybak.service.PrimeNumbersService;
import org.apache.log4j.BasicConfigurator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PrimeNumberDemo {

    public static void main(String[] args) {

        Logger logger = LoggerFactory.getLogger(PrimeNumberDemo.class);
        BasicConfigurator.configure();

        PrimeNumbers numbers = new PrimeNumbers();
        PrimeNumbersService service = new PrimeNumbersService();

        logger.info("sum = " + String.valueOf(service.sumOfPrimes(numbers)[0]) +
                "  count = " + String.valueOf(service.sumOfPrimes(numbers)[1]));
    }
}
