import by.bariloegor.bean.Counter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CounterTest {
private Counter counter;

@BeforeEach
    void setUp(){
    counter = new Counter();
}

@Test
    void setValueOfCounterInRangeTest(){
    int expected = 50;
    counter.setValue(50);
    int actual = counter.getValue();
    assertEquals(expected, actual, "Value should be 50.");
}

@Test
    void setValueOfCounterOutRangeTest(){
    int expected = 0;
    counter.setValue(150);
    int actual = counter.getValue();
    assertEquals(expected, actual, "Tried to set value of counter to 150, should be 0.");
    counter.setValue(-2);
    assertEquals(expected, actual, "Tried to set value of counter to -2, should be 0.");
}

@Test
    void setStepOfCounterInRangeTest(){
        int expected = 5;
        counter.setStep(5);
        int actual = counter.getStep();
        assertEquals(expected, actual, "Step should be 5.");
    }

@Test
    void setStepOfCounterOutRangeTest(){
        int expected = 1;
        counter.setStep(15);
        int actual = counter.getStep();
        assertEquals(expected, actual, "Tried to set step of counter to 15, should be 1.");
        counter.setStep(-2);
        assertEquals(expected, actual, "Tried to set step of counter to -2, should be 1.");
}
}
