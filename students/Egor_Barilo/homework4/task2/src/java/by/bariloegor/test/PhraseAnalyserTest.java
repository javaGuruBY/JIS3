package by.bariloegor.test;

import by.bariloegor.service.PhraseAnalyserService;

public class PhraseAnalyserTest {
    private PhraseAnalyserService phraseAnalyserService = new PhraseAnalyserService();
    private void assertEquals(String testName, String expected, String actual){
        boolean result = expected.equals(actual);
        if(result){
            System.out.println("[INFO] " + testName + " test passed successfully.");
        } else {
            System.out.println("[ERROR] " + testName + " test failed.Expected '" + expected + "' but was '" + actual + "'");
        }
    }

    private void beginAndEndOfPhraseCoincidenceTest(){
        String expected = "It stands no chance.";
        String actual = phraseAnalyserService.phraseAnalysis("Make America great again.");
        assertEquals("Coincidence of phrases begin and end", expected, actual);
    }

    private void beginOfPhraseCoincidenceTest(){
        String expected = "It could be worse.";
        String actual = phraseAnalyserService.phraseAnalysis("Make America great later.");
        assertEquals("Coincidence of phrases begin", expected, actual);
    }

    private void endOfPhraseCoincidenceTest(){
        String expected = "It could be worse.";
        String actual = phraseAnalyserService.phraseAnalysis("Cook America great again.");
        assertEquals("Coincidence of phrases end", expected, actual);
    }

    private void withoutCoincidenceTest(){
        String expected = "It is fine, really.";
        String actual = phraseAnalyserService.phraseAnalysis("Cook America great later.");
        assertEquals("Without coincidence", expected, actual);
    }

    public void phraseAnalyserTest(){
        beginAndEndOfPhraseCoincidenceTest();
        beginOfPhraseCoincidenceTest();
        endOfPhraseCoincidenceTest();
        withoutCoincidenceTest();
        System.out.println();
    }
}
