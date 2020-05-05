


public class LookUpArrayService {

    public  int  findMax ( int [] array ) {
        if (array.length == 0)
            return 0;
        int max = array[0];
        for (int i = 1;i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        return max;
    }

    public  int  findMin ( int [] array ) {
        if (array.length == 0)
            return 0;
        int min = array[0];
        for (int i = 1;i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        return min;

    }

    public  int  indexOfMax ( int [] array ) {
        int max = this.findMax(array);
        for (int i = 0; i < array.length;i++){
            if (array[i] == max){
                return i;
            }
        }
         return -1;

    }

    public  int  indexOfMin ( int [] array ) {
        int min = this.findMin(array);
        for (int i = 0; i < array.length;i++){
            if (array[i] == min){
                return i;
            }
        }
        return -1;


    }

    public  int  indexOf ( int [] array , int  value ) {
        if (array.length == 0)
            return -1;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                return i;
            }
        }
        return -1;

    }
}
