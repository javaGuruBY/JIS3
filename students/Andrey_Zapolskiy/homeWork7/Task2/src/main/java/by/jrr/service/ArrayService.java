package by.jrr.service;

import java.util.Random;

import java.util.Arrays;
import java.util.Random;

public class ArrayService {

    @Override
    public String toString() {
        return "ArrayService{}";
    }

    public int[] create(int size) {
        return new int[size];
    }

    public void fillRandomly(int[] array) {
        Random random = new Random();

        int end = 101;
        for(int i = 0; i < array.length; i++){
            array[i] = random.nextInt(end);
        }
    }

    public void printArray(int[] array) {
        StringBuilder result = new StringBuilder("Array = {");
        for (int value : array) {
            result.append(value).append(", ");
        }
        result.append("}");
        System.out.println((result));
    }

    public int sum(int[] array) {
        int sum = 0;
        for (int element: array) {
            sum += element;
        }
        return sum;
    }

    public double avg(int[] array) {
        double sum = 0;
        if(Arrays.toString(array).equals(Arrays.toString(new int[array.length]))) {
            return 0;
        }
        else {
            for (int element: array) {
                sum += element;
            }
            return (sum / array.length);
        }
    }
}
