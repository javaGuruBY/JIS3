package by.mmkle.controller;

import by.mmkle.bean.Tv;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TvControllerTest {
    Tv tv;
    TvController tvController;


    @BeforeEach
    void setUp(){
        tv = new Tv(25, 10, "LG", true);
        tvController = new TvController();
        tvController.setConnectedTv(tv);
    }

    @Test
    void nextChannel() {
        String testMessage = "Should switch channel to the next";
        int expected = 26;
        tvController.nextChannel();
        int actual = tv.getCurrentChannel();
        assertEquals(expected, actual, testMessage);
    }

    @Test
    void previousChannel() {
        String testMessage = "Should switch channel to the previous";
        int expected = 24;
        tvController.previousChannel();
        int actual = tv.getCurrentChannel();
        assertEquals(expected, actual, testMessage);
    }

    @Test
    void volumeUp() {
        String testMessage = "Should volume up";
        int expected = 11;
        tvController.volumeUp();
        int actual = tv.getCurrentVolume();
        assertEquals(expected, actual, testMessage);
    }

    @Test
    void volumeDown() {
        String testMessage = "Should volume down";
        int expected = 9;
        tvController.volumeDown();
        int actual = tv.getCurrentVolume();
        assertEquals(expected, actual, testMessage);
    }

    @Test
    void tvTurnOn() {
        String testMessage = "Should turn on tv";
        boolean expected = true;
        tv.setPowerOn(false);
        tvController.tvTurnOn();
        boolean actual = tv.isPowerOn();
        assertEquals(expected, actual, testMessage);
    }

    @Test
    void tvTurnOff() {
        String testMessage = "Should turn off tv";
        boolean expected = false;
        tv.setPowerOn(true);
        tvController.tvTurnOff();
        boolean actual = tv.isPowerOn();
        assertEquals(expected, actual, testMessage);
    }
}