package by.abs.bean;

public class PowerCalculator {

    public long calcul(long power, long number) {
        long result = 1L;
        for (int i = 0; i < power; i++){
            result*= number;
        }
        return result;
    }
}
