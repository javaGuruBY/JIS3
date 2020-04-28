package by.jrr.copy.service;

public class CopyService {
    public static int sizeNewArray = 0;
    public int[] copyInRange(int[] in, int leftBound, int rightBound) {
        for (int value : in) {
            if (value >= leftBound && value <= rightBound) {
                sizeNewArray++;
            }
        }
        int [] copyArray = new int[sizeNewArray];
        int count = 0;
        for (int value : in) {

            if (value >= leftBound && value <= rightBound) {
                copyArray[count] = value;
                count++;
            }
        }
        return copyArray;
    }

}