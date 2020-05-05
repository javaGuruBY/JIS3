package by.mmkle.service;

public class PowerCalculatorService {
    public long pow(long number, long power){
        long result = 1L;
        for (int i = 0; i < power; i++){
            result *= number;
        }
        return result;
    }
}
