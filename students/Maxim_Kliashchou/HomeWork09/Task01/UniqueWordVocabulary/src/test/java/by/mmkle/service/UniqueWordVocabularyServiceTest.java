package by.mmkle.service;

import by.mmkle.repository.UniqueWordVocabulary;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Collections;

import static org.junit.jupiter.api.Assertions.*;

class UniqueWordVocabularyServiceTest {
    UniqueWordVocabularyService service;

    @BeforeEach
    void setUp(){
        service = new UniqueWordVocabularyService();
        UniqueWordVocabulary.vocabulary.clear();
    }

    @Test
    void add() {
        String testMessage = "Should add word";
        String[] expected = {
                "[maxim]",
                "[maxim]",
                "[maxim]",
                "[maxim]"
        };

        String[] words = {"maxim", "", null, "maxim"};

        for (int i = 0; i < expected.length; i++){
            service.add(words[i]);
            String actual = UniqueWordVocabulary.vocabulary.toString();
            assertEquals(expected[i], actual, testMessage);

        }

    }

    @Test
    void getWordsCount() {
        String testMessage = "Should return words count";
        int[] expected = {1, 1, 1, 1};

        String[] words = {"maxim", "", null, "maxim"};

        for (int i = 0; i < expected.length; i++){
            service.add(words[i]);
            int actual = service.getWordsCount();
            assertEquals(expected[i], actual, testMessage);

        }
    }
}