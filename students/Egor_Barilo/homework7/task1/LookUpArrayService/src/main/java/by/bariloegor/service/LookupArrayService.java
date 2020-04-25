package by.bariloegor.service;

public class LookupArrayService {
    public int findMax(int[] array){
        int maxNumber = array[0];
        for(int i = 1; i < array.length; i++){
            if(array[i] > maxNumber) maxNumber = array[i];
        }
        return maxNumber;
    }

    public int findMin(int[] array){
        int minNumber = array[0];
        for(int i =1; i < array.length; i++){
            if(array[i] < minNumber) minNumber = array[i];
        }
        return minNumber;
    }

    public int indexOfMax(int[] array){
        int indexOfMaxNumber = 0;
        int maxNumber = array[0];
        for(int i = 1; i < array.length; i++){
            if(array[i] > maxNumber){
                maxNumber = array[i];
                indexOfMaxNumber = i;
            }
        }
        return indexOfMaxNumber;
    }

    public int indexOfMin(int[] array){
        int indexOfMinNumber = 0;
        int minNumber = array[0];
        for(int i = 1; i < array.length; i++){
            if(array[i] < minNumber){
                minNumber = array[i];
                indexOfMinNumber = i;
            }
        }
        return indexOfMinNumber;
    }

    public int indexOf(int[] array, int value){
        int indexOfNumber = 0;
        for(int i = 0; i < array.length; i++){
            if(array[i] == value){
                indexOfNumber = i;
                break;
            }
        }
        return indexOfNumber;
    }
}
