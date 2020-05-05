package by.bariloegor.service;

import java.util.Random;

public class ArrayService {
    public int[] create(int size){
        return new int[size];
    }

    public void fillRandomly(int[] array){
        Random random = new Random();
        for(int i = 0; i < array.length; i++){
            array[i] = random.nextInt(100) + 1;
        }
    }

    public String printArray(int[] array){
        StringBuilder stringOfArray = new StringBuilder(array[0] + " ");
        for(int i = 1; i < array.length; i++) stringOfArray.append(array[i]).append(" ");
        return stringOfArray.toString();
    }

    public int sum(int[] array){
        int sumOfNumber = 0;
        for (int value : array) sumOfNumber += value;
        return sumOfNumber;
    }

    public double avg(int[] array){
        double sumOfNumbers = sum(array);
        return  sumOfNumbers / array.length;
    }

    public void sort(int[] array){
        int variableValue;
        for(int i = 0; i < array.length; i++){
            for(int j = i+1; j < array.length; j++){
                if(array[j] < array[i]){
                    variableValue = array[j];
                    array[j] = array[i];
                    array[i] = variableValue;
                }
            }
        }
    }

    public void swap(int[] array){
        int variableValue;
        for(int i = 0; i < array.length / 2; i++){
                variableValue = array[i];
                array[i] = array[array.length - (i+1)];
                array[array.length - (i+1)] = variableValue;
        }
    }
}
