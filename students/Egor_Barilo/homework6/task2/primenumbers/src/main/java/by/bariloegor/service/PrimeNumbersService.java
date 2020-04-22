package by.bariloegor.service;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;
import java.util.List;

public class PrimeNumbersService {
    public boolean isNumberPrime(int number){
        if (number == 1) return false;
        for(int i = 2; i <= Math.sqrt(number); i++){
            if(number % i == 0){
                return false;
            }
        }
        return true;
    }

    public List<Integer> primeNumbersCalculating(){
        Logger log = LoggerFactory.getLogger(PrimeNumbersService.class);
        int sumOfPrimeNumbers = 0;
        int countOfPrimeNumbers = 0;
        int leftLineOfRange = 1;
        int rightLineOfRange = 500;
        for(int i = leftLineOfRange; i <= rightLineOfRange; i++){
            if(i == 17 || i == 71){
                continue;
            } else if(isNumberPrime(i)){
                String number = Integer.toString(i);
                log.info(number);
                sumOfPrimeNumbers += i;
                countOfPrimeNumbers++;
            }else if(countOfPrimeNumbers == 50){
                break;
            }
        }
        return Arrays.asList(countOfPrimeNumbers, sumOfPrimeNumbers);
    }

}
