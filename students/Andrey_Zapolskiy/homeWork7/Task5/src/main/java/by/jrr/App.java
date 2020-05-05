package by.jrr;

import by.jrr.service.CopyInRangeService;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        int[] a1 = {40, 75, 23, 36, 87, 95, 54, 11, 62};
        CopyInRangeService c = new CopyInRangeService();
        int[] out = c.copyInRange(a1, 30, 75);
        System.out.println(Arrays.toString(out));
    }
}
