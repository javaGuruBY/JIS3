package by.ryba.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class UniqueWordVocabularyServiceTest {
    UniqueWordVocabularyService service;
    Set<String> set;

    @BeforeEach
    void setUp() {
        service = new UniqueWordVocabularyService();
        set = new LinkedHashSet<>();
        set.add("123456");
        set.add("9945");
        set.add("Hello");
    }

    @Test
    void addWord() {
        service.addWord(set, "888");
        boolean actual = set.contains("888");
        assertTrue(actual);
    }

    @Test
    void getWordsCount() {
        int expected = 3;
        int actual = service.getWordsCount(set);
        assertEquals(expected, actual);
    }

}