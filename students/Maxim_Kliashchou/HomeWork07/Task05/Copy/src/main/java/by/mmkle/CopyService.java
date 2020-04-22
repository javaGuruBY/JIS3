package by.mmkle;

public class CopyService {
    public int[] copyInRange(int[] in, int leftBound, int rightBound){
        int size = 0;
        for (int i = 0; i < in.length; i++){
            if (isInRange(in[i], leftBound, rightBound)){
                size++;
            }
        }
        int[] array = new int[size];
        int pos = 0;
        for (int i = 0; i < in.length; i++){
            if (isInRange(in[i], leftBound, rightBound)){
                array[pos] = in[i];
                pos++;
            }
        }
        return array;
    }

    private boolean isInRange(int value, int leftBound, int rightBound) {
        return (value >= leftBound && value <= rightBound);
    }
}
