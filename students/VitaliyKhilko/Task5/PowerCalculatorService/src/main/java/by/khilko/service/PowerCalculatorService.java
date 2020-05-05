package by.khilko.service;


public class PowerCalculatorService {
    public int raisingGivenNumberToGivenDegreeintNumber(int chOne, int chTwo){
        int getResultOfExponentiation = chOne;
        if(chOne > 0){
            for(int i = 1; i < chTwo; i++) {
                getResultOfExponentiation = getResultOfExponentiation * chOne;
            }
        }
        return getResultOfExponentiation;
    }
}

