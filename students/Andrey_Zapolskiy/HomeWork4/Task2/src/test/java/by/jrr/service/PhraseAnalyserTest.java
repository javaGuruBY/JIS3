package by.jrr.service;

import by.jrr.bean.Phrase;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PhraseAnalyserTest {

    @Test
    void analyseCase1() {
        Phrase text = new Phrase();
        PhraseAnalyser phraseAnalyser = new PhraseAnalyser();
        text.setText("Make America great again");
        String expectedResult = "It stands no chance";

        String actualResult = phraseAnalyser.analyse(String.valueOf(text));
    }

    @Test
    void analyseCase2() {
        Phrase text = new Phrase();
        PhraseAnalyser phraseAnalyser = new PhraseAnalyser();
        text.setText("Do America great again");
        String expectedResult = "It could be worse";

        String actualResult = phraseAnalyser.analyse(String.valueOf(text));
    }

    @Test
    void analyseCase3() {
        Phrase text = new Phrase();
        PhraseAnalyser phraseAnalyser = new PhraseAnalyser();
        text.setText("Do America nice one more");
        String expectedResult = "It is fine, really";

        String actualResult = phraseAnalyser.analyse(String.valueOf(text));
    }
}