package by.mmkle.service;

import by.mmkle.bean.Tv;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TvServiceTest {
    Tv tv;
    TvService tvService;

    @BeforeEach
    void setUp(){
        tv = new Tv(25, 10, "LG", true);
        tvService = new TvService();
    }

    @Test
    void nextChannelWhenTvIsOn() {
        String testMessage = "Should switch channel to the next";
        int expected = 26;
        tvService.nextChannel(tv);
        int actual = tv.getCurrentChannel();
        assertEquals(expected, actual, testMessage);
    }

    @Test
    void previousChannelWhenTvIsOn() {
        String testMessage = "Should switch channel to the previous";
        int expected = 24;
        tvService.previousChannel(tv);
        int actual = tv.getCurrentChannel();
        assertEquals(expected, actual, testMessage);
    }

    @Test
    void volumeUpWhenTvIsOn() {
        String testMessage = "Should volume up";
        int expected = 11;
        tvService.volumeUp(tv);
        int actual = tv.getCurrentVolume();
        assertEquals(expected, actual, testMessage);
    }

    @Test
    void volumeDownWhenTvIsOn() {
        String testMessage = "Should volume down";
        int expected = 9;
        tvService.volumeDown(tv);
        int actual = tv.getCurrentVolume();
        assertEquals(expected, actual, testMessage);
    }

    @Test
    void nextChannelWhenTvIsOff() {
        String testMessage = "Shouldn't switch channel to the next";
        int expected = 25;
        tv.setPowerOn(false);
        tvService.nextChannel(tv);
        int actual = tv.getCurrentChannel();
        assertEquals(expected, actual, testMessage);
    }

    @Test
    void previousChannelWhenTvIsOff() {
        String testMessage = "Shouldn't switch channel to the previous";
        int expected = 25;
        tv.setPowerOn(false);
        tvService.previousChannel(tv);
        int actual = tv.getCurrentChannel();
        assertEquals(expected, actual, testMessage);
    }

    @Test
    void volumeUpWhenTvIsOff() {
        String testMessage = "Shouldn't volume up";
        int expected = 10;
        tv.setPowerOn(false);
        tvService.volumeUp(tv);
        int actual = tv.getCurrentVolume();
        assertEquals(expected, actual, testMessage);
    }

    @Test
    void volumeDownWhenTvIsOff() {
        String testMessage = "Shouldn't volume down";
        int expected = 10;
        tv.setPowerOn(false);
        tvService.volumeDown(tv);
        int actual = tv.getCurrentVolume();
        assertEquals(expected, actual, testMessage);
    }

    @Test
    void tvTurnOn() {
        String testMessage = "Should turn on tv";
        boolean expected = true;
        tv.setPowerOn(false);
        tvService.tvTurnOn(tv);
        boolean actual = tv.isPowerOn();
        assertEquals(expected, actual, testMessage);
    }

    @Test
    void tvTurnOff() {
        String testMessage = "Should turn off tv";
        boolean expected = false;
        tv.setPowerOn(true);
        tvService.tvTurnOff(tv);
        boolean actual = tv.isPowerOn();
        assertEquals(expected, actual, testMessage);
    }
}