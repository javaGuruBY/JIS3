package by.jrr.numberService.service;

public class NumberService {
    public static int sumRangeNumber = 0;
    public int rangeSum(int start, int finish) {
        if (start < finish) {
            for (int i = start; i <= finish ; i++) {
                sumRangeNumber+=i;
            }
        }else if (finish < start) {
            for (int i = start; i >= finish ; i--) {
                sumRangeNumber+=i;
            }
        }
        return sumRangeNumber;
    }

    public int rangeEvenCount(int start, int finish) {
        int countEvenNum = 0;
        if (start < finish) {
            for (int i = start; i <= finish ; i++) {
                if (i % 2 == 0) {
                    countEvenNum++;
                }
            }
        } else if (start > finish) {
            for (int i = start; i >= finish ; i--) {
                if (i % 2 == 0) {
                    countEvenNum++;
                }
            }
        }
        return countEvenNum;
    }
}
