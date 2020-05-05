package service;

import bean.TV;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TvServiceTest {
    TV tv;
    TvService tvService;

    @BeforeEach
    void setUp() {
        tv = new TV(66, 66, "panasonic", true);
        tvService = new TvService();
    }

    @Test
    void turnOnTv() {
        String testMessage = "tv is on";
        boolean expected = true;
        tv.setPowerOn(false);
        tvService.turnOnTv(tv);
        boolean actual = tv.isPowerOn();
       assertEquals(expected, actual, testMessage);
    }

    @Test
    void turnOffTv() {
        String testMessage = "tv is off";
        boolean expected = false;
        tv.setPowerOn(true);
        tvService.turnOffTv(tv);
        boolean actual = tv.isPowerOn();
        assertEquals(expected, actual, testMessage);
    }

    @Test
    void nextChannel() {
        String testMessage = "switch to the next channel";
        int expected = 67;
        tvService.nextChannel(tv);
        int actual = tv.getCurrentChannel();
        assertEquals(expected, actual, testMessage);
    }

    @Test
    void previousChannel() {
        String testMessage = "switch to the previous channel";
        int expected = 65;
        tvService.previousChannel(tv);
        int actual = tv.getCurrentChannel();
        assertEquals(expected, actual, testMessage);
    }

    @Test
    void volumeUp() {
        String testMessage = "put volume up i cant hear a thing";
        int expected = 67;
        tvService.volumeUp(tv);
        int actual = tv.getCurrentVolume();
        assertEquals(expected, actual, testMessage);

    }

    @Test
    void volumeDown() {
        String testMessage = "wtf put volume down";
        int expected = 65;
        tvService.volumeDown(tv);
        int actual = tv.getCurrentVolume();
        assertEquals(expected, actual, testMessage);

    }

    @Test
    public void changeChannelWhenPowerOff() {
        String testMessage = "turn on tv first";
        int expected = 66;
        tv.setPowerOn(false);
        tvService.nextChannel(tv);
        int actual = tv.getCurrentChannel();
        assertEquals(expected, actual, testMessage);
    }

    @Test
    public void changeVolumeWhenPowerOff(){
        String testMessage = "you are so high trying to do it again";
        int expected = 66;
        tv.setPowerOn(false);
        tvService.volumeDown(tv);
        int actual = tv.getCurrentChannel();
        assertEquals(expected, actual, testMessage);

    }
}