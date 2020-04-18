package test;

import bean.SignComparator;

public class SignComparatorTest { public static void main(String[] args) {
    SignComparatorTest testRunner = new SignComparatorTest();
    testRunner.test1();
    testRunner.test2();
    testRunner.test3();
}

    public void checkThatEqual(String expected, String actual, String testDescription) {
        if (expected.equals(actual)) {
            System.out.println(testDescription + " has passed!");
        } else {
            System.out.println(testDescription + " has failed!!!");
            System.out.println("Expected \"" + expected + "\", but was \"" + actual + "\"");
        }
    }

    public void test1() {
        String testDescription = "Must determine that the number is negative";

        SignComparator signComparator = new SignComparator();

        String expectedResult = "Number is negative";
        String actualResult = signComparator.compare(-6);

        checkThatEqual(expectedResult, actualResult, testDescription);
    }

    public void test2() {
        String testDescription = "Must determine that the number is positive";

        SignComparator signComparator = new SignComparator();

        String expectedResult = "Number is positive";
        String actualResult = signComparator.compare(8);

        checkThatEqual(expectedResult, actualResult, testDescription);
    }

    public void test3() {
        String testDescription = "Must determine that the number is equal to zero";

        SignComparator signComparator = new SignComparator();

        String expectedResult = "Number is equal to zero";
        String actualResult = signComparator.compare(0);

        checkThatEqual(expectedResult, actualResult, testDescription);
    }
}

