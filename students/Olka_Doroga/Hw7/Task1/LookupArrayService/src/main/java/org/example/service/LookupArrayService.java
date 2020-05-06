package org.example.service;

public class LookupArrayService {
    public int findMax(int[] array) {
        if (array.length == 0)
            return 0;
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        return max;
    }

    public int findMin(int[] array) {
        if (array.length == 0)
            return 0;
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        return min;
    }

    public int indexOfMax(int[] array) {
        if (array.length == 0)
            return -1;
        int indOfMaxNumber = 0;
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
                indOfMaxNumber = i;
            }
        }
        return indOfMaxNumber;
    }

    public int indexOfMin(int[] array) {
        if (array.length == 0)
            return -1;
        int indOfMinNumber = 0;
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (max > array[i]) {
                max = array[i];
                indOfMinNumber = i;
            }
        }
        return indOfMinNumber;
    }

    public int indexOf(int[] array, int value) {
        int ind = 0;
        if (array.length == 0)
            return -1;
        for (int i = 0; i < array.length; i++) {
            if (value == array[i]) {
                ind = i;
            }
        }
        return ind;
    }
}
