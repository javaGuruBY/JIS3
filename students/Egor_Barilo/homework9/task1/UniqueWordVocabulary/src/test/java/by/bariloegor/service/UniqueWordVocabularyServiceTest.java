package by.bariloegor.service;

import org.junit.Before;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.*;

public class UniqueWordVocabularyServiceTest {
    private UniqueWordVocabularyService uniqueWordVocabularyService;
    private Set<String> vocabulary;

    @Before
    public void setUp(){
        vocabulary = new HashSet<>();
        uniqueWordVocabularyService = new UniqueWordVocabularyService();
    }

    @Test
    public void addWordTest() {
        boolean expected = true;
        String[] words = {"Apple", "Nose"};
        for (String word : words) {
            uniqueWordVocabularyService.addWord(vocabulary, word);
            boolean actual = vocabulary.contains(word);
            assertEquals("Should add word.", expected, actual);
        }
    }

    @Test
    public void isWordNotEmptyTest() {
        boolean[] expected = {true, false, false};
        String[] words = {"Cow", "", " "};
        for(int i = 0; i < expected.length; i++){
            boolean actual = uniqueWordVocabularyService.isWordNotEmpty(words[i]);
            assertEquals("Should return is word not empty.", expected[i], actual);
        }
    }

    @Test
    public void isWordNotDuplicateTest() {
        boolean[] expected = {true, false};
        String[] words = {"Cow", "Snow"};
        vocabulary.add("Snow");
        for(int i = 0; i < expected.length; i++){
            boolean actual = uniqueWordVocabularyService.isWordNotDuplicate(vocabulary, words[i]);
            assertEquals("Should return is word not duplicate.", expected[i], actual);
        }
    }

    @Test
    public void getWordCountTest() {
        int expected = 2;
        vocabulary.add("Mom");
        vocabulary.add("Dad");
        int actual = uniqueWordVocabularyService.getWordCount(vocabulary);
        assertEquals("Should return num of words in vocabulary.", expected, actual);

        expected = 0;
        vocabulary.clear();
        actual = uniqueWordVocabularyService.getWordCount(vocabulary);
        assertEquals("Should return num of words in vocabulary.", expected, actual);
    }
}