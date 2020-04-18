package by.rybak.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;

public class ForOddChecker {
    private static Logger logger = LoggerFactory.getLogger(ForOddChecker.class);

    public static void main(String[] args) {
        ForOddChecker checker = new ForOddChecker();
        logger.info(checker.oddNumberOutput(0,19));
    }

    public String oddNumberOutput(int start, int end) {
        int[] mas;
        int counter = 0;
        if (isEven(start) && isEven(end)) {
            mas = new int[(end - start) / 2];
        } else {
            mas = new int[(end - start) / 2 + 1];
        }

        for (int i = start; i <= end; i++) {
            if (i % 2 != 0) {
                mas[counter++] = i;
            }
        }
        return Arrays.toString(mas);
    }

    public boolean isEven(int number) {
        return (number % 2 == 0);
    }

}
