package by.rybak.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;
import java.util.Random;

public class ArrayService {
    private Random random = new Random();
    private int start = 0;
    private int end = 100;
    private static Logger log = LoggerFactory.getLogger(ArrayService.class);

    public int[] create(int size) {
        return new int[size];
    }

    public void fillRandomly(int[] array) {
        for(int i = start; i <= end; i++){
            array[i] = random.nextInt(100);
        }
    }

    public void printArray(int[] array) {
        StringBuilder result = new StringBuilder("Array = {");
        for(int i = 0; i < array.length; i++){
            result.append(array[i] + ", ");
        }
        result.append("}");
        log.info(String.valueOf(result));
    }

    public int sum(int[] array) {
        int sum = 0;
        for (int el: array) {
            sum += el;
        }
        return sum;
    }

    public double avg(int[] array) {
        double sum = 0;
        if(Arrays.toString(array) == Arrays.toString(new int[array.length])) {
            return 0;
        }
        else {
            for (int el: array) {
                sum += el;
            }
            return (sum / array.length);
        }
    }

    public void sort(int[] array) {
        int buf;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[i]) {
                    buf = array[j];
                    array[j] = array[i];
                    array[i] = buf;
                }
            }
        }
    }

    public void swap(int[] array) {
        int buf;
        int size = array.length;
        for (int i = 0; i < (size / 2); i++) {
            buf = array[i];
            array[i] = array[size-i-1];
            array[size-i-1] = buf;
        }
    }
}
