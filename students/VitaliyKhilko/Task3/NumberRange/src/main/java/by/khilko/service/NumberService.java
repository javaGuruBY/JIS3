package by.khilko.service;

import by.khilko.bean.NumberRange;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class NumberService {
    Logger logs = LoggerFactory.getLogger(NumberService.class);

    public String calculationOfTheAmountInTheRangeOfGivenNumbers(NumberRange obj){
        int sumOfNumbers = 0;
        int count = 0;
        if(obj.getChOne() < obj.getChTwo()){
            for(int i = obj.getChOne(); i <= obj.getChTwo(); i++){
                sumOfNumbers += i;
                if(countNum(i)){
                    count++;
                }
            }
        }
        if(obj.getChOne() > obj.getChTwo()){
            for(int i = obj.getChTwo(); i <= obj.getChOne(); i++){
                sumOfNumbers += i;
                if(countNum(i)){
                    count++;
                }
            }
        }
        logs.info("Reurn sum of Numbers");
        logs.info(String.valueOf(sumOfNumbers));
        logs.info("Reurn count of Numbers");
        logs.info(String.valueOf(count));
        return ("Sum of numbers = " + sumOfNumbers + " ; " + "The number of even numbers = " + count);
    }

    private boolean countNum(int num){
        return num % 2 == 0;
    }
}

