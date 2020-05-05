package by.jrr.uniqueWordVocabulary.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

class UniqueWordVocabularyTest {
    Set<String> hashSetTest;
    UniqueWordVocabulary uniqueWordVocabulary;

    @BeforeEach
    void init() {
        hashSetTest = new HashSet<>();
        uniqueWordVocabulary = new UniqueWordVocabulary();
    }

    @Test
    void addWordTest() {
        boolean expected = true;
        uniqueWordVocabulary.addWord(hashSetTest, "Freedom");
        boolean actual = hashSetTest.contains("Freedom");
        assertEquals(expected,actual, "[ERROR]: expected " + expected + ", but actual: " + actual);

    }
    @Test
    void addWordTestIfStringIsNotEmpty() {
        boolean [] expected = {true, false, false};
        String [] word = {"FreeDom", "", " "};
        for (int i = 0; i < expected.length ; i++) {
            boolean actual = uniqueWordVocabulary.isWordNotEmpty(word[i]);
            assertEquals(expected[i],actual, "[ERROR]: expected " + expected[i] + ", but actual: " + actual);
        }


    }
    @Test
    void addWordTestIfWordIsDuplicate() {
        int expected = 1;
        uniqueWordVocabulary.addWord(hashSetTest, "Test");
        uniqueWordVocabulary.addWord(hashSetTest, "Test");
        int actual = hashSetTest.size();
        assertEquals(expected,actual, "[ERROR]: expected " + expected + ", but actual: " + actual);

    }

    @Test
    void getWordsCount() {
        int expected = 4;
        uniqueWordVocabulary.addWord(hashSetTest, "Test");
        uniqueWordVocabulary.addWord(hashSetTest, "Test");
        uniqueWordVocabulary.addWord(hashSetTest, "NewTest");
        uniqueWordVocabulary.addWord(hashSetTest, "GoogleTest");
        uniqueWordVocabulary.addWord(hashSetTest, "Similar");
        uniqueWordVocabulary.addWord(hashSetTest, "Test");
        int actual = uniqueWordVocabulary.getWordsCount(hashSetTest);
        assertEquals(expected,actual, "[ERROR]: expected " + expected + ", but actual: " + actual);
    }
}