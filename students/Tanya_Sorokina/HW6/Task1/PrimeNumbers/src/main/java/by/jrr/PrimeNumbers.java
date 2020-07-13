package by.jrr;

import by.jrr.service.PrimeNumbersService;

public class PrimeNumbers {
    public static void main(String[] args) {
        PrimeNumbersService primeNumbersService = new PrimeNumbersService();
        int sumPrimeNumbers = 0;
        int count = 0;
        int countPrimeNumbers = 0;
        int n = 500;
        int i;
        for ( i = 2; i <= n; i++) {
            if (primeNumbersService.thisPrimeNumbers(i) || i == 2){
                if (i == 17 || i == 71) {
                    continue;
                } else sumPrimeNumbers += i;
                count++;
                if (count == 50) {
                    break;
                }
            }
        }
        System.out.println("sum: " + sumPrimeNumbers);

        for ( i = 2; i <= n; i++) {
            if (primeNumbersService.thisPrimeNumbers(i) || i == 2) {
                if (i == 17 || i == 71) {
                } else countPrimeNumbers++;
                    if(countPrimeNumbers == 50) {
                        break;
                    }
            }
        }
        System.out.println("count: " + countPrimeNumbers);
    }
}


