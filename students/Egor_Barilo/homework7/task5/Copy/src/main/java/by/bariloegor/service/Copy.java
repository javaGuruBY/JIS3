package by.bariloegor.service;

public class Copy {
    public int[] copyInRange(int[] in, int leftBound, int rightBound){
        int counterForNewArray = 0;
        int sizeOfNewArray = (rightBound - leftBound) + 1;
        int[] newArray = new int[sizeOfNewArray];
        for(int i = leftBound; i <= rightBound; i++){
            newArray[counterForNewArray] = in[i];
            counterForNewArray++;
        }
        return newArray;
    }
}
