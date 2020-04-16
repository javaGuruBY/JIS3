package by.jrr.service;

import by.jrr.bean.TV;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TVServiceTest {

    @Test
    void nextChannel() {
        int expectedResult = 10;
        TV tv = new TV(9);
        tv.setIfTVIsOn(true);
        TVService tvService = new TVService();
        tvService.nextChannel(tv);

        assertEquals(expectedResult, tv.getCurrentChannel(), "next channel should be 10");
    }

    @Test
    void previousChannel() {
        int expectedResult = 8;
        TV tv = new TV(9);
        tv.setIfTVIsOn(true);
        TVService tvService = new TVService();
        tvService.previousChannel(tv);

        assertEquals(expectedResult, tv.getCurrentChannel(), "previous channel should be 8");
    }

    @Test
    void volumeUp() {
        int expectedResult = 10;
        TV tv = new TV();
        tv.setIfTVIsOn(true);
        tv.setCurrentVolume(9);
        TVService tvService = new TVService();
        tvService.volumeUp(tv);

        assertEquals(expectedResult, tv.getCurrentVolume(), "current volume should be 10");
    }

    @Test
    void volumeDown() {
        int expectedResult = 8;
        TV tv = new TV();
        tv.setIfTVIsOn(true);
        tv.setCurrentVolume(9);
        TVService tvService = new TVService();
        tvService.volumeDown(tv);

        assertEquals(expectedResult, tv.getCurrentVolume(), "current volume should be 8");
    }
}
