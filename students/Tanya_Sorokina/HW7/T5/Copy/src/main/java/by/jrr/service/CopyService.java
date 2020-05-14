package by.jrr.service;

public class CopyService {
    public static int sizeNewArray = 0;
    public int[] copyInRange(int[] in, int leftBound, int rightBound){
        for (int value : in) {
            if (value >= leftBound && value <= rightBound) {
                sizeNewArray++;
            }
        }
        int [] newCopyArray = new int[sizeNewArray];
        int count = 0;
        for (int value : in){
            if (value >= leftBound && value <= rightBound){
                newCopyArray[count] = value;
                count++;
            }
        }
        return newCopyArray;
    }

}
