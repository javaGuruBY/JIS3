import static org.junit.jupiter.api.Assertions.*;

import by.bariloegor.bean.Tv;
import by.bariloegor.service.TvService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TvServiceTest {
    private TvService tvService = new TvService();
    private Tv tv;

    @BeforeEach
    void setUp(){
        tv = new Tv(1,20, "Samsung");
    }

    @Test
    void switchToNextChannelTest(){
        int expected = 2;
        tvService.turnOn(tv);
        tvService.switchToNextChannel(tv);
        int actual = tv.getCurrentChannel();
        assertEquals(expected, actual, "Number of channel should be 2.");
    }

    @Test
    void switchToPreviousChannelTest(){
        int expected = 5;
        tv.setCurrentChannel(6);
        tvService.turnOn(tv);
        tvService.switchToPreviousChannel(tv);
        int actual = tv.getCurrentChannel();
        assertEquals(expected, actual, "Number of channel should be 5.");
    }

    @Test
    void increaseVolumeTest(){
        int expected = 21;
        tvService.turnOn(tv);
        tvService.increaseVolume(tv);
        int actual = tv.getCurrentVolume();
        assertEquals(expected, actual, "Value of volume should be 21.");
    }

    @Test
    void decreaseVolumeTest(){
        int expected = 19;
        tvService.turnOn(tv);
        tvService.decreaseVolume(tv);
        int actual = tv.getCurrentVolume();
        assertEquals(expected, actual, "Value of volume should be 19.");
    }

    @Test
    void turnOnTest(){
        boolean expected = true;
        tvService.turnOn(tv);
        boolean actual = tv.isPowerOn();
        assertEquals(expected, actual, "TV should be on.");
    }

    @Test
    void turnOffTest(){
        boolean expected = false;
        tvService.turnOn(tv);
        tvService.turnOff(tv);
        boolean actual = tv.isPowerOn();
        assertEquals(expected, actual, "TV should be off.");
    }

}
