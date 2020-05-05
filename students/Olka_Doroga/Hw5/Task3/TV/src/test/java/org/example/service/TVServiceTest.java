package org.example.service;

import org.example.bean.TV;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TVServiceTest {

    @Test
    void nextChannel() {
        TV tv = new TV();
        int expected = 2;
        TVService tvService = new TVService();
        tvService.nextChannel(tv);
        int actual = tv.getCurrentChannel();
        assertEquals(expected, actual, "111");
    }

    @Test
    void previousChannel() {
        TV tv = new TV();
        int expected = 0;
        TVService tvService = new TVService();
        tvService.previousChannel(tv);
        int actual = tv.getCurrentChannel();
        assertEquals(expected, actual, "222");
    }

    @Test
    void volumeUp() {
        TV tv = new TV();
        int expected = 6;
        TVService tvService = new TVService();
        tvService.volumeUp(tv);
        int actual = tv.getCurrentVolume();
        assertEquals(expected, actual, "333");
    }

    @Test
    void volumeDown() {
        TV tv = new TV();
        int expected = 4;
        TVService tvService = new TVService();
        tvService.volumeDown(tv);
        int actual = tv.getCurrentVolume();
        assertEquals(expected, actual, "444");
    }

    @Test
    void tvOn() {
        TV tv = new TV();
        boolean expected = true;
        TVService tvService = new TVService();
        tvService.tvOn(tv);
        boolean actual = tv.isTvOn();
        assertEquals(expected, actual, "555");
    }

    @Test
    void tvOff() {
        TV tv = new TV();
        boolean expected = false;
        TVService tvService = new TVService();
        tvService.tvOff(tv);
        boolean actual = tv.isTvOn();
        assertEquals(expected, actual, "666");
    }
}