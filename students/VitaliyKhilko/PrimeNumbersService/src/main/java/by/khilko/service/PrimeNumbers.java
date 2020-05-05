package by.khilko.service;


import java.util.Arrays;
import java.util.List;

public class PrimeNumbers {

    public List<Integer> getSumOfPrimes(){
        int sumPrimes = 0;
        int numberPrimes = 0;

        for (int i = 1; i <= 500; i++) {
            if (i == 17 || i == 71) {
                continue;
            }
            if (isPrimeNumber(i)) {
                sumPrimes += i;
                numberPrimes++;
            }
            if (numberPrimes == 50) {
                break;
            }
        }
        return Arrays.asList(sumPrimes, numberPrimes);
    }


    private boolean isPrimeNumber(int number) {
        if (number == 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++){
            if (number % i == 0){
                return false;
            }
        }
        return true;
    }

}

