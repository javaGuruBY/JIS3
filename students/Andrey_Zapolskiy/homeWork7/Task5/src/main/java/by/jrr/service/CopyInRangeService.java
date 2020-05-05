package by.jrr.service;

public class CopyInRangeService {
    public int[] copyInRange(int[] in, int leftBound, int rightBound){
        int sizeOfArray = 0;
        for (int value : in) {
            if (isInRange(value, leftBound, rightBound)) {
                sizeOfArray++;
            }
        }
        int[] array = new int[sizeOfArray];
        int position = 0;
        for (int value : in) {
            if (isInRange(value, leftBound, rightBound)) {
                array[position] = value;
                position++;
            }
        }
        return array;
    }

    private boolean isInRange(int value, int leftBound, int rightBound) {
        return (value >= leftBound && value <= rightBound);
    }
}
