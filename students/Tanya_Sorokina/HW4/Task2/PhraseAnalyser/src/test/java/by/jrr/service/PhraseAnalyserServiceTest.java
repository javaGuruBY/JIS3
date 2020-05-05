package by.jrr.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PhraseAnalyserServiceTest extends PhraseAnalyserService {

    @Test
    void makeAndGreatAgainModelTest() {
        PhraseAnalyserService phraseAnalyserService = new PhraseAnalyserServiceTest();
        String text = "Make America great again";
        String expectedResult = "It stands no chance";
        String actualResult = phraseAnalyserService.analyse(text);
        assertEquals(expectedResult, actualResult, "Test with make and great again");
        System.out.println("makeAndGreatAgainModelTest has passed");
    }

    @Test
    void makeOrGreatAgainModelTest1(){
        PhraseAnalyserService phraseAnalyserService = new PhraseAnalyserService();
        String text = "Make America great cool";
        String expectedResult = "It could be worse";
        String actualResult = phraseAnalyserService.analyse(text);
        assertEquals(expectedResult, actualResult, "Test with make");
        System.out.println("makeOrGreatAgainModelTest1 has passed");
    }

    @Test
    void makeOrGreatAgainModelTest2(){
        PhraseAnalyserService phraseAnalyserService = new PhraseAnalyserService();
        String text = "Let's make America great again";
        String expectedResult = "It could be worse";
        String actualResult = phraseAnalyserService.analyse(text);
        assertEquals(expectedResult, actualResult, "Test with great again");
        System.out.println("makeOrGreatAgainModelTest2 has passed");
    }

    @Test
    void otherModelTest(){
        PhraseAnalyserService phraseAnalyserService = new PhraseAnalyserService();
        String text = "American people";
        String expectedResult = "It is fine, really";
        String actualResult = phraseAnalyserService.analyse(text);
        assertEquals(expectedResult, actualResult, "Test without make and great again");
        System.out.println("otherModelTest has passed");
    }

}