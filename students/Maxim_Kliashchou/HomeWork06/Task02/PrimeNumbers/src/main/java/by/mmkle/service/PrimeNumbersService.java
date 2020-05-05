package by.mmkle.service;

import java.util.Arrays;
import java.util.List;

public class PrimeNumbersService {
    public List<Integer> sumOfPrimeNumbers(){
        int left = 1;
        int right = 500;
        int sum = 0;
        int count = 0;
        for (int i = left; i <= right; i++){
            if (i == 17 || i == 71) {
                continue;
            }
            if (isPrimeNumber(i)){
                sum += i;
                count++;
            }
            if (count == 50){
                break;
            }
        }
        return Arrays.asList(sum, count);
    }

    private boolean isPrimeNumber(int number) {
        if (number == 1) return false;
        for (int i = 2; i <= Math.sqrt(number); i++){
            if (number % i == 0){
                return false;
            }
        }
        return true;
    }
}
