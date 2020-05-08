package by.jrr.service;

import java.util.Random;

public class ArrayService {
    Random random = new Random();

    public int[] create(int size) {
        int[] array = new int[size];
        return array;
    }

    public void fillRandomly(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }
    }

    public void printArray(int[] array) {
        for (int a: array) {
            System.out.println(a);
        }
    }


    public int sum(int[] array) {
        int sum = 0;
        for (int i = 0; i< array.length; i++){
            sum +=array[i];
        }
        return sum;
    }

    public double avg(int[] array) {
        double avg = 0;
        if (array.equals(null)){
            return 0;
        }else for (int i = 0; i< array.length; i++){
            avg +=array[i];
        }
        return avg/array.length;
    }

    public void sort(int[] array){
        for (int i = 1; i < array.length; i++) {
            int current = array[i];
            int j = i - 1;
            while(j >= 0 && current < array[j]) {
                array[j+1] = array[j];
                j--;
            }
            array[j+1] = current;
        }
    }

    public void swap(int[] array){
        int swap = 0;
        for (int i = 0, j = array.length-1; i < (array.length - 1)/2; i++,j--) {
            if (i == j) break;
            swap = array[i];
            array[i] = array[j];
            array[j] = swap;
        }
    }
}


