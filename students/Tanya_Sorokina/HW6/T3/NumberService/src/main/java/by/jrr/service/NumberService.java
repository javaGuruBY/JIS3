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
}
