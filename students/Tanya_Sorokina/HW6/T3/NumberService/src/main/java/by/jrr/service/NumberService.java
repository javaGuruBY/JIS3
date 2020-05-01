package by.jrr.service;

public class NumberService {

    public int rangeSum(int start, int finish) {
        int result = 0;
        int i;
        for (i = start; i<=finish; i++) {
            result +=i;
        }
        return result;
    }

    public int rangeEvenCount(int start, int finish) {
        int result = 0;
        int i;
        for (i = finish; i>=start; i--) {
            result +=i;
        }
        return result;
    }


//    public static int showTotalAmount(int value) {
//        int result = 0;
//        for (int i = 1; i <= value; i++) {
//            result += i;
//        }
//        return result;
//    }
}
