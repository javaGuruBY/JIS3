package by.rybak.service;

import java.util.List;

public class LookupArrayService {

    public int findMax(List<Integer> array) {
        if(array.isEmpty()) return 0;
        int max = array.get(0);
        for (Integer el: array) {
            max = (el > max) ? el : max;
        }
        return max;
    }

    public int findMin(List<Integer> array) {
        if(array.isEmpty()) return 0;
        int min = array.get(0);
        for (Integer el: array) {
            min = (el < min) ? el : min;
        }
        return min;
    }

    public int indexOfMax(List<Integer> array) {
        if(array.isEmpty()) {
            return -1;
        }else {
            int maxElement = findMax(array);
            return array.indexOf(maxElement);
        }
    }

    public int indexOfMin(List<Integer> array) {
        if(array.isEmpty()) {
            return -1;
        }else {
            int minElement = findMin(array);
            return array.indexOf(minElement);
        }
    }

    public int indexOf(List<Integer> array, int value) {
        if(array.isEmpty()) return -1;
        else return array.indexOf(value);
    }
}
