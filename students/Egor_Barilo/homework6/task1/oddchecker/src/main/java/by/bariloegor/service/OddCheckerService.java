package by.bariloegor.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class OddCheckerService {
    public static void forOddChecker(){
        Logger log = LoggerFactory.getLogger(OddCheckerService.class);
        for(double i = 1; i < 50; i++){
            if(i % 2 != 0){
                String oddNumber = Double.toString(i);
                log.info(oddNumber);
            }
        }
    }

    public static void whileOddChecker(){
        Logger log = LoggerFactory.getLogger(OddCheckerService.class);
        int i = 0;
        while(i <= 50){
            if(i % 2 != 0){
                String oddNumber = Double.toString(i);
                log.info(oddNumber);
            }
            i++;
        }
    }

    public static void whileDoOddChecker(){
        Logger log = LoggerFactory.getLogger(OddCheckerService.class);
        int i = 0;
        do {
            if(i % 2 != 0){
                String oddNumber = Double.toString(i);
                log.info(oddNumber);
            }
            i++;
        } while(i < 50);
    }
}
