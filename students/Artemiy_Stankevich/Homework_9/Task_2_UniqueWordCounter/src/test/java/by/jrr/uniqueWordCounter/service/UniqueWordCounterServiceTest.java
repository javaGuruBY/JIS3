package by.jrr.uniqueWordCounter.service;

import by.jrr.uniqueWordCounter.collection.UniqueWordCounter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UniqueWordCounterServiceTest {

    UniqueWordCounter uniqueWordCounter;
    UniqueWordCounterService uniqueWordCounterService;

    @BeforeEach
    void setUp() {
        uniqueWordCounter = new UniqueWordCounter();
        uniqueWordCounterService = new UniqueWordCounterService();
        uniqueWordCounter.counterMap.clear();
    }

    @Test
    void addWord() {
        String [] expected = {"{apple=1}", "{apple=1, potatoes=1}", "{apple=2, potatoes=1}"};
        String [] word = {"apple", "potatoes", "apple"};
        for (int i = 0; i < expected.length; i++) {
            uniqueWordCounterService.addWord(word[i]);
            String actual = uniqueWordCounter.counterMap.toString();
            assertEquals(expected[i], actual, "[ERROR]: expected " + expected + ", but was " +
                    "actual " + actual);
        }
    }

    @Test
    void getMostFrequentWord() {
        String expected = "apple";
        String [] word = {"apple", "lemon", "orange", "apple", "apple"};
        for (int i = 0; i < word.length; i++) {
            uniqueWordCounterService.addWord(word[i]);
        }
        String actual = uniqueWordCounterService.getMostFrequentWord();
        assertEquals(expected, actual, "[ERROR] method should be return MOST frequent word");
        
    }
}