package by.mmkle.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

public class OddCheckerService {
    Logger log = LoggerFactory.getLogger(OddCheckerService.class);

    public List<Integer> forOddChecker(){
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= 50; i += 2){
            list.add(i);
            printNumber("Cycle for number ", i);
        }
        return list;
    }

    public List<Integer> whileOddChecker(){
        List<Integer> list = new ArrayList<>();
        int i = 1;
        while (i <= 50){
            list.add(i);
            printNumber("Cycle while number ", i);
            i += 2;
        }
        return list;
    }

    public List<Integer> doWhileOddChecker(){
        List<Integer> list = new ArrayList<>();
        int i = 1;
        do {
            list.add(i);
            printNumber("Cycle doWhile number ", i);
            i += 2;
        } while (i <= 50);
        return list;
    }

    public void printNumber(String message, int x){
        log.info(message + x);
    }
}
