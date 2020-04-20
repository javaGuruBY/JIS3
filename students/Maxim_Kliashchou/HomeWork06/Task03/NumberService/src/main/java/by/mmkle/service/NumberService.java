package by.mmkle.service;

public class NumberService {
    public int rangeSum(int start, int finish){
        int sum = 0;
        if (start > finish){
            int t = start;
            start = finish;
            finish = t;
        }
        for (int i = start; i <= finish; i++){
            sum += i;
        }
        return sum;
    }

    public int rangeEvenSum(int start, int finish){
        int count = 0;
        if (start > finish){
            int t = start;
            start = finish;
            finish = t;
        }
        for (int i = start; i <= finish; i++){
            if (i % 2 == 0) {
                count++;
            }
        }
        return count;
    }
}
