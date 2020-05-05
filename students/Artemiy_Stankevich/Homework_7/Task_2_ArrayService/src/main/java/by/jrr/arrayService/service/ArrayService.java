package by.jrr.arrayService.service;

import java.util.Random;

public class ArrayService {
    Random random = new Random();

    public int[] create(int size) {
        int[] array = new int[size];
        return array;
    }

    public void fillRandomly(int[] array) {
        for (int i = 0; i <=array.length - 1 ; i++) {
            array[i] = random.nextInt(100);
        }
    }

    public int sum(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length ; i++) {
            sum+= array[i];
        }
        return  sum;
    }

    public double avg(int[] array) {
        double avg = 0;
        if (array.equals(null)) {
            return 0;
        } else
        for (int i = 0; i < array.length; i++) {
            avg += array[i];
        }
        return avg / array.length;
    }

    public void printArray(int[] array) {
        for (int x: array
             ) {
            System.out.println(x);
        }
    }

}
