import by.jrr.uniqueWordCounter.service.UniqueWordCounterService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class App {
    public static void main(String[] args) {
        Logger logger = LoggerFactory.getLogger(App.class);
        UniqueWordCounterService service = new UniqueWordCounterService();
        service.addWord("BMW");
        service.addWord("Audi");
        service.addWord("Mazda 6");
        service.addWord("BMW");
        service.addWord("Mazda 6");
        service.addWord("Mazda 6");
        service.printWordsFrequency();
        logger.info(service.getMostFrequentWord());
    }
}
