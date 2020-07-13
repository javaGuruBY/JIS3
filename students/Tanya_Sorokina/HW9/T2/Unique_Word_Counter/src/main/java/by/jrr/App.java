package by.jrr;
import by.jrr.service.UniqueWordCounterService;
import by.jrr.bean.UniqueWordCounter;

public class App {
    public static void main(String[] args) {
        UniqueWordCounterService service1 = new UniqueWordCounterService();
        service1.addWord("one");
        service1.addWord("one");
        service1.addWord("One");
        service1.addWord("OnE");
        service1.addWord("six");
        service1.addWord("six");
        service1.addWord("two");
        service1.addWord("Uno");
        service1.addWord("six");
        service1.addWord("six");
        service1.getMostFrequentWord();
        service1.printWordsFrequency();

    }

}
