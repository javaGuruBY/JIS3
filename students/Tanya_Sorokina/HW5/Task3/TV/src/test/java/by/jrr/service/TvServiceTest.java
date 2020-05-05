package by.jrr.service;
import by.jrr.service.TvService;
import by.jrr.bean.TV;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TvServiceTest {
    TV tv;
    TvService tvService;
    @BeforeEach
    void init (){
        tv = new TV();
        tvService = new TvService();
        tv.setTVSwichOn(true);
    }

    @Test
    void switchToTheNextChannelTest() throws Exception {
        tv.setCurrentChannel(1);
        tvService.switchToTheNextChannel(tv);
        int expected = 2;
        int actual = tv.getCurrentChannel();
        assertEquals(expected, actual, "ERROR");
        System.out.println("switchToTheNextChannelTest has passed");
    }

    @Test
    void switchToTheLastChannel() throws Exception {
        tv.setCurrentChannel(5);
        tvService.switchToTheLastChannel(tv);
        int expected = 4;
        int actual = tv.getCurrentChannel();
        assertEquals(expected, actual, "ERROR");
        System.out.println("switchToTheNextChannelTest has passed");
    }

    @Test
    void increaseTheVolumeTest() throws Exception {
        tv.setCurrentVolume(3);
        tvService.increaseTheVolume(tv);
        int expected = 4;
        int actual = tv.getCurrentVolume();
        assertEquals(expected, actual, "ERROR");
        System.out.println("increaseTheVolumeTest has passed");
    }

    @Test
    void decreaseTheVolumeTest() throws Exception {
        tv.setCurrentVolume(10);
        tvService.decreaseTheVolume(tv);
        int expected = 9;
        int actual = tv.getCurrentVolume();
        assertEquals(expected, actual, "ERROR");
        System.out.println("decreaseTheVolumeTest has passed");
    }

    @Test
    void swichOnTVTest() {
        boolean expected = true;
        tvService.swichOnTV(tv);
        boolean actual = tv.isTVSwichOn();
        assertEquals(expected, actual, "ERROR");
        System.out.println("swichOnTVTest has passed");
    }


    @Test
    void swichOffTVTest() {
        boolean expected = false;
        tvService.swichOffTV(tv);
        boolean actual = tv.isTVSwichOn();
        assertEquals(expected, actual, "ERROR");
        System.out.println("swichOffTVTest has passed");
    }
}