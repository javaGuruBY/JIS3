package by.abs.bean;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UniqueVocabularyTest {

    UniqueVocabulary vocabulary;

    @BeforeEach
    void setUp() {
        vocabulary = new UniqueVocabulary();
        UniqueVocabulary.vocabulary.clear();

    }

    @Test
    void addWord() {
        String testMessage = " must add word ";
        String[] expected = {"[words]"};
        String[] words = {"words", " ", "loop", null};

        for (int i = 0; i < expected.length; i++) {
            vocabulary.addWord(words[i]);
            String actual = UniqueVocabulary.vocabulary.toString();
            assertEquals(expected[i], actual, testMessage);

        }
    }

    @Test
    void getWordsCount() {
        String testMessage = " must return words count ";
        int[] expected = {1, 1};
        String[] words = {"words", " ", "loop", null};

        for (int i = 0; i < expected.length; i++) {
            vocabulary.addWord(words[i]);
            int actual = vocabulary.getWordsCount();
            assertEquals(expected[i], actual, testMessage);

        }
    }

}