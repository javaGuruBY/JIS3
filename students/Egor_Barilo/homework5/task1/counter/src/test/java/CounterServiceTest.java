import by.bariloegor.bean.Counter;
import by.bariloegor.service.CounterService;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CounterServiceTest {
    private CounterService counterService = new CounterService();
    private Counter counter;

    @BeforeEach
    void setUp(){
        counter = new Counter();
    }

    @Test
    void resetTest(){
        Counter expected = counter;
        counter.setValue(84);
        counter.setStep(4);
        counterService.reset(counter);
        Counter actual = counter;
        assertEquals(expected, actual, "Value and step should be default(0; 1).");
    }

    @Test
    void incrementTest(){
        int expected = 1;
        counterService.increment(counter);
        int actual = counter.getValue();
        assertEquals(expected, actual, "Value should be 1.");
    }

    @Test
    void incrementOutRangeTest(){
        int expected = 100;
        counter.setValue(100);
        counterService.increment(counter);
        int actual = counter.getValue();
        assertEquals(expected, actual, "Value should be 100.");
    }

    @Test
    void decrementTest(){
        int expected = 0;
        counter.setValue(1);
        counterService.decrement(counter);
        int actual = counter.getValue();
        assertEquals(expected, actual, "Value should be 0.");
    }

    @Test
    void decrementOutRangeTest(){
        int expected = 0;
        counterService.decrement(counter);
        int actual = counter.getValue();
        assertEquals(expected, actual, "Value should be 0.");
    }


}
