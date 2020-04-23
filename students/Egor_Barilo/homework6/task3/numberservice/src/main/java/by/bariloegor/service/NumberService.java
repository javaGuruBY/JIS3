package by.bariloegor.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class NumberService {
    public boolean isSecondLineMore(int firstLineOfRange, int secondLineOfRange){
        Logger log = LoggerFactory.getLogger(NumberService.class);
        if(firstLineOfRange != secondLineOfRange) {
            return firstLineOfRange < secondLineOfRange;
        } else {
            String errorMessage = "Lines of range cant be equal.First line and second equal = " + firstLineOfRange;
            log.error(errorMessage);
            throw new IllegalArgumentException("Illegal operation.Lines cant be equal.");
        }

    }

    public boolean isNumberEven(int number){
        return number % 2 == 0;
    }

    public int countRangeSum(int firstLineOfRange, int secondLineOfRange){
        int sumOfRangeNumbers = 0;
        if (isSecondLineMore(firstLineOfRange, secondLineOfRange)) {
            for(int i = firstLineOfRange; i <= secondLineOfRange; i++) sumOfRangeNumbers += i;
        } else for(int i = secondLineOfRange; i <= firstLineOfRange; i++) sumOfRangeNumbers += i;
        return sumOfRangeNumbers;
    }

    public void rangeSum(int firstLineOfRange, int secondLineOfRange){
        Logger log = LoggerFactory.getLogger(NumberService.class);
        int sumOfRangeNumbers = countRangeSum(firstLineOfRange, secondLineOfRange);
        String result = "Sum of range numbers = " + sumOfRangeNumbers;
        log.info(result);
    }

    public int countRangeEvenNumbers(int firstLineOfRange, int secondLineOfRange){
        int amountOfEvenNumbersInRange = 0;
        if(isSecondLineMore(firstLineOfRange, secondLineOfRange)){
            for(int i = firstLineOfRange; i <= secondLineOfRange; i++){
                if(isNumberEven(i)) amountOfEvenNumbersInRange++;
            }
                } else for(int i = secondLineOfRange; i <= firstLineOfRange; i++){
            if(isNumberEven(i)) amountOfEvenNumbersInRange++;
        }
        return amountOfEvenNumbersInRange ;
    }

    public void rangeEvenCount(int firstLineOfRange, int secondLineOfRange){
        Logger log = LoggerFactory.getLogger(NumberService.class);
        int amountOfEvenNumbers = countRangeEvenNumbers(firstLineOfRange, secondLineOfRange);
        String result = "Amount of even numbers in range = " + amountOfEvenNumbers;
        log.info(result);
    }
}
