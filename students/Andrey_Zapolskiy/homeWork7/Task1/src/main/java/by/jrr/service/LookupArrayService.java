package by.jrr.service;

import by.jrr.bean.LookupArray;

public class LookupArrayService {
    public int findMax(LookupArray lookupArray) {
        int idx = 0;
        int[] elements = lookupArray.getArray();
        if (elements == null) {
            return 0;
        }
        for (int i = 0; i < elements.length; i++) {
            if (elements[idx] < elements[i]) {
                idx = i;
            }
        } return elements[idx];
    }

    public int findMin(LookupArray lookupArray) {
        int idx = 0;

        int[] elements = lookupArray.getArray();
        if (elements == null) {
            return 0;
        }
        for (int i = 0; i < elements.length; i++) {
            if (elements[idx] > elements[i]) {
                idx = i;
            }
        } return elements[idx];
    }

    public int indexOfMax(LookupArray lookupArray) {
        int indexOfMax = 0;

        int[] elements = lookupArray.getArray();
        if (elements == null) {
            return -1;
        }
        for (int i = 0; i < elements.length; i++) {

            if (elements[indexOfMax] < elements[i]) {
                indexOfMax = i;
            }
        } return  indexOfMax;
    }

    public int indexOfMin(LookupArray lookupArray) {
        int indexOfMin = 0;

        int[] elements = lookupArray.getArray();
        if (elements == null) {
            return -1;
        }
        for (int i = 0; i < elements.length; i++) {
            if (elements[indexOfMin] > elements[i]) {
                indexOfMin = i;
            }
        } return  indexOfMin;
    }

    public int indexOf(LookupArray lookupArray, int value) {
        int indexOf = 0;

        int[] elements = lookupArray.getArray();
        if (elements == null) {
            return -1;
        }
        for (int i = 0; i < elements.length; i++) {
            if (elements[i] == value) {
                indexOf = i;
            }
        } return  indexOf;
    }
}
