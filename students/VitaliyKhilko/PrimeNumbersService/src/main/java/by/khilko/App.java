package by.khilko;


import by.khilko.service.PrimeNumbers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;



public class App {
    public static void main(String[] args) {
        Logger logs = LoggerFactory.getLogger(App.class);

        PrimeNumbers numbers = new PrimeNumbers();
        String getResult = numbers.getSumOfPrimes().toString();

        logs.info(getResult);
    }
}
