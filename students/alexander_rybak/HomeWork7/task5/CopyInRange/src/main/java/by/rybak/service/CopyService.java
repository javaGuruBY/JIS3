package by.rybak.service;

public class CopyService {

    public int[] copyInRange(int[] in, int leftBound, int rightBound) {
        int length = sizeOfArray(in, leftBound, rightBound);
        int[] result = new int[length];
        int counter = 0;
        for(int i = leftBound- 1; i < rightBound; i++){
            if(counter == length){
                return result;
            }
            result[counter++] = in[i];
        }
        return result;
    }

    public boolean isInRange (int number, int leftBound, int rightBound){
        return (number >= leftBound && number <= rightBound);
    }
    
    public int sizeOfArray(int[] in, int leftBound, int rightBound){
        int length = 0;
        for(int i = leftBound; i <= rightBound; i++){
            if(isInRange(i,leftBound,in.length)){
                length++;
            }
        }
        return length;
    }
}
