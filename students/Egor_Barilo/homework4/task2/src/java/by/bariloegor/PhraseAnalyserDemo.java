package by.bariloegor;

import by.bariloegor.service.PhraseAnalyserService;
import by.bariloegor.test.PhraseAnalyserTest;

public class PhraseAnalyserDemo {
    public static void main(String[] args) {
        PhraseAnalyserTest phraseAnalyserTest = new PhraseAnalyserTest();
        phraseAnalyserTest.phraseAnalyserTest();
        PhraseAnalyserService phraseAnalyserService = new PhraseAnalyserService();
        String result = phraseAnalyserService.phraseAnalysis("Cook America great later.");
        System.out.println(result);
    }
}
