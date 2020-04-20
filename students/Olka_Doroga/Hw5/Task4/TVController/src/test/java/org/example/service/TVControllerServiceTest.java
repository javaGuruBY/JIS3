package org.example.service;

import org.example.bean.TV;
import org.example.bean.TVController;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TVServiceTest {

    @Test
    void nextChannel() {
        TV tv = new TV();
        TVController tvController = new TVController();
        TVControllerService tvControllerService = new TVControllerService();
        tvControllerService.connectToTv(tvController);
        int expected = 2;
        tvControllerService.nextChannel(tv, tvController);
        int actual = tv.getCurrentChannel();
        assertEquals(expected, actual, "111");
    }

    @Test
    void previousChannel() {
        TV tv = new TV();
        TVController tvController = new TVController();
        TVControllerService tvControllerService = new TVControllerService();
        tvControllerService.connectToTv(tvController);
        int expected = 0;
        tvControllerService.previousChannel(tv, tvController);
        int actual = tv.getCurrentChannel();
        assertEquals(expected, actual, "222");
    }

    @Test
    void volumeUp() {
        TV tv = new TV();
        TVController tvController = new TVController();
        TVControllerService tvControllerService = new TVControllerService();
        tvControllerService.connectToTv(tvController);
        int expected = 6;
        tvControllerService.volumeUp(tv, tvController);
        int actual = tv.getCurrentVolume();
        assertEquals(expected, actual, "333");
    }

    @Test
    void volumeDown() {
        TV tv = new TV();
        TVController tvController = new TVController();
        TVControllerService tvControllerService = new TVControllerService();
        tvControllerService.connectToTv(tvController);
        int expected = 4;
        tvControllerService.volumeDown(tv, tvController);
        int actual = tv.getCurrentVolume();
        assertEquals(expected, actual, "444");
    }

    @Test
    void tvOn() {
        TV tv = new TV();
        TVController tvController = new TVController();
        TVControllerService tvControllerService = new TVControllerService();
        tvControllerService.connectToTv(tvController);
        boolean expected = true;
        tvControllerService.tvOn(tv, tvController);
        boolean actual = tv.isTvOn();
        assertEquals(expected, actual, "555");
    }

    @Test
    void tvOff() {
        TV tv = new TV();
        TVController tvController = new TVController();
        TVControllerService tvControllerService = new TVControllerService();
        tvControllerService.connectToTv(tvController);
        boolean expected = false;
        tvControllerService.tvOff(tv, tvController);
        boolean actual = tv.isTvOn();
        assertEquals(expected, actual, "666");
    }
}