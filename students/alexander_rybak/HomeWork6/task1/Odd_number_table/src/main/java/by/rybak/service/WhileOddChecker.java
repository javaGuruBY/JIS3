package by.rybak.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;

public class WhileOddChecker {
    private static Logger logger = LoggerFactory.getLogger(WhileOddChecker.class);

    public static void main(String[] args) {
        WhileOddChecker checker = new WhileOddChecker();
        logger.info(checker.oddNumberOutput(6,23));
    }

    public String oddNumberOutput(int start, int end) {
        int[] mas;
        int counter = 0;
        if (isEven(start) && isEven(end)) {
            mas = new int[(end - start) / 2];
        } else {
            mas = new int[(end - start) / 2 + 1];
        }

        while(start <= end){
            if(start % 2 != 0){
                mas[counter++] = start;
            }
            start++;
        }
        return Arrays.toString(mas);
    }

    public boolean isEven(int number) {
        return (number % 2 == 0);
    }
}
