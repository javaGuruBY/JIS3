package by.jrr;

import by.jrr.service.CopyService;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        CopyService copyService = new CopyService();
        int [] arrayTest = {1,10,8,9,12,15,99,18,6,7,3,5,2,4,11};
        int [] newArrayTest = copyService.copyInRange(arrayTest, 7, 100);
        System.out.println(Arrays.toString(newArrayTest));
    }
}
