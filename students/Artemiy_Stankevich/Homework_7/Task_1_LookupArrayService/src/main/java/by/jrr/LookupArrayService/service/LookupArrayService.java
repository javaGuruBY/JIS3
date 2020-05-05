package by.jrr.LookupArrayService.service;

import java.util.Arrays;

public class LookupArrayService {
    public int findMax(int[] array) {
        Arrays.sort(array);
        if (array != null) {
            return array[array.length-1];
        } else return -1;
    }
    public int findMin(int[] array) {
        Arrays.sort(array);
        if (array != null) {
            return array[0];
        } else return -1;
    }
    public int indexOfMax(int[] array) {
        Arrays.sort(array);
        if (array != null) {
            return array.length-1;
        } else return -1;
    }
    public int indexOfMin(int[] array) {
        Arrays.sort(array);
        if (array != null) {
            return 0;
        } else return -1;
    }
    public int indexOf(int[] array, int value) {
        int result = 0;
        if (array != null) {
            for (int i = 0; i <array.length ; i++) {
                if (array[i] != value ) {
                    continue;
                } else result = i;
            } return result;
        } else return -1;
    }
}
