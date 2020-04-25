package by.mmkle.service;

import by.mmkle.repository.UniqueWordCounter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UniqueWordCounterServiceTest {
    UniqueWordCounterService service;


    @BeforeEach
    void setUp(){
        service = new UniqueWordCounterService();
        UniqueWordCounter.counter.clear();
    }

    @Test
    void add() {
        String testMessage = "Should add word";
        String[] expected = {
                "{maxim=1}",
                "{maxim=2}",
                "{maxim=2, max=1}"
        };

        String[] words = {
                "maxim",
                "maxim",
                "max"
        };

        for (int i = 0; i < expected.length; i++){
            service.add(words[i]);
            String actual = UniqueWordCounter.counter.toString();
            assertEquals(expected[i], actual, testMessage);
        }
    }

    @Test
    void getMostFrequentWord() {
        String testMessage = "Should return most frequent word";
        String[] expected = {
                "maxim",
                "maxim",
                "max"
        };

        String[] words = {
                "maxim",
                "max",
                "max"
        };

        for (int i = 0; i < expected.length; i++){
            service.add(words[i]);
            String actual = service.getMostFrequentWord();
            assertEquals(expected[i], actual, testMessage);
        }
    }

    @Test
    void printFrequency() {
    }
}