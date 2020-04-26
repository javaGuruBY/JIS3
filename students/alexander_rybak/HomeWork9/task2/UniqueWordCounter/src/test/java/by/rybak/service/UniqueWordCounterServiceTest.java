package by.rybak.service;

import by.rybak.bean.UniqueWordCounter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UniqueWordCounterServiceTest {
    UniqueWordCounterService service;
    UniqueWordCounter counter;

    @BeforeEach
    public void setIp(){
        service = new UniqueWordCounterService();
        counter = new UniqueWordCounter();
        counter.getMap().put("543", "Parrot");
        counter.getMap().put("123", "Gvard");
        counter.getMap().put("768", "Hello");
        counter.getMap().put("123456", "Parrot");
    }

    @Test
    void addWord() {
        int expected = 3;
        service.addWord(counter, "Parrot");
        int actual = service.countsTheNumberOfRepeatedLines(counter.getMap(), "Parrot");

        assertEquals(expected, actual);
    }

    @Test
    void getMostFrequentWord() {
        int expected = 2;
        int actual = service.getMostFrequentWord(counter);

        assertEquals(expected, actual);
    }

    @Test
    void countsTheNumberOfRepeatedLines() {
        int expected = 2;
        int actual = service.countsTheNumberOfRepeatedLines(counter.getMap(), "Parrot");

        assertEquals(expected,actual);
    }
}