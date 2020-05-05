package by.bariloegor;

import by.bariloegor.service.UniqueWordCounterService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class App {
    public static void main(String[] args) {
        Logger log = LoggerFactory.getLogger(App.class);
        UniqueWordCounterService uniqueWordCounterService = new UniqueWordCounterService();
        uniqueWordCounterService.addWord("Cow");
        uniqueWordCounterService.addWord("Cow");
        uniqueWordCounterService.addWord("Cow");
        uniqueWordCounterService.addWord("Snow");
        uniqueWordCounterService.addWord("Snow");
        uniqueWordCounterService.addWord("Glow");
        uniqueWordCounterService.addWord("Flow");
        String resultOfMostFrequentWord = uniqueWordCounterService.getMostFrequentWord();
        uniqueWordCounterService.printWordsFrequency();
        log.info(resultOfMostFrequentWord);

    }
}
