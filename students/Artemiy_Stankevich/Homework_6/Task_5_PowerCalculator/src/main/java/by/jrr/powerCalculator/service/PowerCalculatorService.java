package by.jrr.powerCalculator.service;

public class PowerCalculatorService {
    public int raisingToAGivenDegree (int num, int degree) throws Exception{
        int results = num;
            if (num < 0 && degree < 0) {
               throw new Exception("numbers must be greater than zero");
            } else {
                for (int i = degree; i > 1 ; i--) {
                    results *=num;
                }
            }return results;
        }

    }
