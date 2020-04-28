package by.khilko.service;

import by.khilko.bean.Tv;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TvserviceTest {

    @Test
    void channelUp() {
        Tv newTv = new Tv("Sony",25, 20,true);
        Tvservice service = new Tvservice();
        service.channelUp(newTv);

        String message = "Should switch to channel above";
        int expected = 26;
        int actual = newTv.getChannelTv();

        assertEquals(expected, actual, message);
    }

    @Test
    void channelDown() {
        Tv newTv = new Tv("Sony",25, 20,true);
        Tvservice service = new Tvservice();
        service.channelDown(newTv);

        String message = "Should switch to channel below";
        int expected = 24;
        int actual = newTv.getChannelTv();

        assertEquals(expected, actual, message);
    }

    @Test
    void soundUp() {
        Tv newTv = new Tv("Sony",25, 20,true);
        Tvservice service = new Tvservice();
        service.soundUp(newTv);

        String message = "Should be sound up";
        int expected = 21;
        int actual = newTv.getSoundTv();

        assertEquals(expected, actual, message);
    }

    @Test
    void soundDown() {
        Tv newTv = new Tv("Sony",25, 20,true);
        Tvservice service = new Tvservice();
        service.soundDown(newTv);

        String message = "Should be sound down";
        int expected = 19;
        int actual = newTv.getSoundTv();

        assertEquals(expected, actual, message);
    }

    @Test
    void turnOnTv() {
        Tv newTv = new Tv("Sony",25, 20,false);
        Tvservice service = new Tvservice();
        service.turnOnTv(newTv);

        String message = "Tv should be on";
        boolean expected = true;
        boolean actual = newTv.isWorksTv();

        assertEquals(expected, actual, message);
    }

    @Test
    void turnOffTv() {
        Tv newTv = new Tv("Sony",25, 20,true);
        Tvservice service = new Tvservice();
        service.turnOffTv(newTv);

        String message = "Tv should be off";
        boolean expected = false;
        boolean actual = newTv.isWorksTv();

        assertEquals(expected, actual, message);
    }
}