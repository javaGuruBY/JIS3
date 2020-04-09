package by.bariloegor.test;

import by.bariloegor.service.SignComparatorService;

public class SignComparatorTest {
    private SignComparatorService signComparatorService = new SignComparatorService();

    private void assertEquals(String testName, String expected, String actual){
        boolean result = expected.equals(actual);
        if(result){
            System.out.println("\n[INFO] " + testName + " test passed successfully.");
        } else {
            System.out.println("\n[ERROR] " + testName + " test failed.Expected '" + expected + "' but was '" + actual + "'");
        }
    }

    private void comparePositiveNumberTest(){
        String expected = "Number is positive.";
        String actual = signComparatorService.compare(1);
        assertEquals("Positive number", expected, actual);
    }

    private void compareNegativeNumberTest(){
        String expected = "Number is negative.";
        String actual = signComparatorService.compare(-1);
        assertEquals("Negative number", expected, actual);
    }

    private void compareZeroTest(){
        String expected = "Number is equal to zero.";
        String actual = signComparatorService.compare(0);
        assertEquals("Zero number", expected, actual);
    }

    public void signComparatorTest(){
        comparePositiveNumberTest();
        compareNegativeNumberTest();
        compareZeroTest();
        System.out.println();
    }
}
