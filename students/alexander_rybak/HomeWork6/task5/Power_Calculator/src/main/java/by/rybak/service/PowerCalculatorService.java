package by.rybak.service;

import by.rybak.bean.PowerCalculator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PowerCalculatorService {
    private static final Logger log = LoggerFactory.getLogger(PowerCalculatorService.class);
    
    public double pow(PowerCalculator powerCalculator, int power){
        double result = powerCalculator.getNumber();
        if(result > 0) {
            while (power > 1) {
                result *= powerCalculator.getNumber();
                power--;
            }
        }else{
            log.warn("power is < 0! Operation is Impossible!");
        }
        return result;
    }
}
