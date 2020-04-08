package test;

import service.LightColorDetectorService;

public class LightColorDetectorTest {
    public static void main(String[] args) {
        LightColorDetectorTest testRunner = new LightColorDetectorTest();
        testRunner.test1();
        testRunner.test2();
        testRunner.test3();
        testRunner.test4();
        testRunner.test5();
        testRunner.test6();
        testRunner.test7();
    }

    public void checkThatEqual(String expected, String actual, String testDescription) {
        if (expected.equals(actual)) {
            System.out.println(testDescription + " has passed!");
        } else {
            System.out.println(testDescription + " has failed!");
            System.out.println("expected \"" + expected + "\", but was \"" + actual + "\"");
        }
    }

    public void test1() {
        String testDescription = "Should return color \"Violet\"";

        LightColorDetectorService lightColorDetectorService = new LightColorDetectorService();

        String expectedResult = "Violet";
        String actualResult = lightColorDetectorService.detect(390);

        checkThatEqual(expectedResult, actualResult, testDescription);
    }

    public void test2() {
        String testDescription = "Should return color \"Yellow\"";

        LightColorDetectorService lightColorDetectorService = new LightColorDetectorService();

        String expectedResult = "Yellow";
        String actualResult = lightColorDetectorService.detect(580);

        checkThatEqual(expectedResult, actualResult, testDescription);
    }

    public void test3() {
        String testDescription = "Should return \"Invisible Light\"";

        LightColorDetectorService lightColorDetectorService = new LightColorDetectorService();

        String expectedResult = "Invisible Light";
        String actualResult = lightColorDetectorService.detect(1000);

        checkThatEqual(expectedResult, actualResult, testDescription);
    }

    public void test4() {
        String testDescription = "Should return \"Blue light\"";

        LightColorDetectorService lightColorDetectorService = new LightColorDetectorService();

        String expectedResult = "Blue";
        String actualResult = lightColorDetectorService.detect(455);

        checkThatEqual(expectedResult, actualResult, testDescription);
    }

    public void test5() {
        String testDescription = "Should return \"Green Light\"";

        LightColorDetectorService lightColorDetectorService = new LightColorDetectorService();

        String expectedResult = "Green";
        String actualResult = lightColorDetectorService.detect(500);

        checkThatEqual(expectedResult, actualResult, testDescription);
    }

    public void test6() {
        String testDescription = "Should return \"Orange Light\"";

        LightColorDetectorService lightColorDetectorService = new LightColorDetectorService();

        String expectedResult = "Orange";
        String actualResult = lightColorDetectorService.detect(600);

        checkThatEqual(expectedResult, actualResult, testDescription);
    }

    public void test7() {
        String testDescription = "Should return \"Red Light\"";

        LightColorDetectorService lightColorDetectorService = new LightColorDetectorService();

        String expectedResult = "Red";
        String actualResult = lightColorDetectorService.detect(700);

        checkThatEqual(expectedResult, actualResult, testDescription);
    }
}