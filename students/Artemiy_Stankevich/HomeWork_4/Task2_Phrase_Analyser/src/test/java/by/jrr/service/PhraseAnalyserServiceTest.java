package by.jrr.service;

import by.jrr.bean.PhraseAnalyser;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PhraseAnalyserServiceTest {
    PhraseAnalyser phraseAnalyserTest;
    PhraseAnalyserService phraseAnalyserServiceTest;

    @BeforeEach
    void initialization() {
        phraseAnalyserTest = new PhraseAnalyser();
        phraseAnalyserServiceTest = new PhraseAnalyserService();
    }

    @Test
    void analyseFirstChance() {
        String expected = "It stands no chance";
        phraseAnalyserTest.setText("Make me great again");
        String actual = phraseAnalyserServiceTest.analyse(phraseAnalyserTest.getText());
        assertEquals(expected, actual, "[ERROR] TEST analyseFirstChance should return" +
                " It stands no chance");
    }

    @Test
    void analyseSecondChance() {
        String expected = "It could be worse";
        phraseAnalyserTest.setText("Make me happy");
        String actual = phraseAnalyserServiceTest.analyse(phraseAnalyserTest.getText());
        assertEquals(expected, actual, "[ERROR] TEST analyseSecondChance should return" +
                " It could be worse");
    }

    @Test
    void analyseNoOneChance() {
        String expected = "It is fine, really";
        phraseAnalyserTest.setText("Are you seriously?");
        String actual = phraseAnalyserServiceTest.analyse(phraseAnalyserTest.getText());
        assertEquals(expected, actual, "[ERROR] TEST analyseNoOneChance should return" +
                " It is fine, really");
    }
}