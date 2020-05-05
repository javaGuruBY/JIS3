package by.bariloegor.service;

import by.bariloegor.repository.UniqueWordCounter;
import org.junit.Before;
import org.junit.Test;

import java.util.Map;

import static org.junit.Assert.*;

public class UniqueWordCounterServiceTest {
    private UniqueWordCounterService uniqueWordCounterService;

    @Before
    public void setUp(){
        uniqueWordCounterService = new UniqueWordCounterService();
        UniqueWordCounter.wordCounter.clear();
    }

    @Test
    public void addWordTest() {
        String[] words = {"Cow", "Cow", "Cow", "Snow", "Flow"};
        for (String word : words) {
            uniqueWordCounterService.addWord(word);
        }
        String[] expectedKey = {"Snow", "Cow", "Flow"};
        int[] expectedValue = {1, 3, 1};
        int i = 0;
        for(Map.Entry<String, Integer> entry : UniqueWordCounter.wordCounter.entrySet()) {
            String actualKey = entry.getKey();
            int actualValue = entry.getValue();
            assertEquals("Should add word.", expectedKey[i], actualKey);
            assertEquals("Should add word", expectedValue[i], actualValue);
            i++;
        }
    }

    @Test
    public void isVocabularyContainWordTest() {
        boolean[] expected = {true, false};
        String[] words = {"Cow", "Snow"};
        UniqueWordCounter.wordCounter.put( "Cow", 1);
        for(int i = 0; i < expected.length; i++){
            boolean actual = UniqueWordCounter.wordCounter.containsKey(words[i]);
            assertEquals("Should return is word contain in vocabulary.", expected[i], actual);
        }
    }

    @Test
    public void getMostFrequentWordTest() {
        String[] words = {"Cow", "Cow", "Cow", "Snow", "Flow"};
        for (String word : words) {
            uniqueWordCounterService.addWord(word);
        }
        String expected = "Cow";
        String actual = uniqueWordCounterService.getMostFrequentWord();
        assertEquals("Should return most frequent word.", expected, actual);
    }
}