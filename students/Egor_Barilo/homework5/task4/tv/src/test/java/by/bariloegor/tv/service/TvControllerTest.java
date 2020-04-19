package by.bariloegor.tv.service;

import by.bariloegor.tv.bean.Tv;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TvControllerTest {
    private TvController tvController = new TvController();
    private Tv tv;
    @Before
    public void setUp(){
        tv = new Tv(1,20,"Samsung");
        tvController.connectToTv(tv);
        tvController.turnOn();
    }

    @Test
    public void switchToNextChannelTest(){
        int expected = 2;
        tvController.switchToNextChannel();
        int actual = tv.getCurrentChannel();
        assertEquals("Number of channel should be 2.", expected, actual);
    }

    @Test
    public void switchToPreviousChannelTest(){
        int expected = 5;
        tv.setCurrentChannel(6);
        tvController.switchToPreviousChannel();
        int actual = tv.getCurrentChannel();
        assertEquals("Number of channel should be 5.",expected, actual);
    }

    @Test
    public void increaseVolumeTest(){
        int expected = 21;
        tvController.increaseVolume();
        int actual = tv.getCurrentVolume();
        assertEquals("Value of volume should be 21.", expected, actual);
    }

    @Test
    public void decreaseVolumeTest(){
        int expected = 19;
        tvController.decreaseVolume();
        int actual = tv.getCurrentVolume();
        assertEquals("Value of volume should be 19.", expected, actual);
    }

    @Test
    public void turnOnTest(){
        boolean expected = true;
        boolean actual = tv.isPowerOn();
        assertEquals("TV should be on.", expected, actual);
    }

    @Test
    public void turnOffTest(){
        boolean expected = false;
        tvController.turnOff();
        boolean actual = tv.isPowerOn();
        assertEquals("TV should be off.", expected, actual);
    }

    @Test
    public void connectToTvTest(){
        boolean expected = true;
        Tv testTv = new Tv(1,20,"LG");
        tvController.connectToTv(testTv);
        tvController.turnOn();
        boolean actual = testTv.isPowerOn();
        assertEquals("Tv should be on.", expected, actual);
    }

}