package by.bariloegor;

import by.bariloegor.service.SignComparatorService;
import by.bariloegor.test.SignComparatorTest;

public class SignComparatorDemo {
    public static void main(String[] args) {
        SignComparatorTest signComparatorTest = new SignComparatorTest();
        SignComparatorService signComparatorService = new SignComparatorService();

        signComparatorTest.signComparatorTest();
        System.out.println(signComparatorService.compare(6));
    }
}
