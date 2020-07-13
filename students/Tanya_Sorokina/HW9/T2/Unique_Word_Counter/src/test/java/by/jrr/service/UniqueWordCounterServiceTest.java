package by.jrr.service;
import by.jrr.bean.UniqueWordCounter;
import by.jrr.service.UniqueWordCounterService;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

class UniqueWordCounterServiceTest {
    UniqueWordCounterService service;

    @BeforeEach
    void setUp() {
        service = new UniqueWordCounterService();
        UniqueWordCounter.counter.clear();
    }

    @org.junit.jupiter.api.Test
    void addWordTest() {
        String[] expected = {
                "{one=1}",
                "{one=2}",
                "{one=2, uno=1}"
        };
        String[] words = {
                "one",
                "one",
                "uno"
        };
        for (int i = 0; i < expected.length; i++) {
            service.addWord(words[i]);
            String actual = UniqueWordCounter.counter.toString();
            assertEquals(expected[i], actual, "Error");
            System.out.println("addWordTest has pass");
        }
    }

    @org.junit.jupiter.api.Test
    void getMostFrequentWordTest() {
        String[] expected = {
                "one",
                "one",
                "uno"
        };
        String[] words = {
                "one",
                "uno",
                "uno"
        };
        for (int i = 0; i < expected.length; i++) {
            service.addWord(words[i]);
            String actual = service.getMostFrequentWord();
            assertEquals(expected[i], actual, "Error");
            System.out.println("addWordTest has pass");
        }
    }
}