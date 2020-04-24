import service.PhraseAnalyserService;

public class PhraseAnalyserTest {

    public static void main(String[] args) {
        PhraseAnalyserTest testRunner = new PhraseAnalyserTest();
        testRunner.test1();
        testRunner.test2();
        testRunner.test3();
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
        String testDescription = "must match 100% ";

        PhraseAnalyserService phraseAnalyserService = new PhraseAnalyserService();

        String expectedResult = "It stands no chance";
        String actualResult = phraseAnalyserService.analyse("Make wtf wtf  wtf wtf wtf wtf wtf  great again");

        checkThatEqual(expectedResult, actualResult, testDescription);
    }

    public void test2() {
        String testDescription = "must  match at least 50% ";

        PhraseAnalyserService phraseAnalyserService = new PhraseAnalyserService();

        String expectedResult = "It could be worse";
        String actualResult = phraseAnalyserService.analyse("Make wtf wtf wtfw tf  again great");

        checkThatEqual(expectedResult, actualResult, testDescription);
    }

    public void test3() {
        String testDescription = "your program sucks";

        PhraseAnalyserService phraseAnalyserService = new PhraseAnalyserService();

        String expectedResult = "It is fine, really";
        String actualResult = phraseAnalyserService.analyse("wtf wtfw wtf wtf wtf wtf wtf wtf ");

        checkThatEqual(expectedResult, actualResult, testDescription);
    }
}

