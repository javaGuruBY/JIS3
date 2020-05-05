package by.rybak.service;

import by.rybak.bean.PrimeNumbers;

public class PrimeNumbersService {
    
    public int[] sumOfPrimes(PrimeNumbers numbers){
        int sum = 0;
        int counter = 0;
        int[] result = new int[2];
        
        for(int i = numbers.getStart(); i < numbers.getEnd(); i++){
            if(i == 17 || i == 71){
                continue;
            }
            if(counter == 50){
                break;
            }
            if(isPrime(i)){
                sum += i;
                result[0] = sum;
                result[1] = ++counter;
            }
        }
        return result;
    }

    public boolean isPrime(int number){
        if (number<2) return false;
        if (((number % 2) == 0) && (number!=2)) return false;

        int i = 3;
        int maxI = (int) Math.floor(Math.sqrt(number));
        while (i <= maxI)
        {
            if ((number % i) == 0) return false;
            i += 2;
        }
        return true;
    }
}
