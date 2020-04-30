package by.jrr.service;

public class PrimeNumbersService {
    public boolean thisPrimeNumbers(int n) {
        if (n % 2== 0) return false;
        for(int i = 3; i * i <= n; i += 2) {
            if(n % i == 0)
                return false;
        }
        return true;
    }
}
