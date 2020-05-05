package by.rybak.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;

public class DoWhileOddChecker {
    private static Logger logger = LoggerFactory.getLogger(DoWhileOddChecker.class);

    public static void main(String[] args) {
        DoWhileOddChecker cheker = new DoWhileOddChecker();
        logger.info(cheker.oddNumberOutput(0,25));
    }

    public String oddNumberOutput(int start, int end) {
        int[] mas;
        if (isEven(start) && isEven(end)) {
            mas = new int[(end - start) / 2];
        } else {
            mas = new int[(end - start) / 2 + 1];
        }
        int counter = 0;
        do {
            if ((start % 2) != 0) {
                mas[counter++] = start;
            }
            start++;
        } while (start <= end);
        return Arrays.toString(mas);
    }

    public boolean isEven(int number) {
        return (number % 2 == 0);
    }
}
