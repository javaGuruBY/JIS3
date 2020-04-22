package by.mmkle.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;
import java.util.Random;

public class ArrayService {
    private int leftRange = 0;
    private int rightRange = 100;
    private Logger log = LoggerFactory.getLogger(ArrayService.class);
    private Random random = new Random();

    public int[] create(int size){
        return new int[size];
    }

    public void fillRandomly(int[] array){
        for (int i = 0; i < array.length; i++){
            array[i] = random.nextInt(rightRange - leftRange + 1) + leftRange;
        }
    }

    public void printArray(int[] array){
        StringBuilder arrayToString = new StringBuilder("Array = {");
        for (int i = 0; i < array.length - 1; i++) {
            arrayToString.append(array[i] + ", ");
        }
        arrayToString.append(array[array.length - 1] + "};");
        log.info(String.valueOf(arrayToString));
    }

    public int sum(int[] array){
        int sum = 0;
        for (int i = 0; i < array.length; i++){
            sum += array[i];
        }
        return sum;
    }

    public double avg(int[] array){
        int avg = 0;

        for(int value : array){
            avg += value;
        }

        return 1.0 * avg / array.length;
    }

    public void sort(int[] array){
        Arrays.sort(array);
    }

    public void swap(int[] array){
        for (int i = 0; i < array.length / 2; i++){
            int temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;
        }
    }
}
