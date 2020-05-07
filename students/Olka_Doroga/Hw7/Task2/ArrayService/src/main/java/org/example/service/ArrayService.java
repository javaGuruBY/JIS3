package org.example.service;

import java.util.Arrays;
import java.util.Random;

public class ArrayService {

    public int[] create(int size) {
        return new int[size];
    }

    public void fillRandomly(int[] array) {
        Random random = new Random();
        for (int i = 0; i <array.length; i++) {
            array[i] = random.nextInt(100);
        }
    }

    public void printArray(int[] array) {
        StringBuilder newArray = new StringBuilder();
        newArray.append("[");
        for (int i = 0; i < array.length; i++) {
            newArray.append(array[i]).append(", ");
        }
        newArray.append("]");
        System.out.println(newArray);

    }

    public int sum(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        return sum;
    }

    public double avg(int[] array) {
        double avg = 0;
        if (array.length == 0)
            return 0;
        for (int i = 0; i < array.length; i++) {
            avg = avg + array[i];
        }
        avg = avg / array.length;
        return avg;
    }
}