package by.bariloegor.service;

public class PowerCalculatorService {
    public int exponentiation(int number, int degree){
        int resultOfExponentiation = number;
        if(number > 0){
            for(int i = 1; i < degree; i++) {
                resultOfExponentiation = resultOfExponentiation * number;
            }
        }
        return resultOfExponentiation;
    }
}
