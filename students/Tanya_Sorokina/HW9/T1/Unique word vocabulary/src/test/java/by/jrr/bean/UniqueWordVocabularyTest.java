package by.jrr.bean;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class UniqueWordVocabularyTest {

    Set<String> vocabularySetTest;
    UniqueWordVocabulary uniqueWordVocabulary;

    @BeforeEach
    void init(){
        vocabularySetTest = new HashSet<>();
        uniqueWordVocabulary = new UniqueWordVocabulary();
    }

    @Test
    void addWordTest() {
        uniqueWordVocabulary.addWord(vocabularySetTest, "One");
        boolean expected = true;
        boolean actual = vocabularySetTest.contains("One");
        assertEquals(expected, actual, "ERROR: expected - " + expected + ", but actual - " + actual);
        System.out.println("addWordTest has passed.");
    }


    @Test
    void addWordDuplicateTest() {
        uniqueWordVocabulary.addWord(vocabularySetTest, "One");
        uniqueWordVocabulary.addWord(vocabularySetTest, "One");
        int expected = 1;
        int actual = vocabularySetTest.size();
        assertEquals(expected, actual, "ERROR: expected - " + expected + ", but actual - " + actual);
        System.out.println("addWordDuplicateTest has passed.");
    }

    @Test
    void addWordNullTest() {
        uniqueWordVocabulary.addWord(vocabularySetTest, "One");
        uniqueWordVocabulary.addWord(vocabularySetTest, null);
        uniqueWordVocabulary.addWord(vocabularySetTest, " ");
        int expected = 1;
        int actual = vocabularySetTest.size();
        assertEquals(expected, actual, "ERROR: expected - " + expected + ", but actual - " + actual);
        System.out.println("addWordNullTest has passed.");
    }

    @Test
    void getWordsCountTest() {
        uniqueWordVocabulary.addWord(vocabularySetTest, "One");
        uniqueWordVocabulary.addWord(vocabularySetTest, null);
        uniqueWordVocabulary.addWord(vocabularySetTest, " ");
        uniqueWordVocabulary.addWord(vocabularySetTest, "Two");
        uniqueWordVocabulary.addWord(vocabularySetTest, "null");
        uniqueWordVocabulary.addWord(vocabularySetTest, "Three");
        uniqueWordVocabulary.addWord(vocabularySetTest, "Zero");
        int expected = 5;
        int actual = uniqueWordVocabulary.getWordsCount(vocabularySetTest);
        assertEquals(expected, actual, "ERROR: expected - " + expected + ", but actual - " + actual);
        System.out.println("getWordsCountTest has passed.");
    }

}