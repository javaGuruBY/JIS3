package org.example.service;

import org.example.bean.PhraseAnalyser;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PhraseAnalyserServiceTest {

    @Test
    void analyseAnd() {
        String expectedResult = "It stands no chance";
        PhraseAnalyser phraseAnalyser = new PhraseAnalyser("Make Olya great again");
        PhraseAnalyserService phraseAnalyserService = new PhraseAnalyserService();

        assertEquals(expectedResult, phraseAnalyserService.analyse(phraseAnalyser), "111");
    }

    @Test
    void analyseOr() {
        String expectedResult = "It could be worse";
        PhraseAnalyser phraseAnalyser = new PhraseAnalyser(" great again");
        PhraseAnalyserService phraseAnalyserService = new PhraseAnalyserService();

        assertEquals(expectedResult, phraseAnalyserService.analyse(phraseAnalyser), "222");
    }

    @Test
    void analyseElse() {
        String expectedResult = "It is fine, really";
        PhraseAnalyser phraseAnalyser = new PhraseAnalyser(" Hello, Olya");
        PhraseAnalyserService phraseAnalyserService = new PhraseAnalyserService();

        assertEquals(expectedResult, phraseAnalyserService.analyse(phraseAnalyser), "333");
    }
}