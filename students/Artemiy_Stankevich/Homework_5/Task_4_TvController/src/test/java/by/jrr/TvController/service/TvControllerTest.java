package by.jrr.TvController.service;

import by.jrr.TvController.bean.Tv;
import netscape.security.UserTarget;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TvControllerTest {
    Tv tv;
    TvController tvController;
    @BeforeEach
    void init() {
        tv = new Tv();
        tvController = new TvController();
        tvController.setConnectTheTvWithRemoteController(true);
        tvController.turnOnTv(tv);
    }
    @Test
    void turnOnNextChannel() throws Exception {
        int expected = 1;
        tvController.turnOnNextChannel(tv);
        int actual = tv.getCurrentChannel();
        assertEquals(expected, actual, "[ERROR]");
    }

    @Test
    void turnOnPreviousChannel() throws Exception {
        tv.setCurrentChannel(10);
        int expected = 9;
        tvController.turnOnPreviousChannel(tv);
        int actual = tv.getCurrentChannel();
        assertEquals(expected, actual, "[ERROR]");
    }

    @Test
    void increaseSound() throws Exception {
        int expected = 1;
        tvController.increaseSound(tv);
        int actual = tv.getCurrentVolume();
        assertEquals(expected, actual, "[ERROR]");
    }

    @Test
    void decreaseSound() throws Exception {
        tv.setCurrentVolume(5);
        int expected = 4;
        tvController.decreaseSound(tv);
        int actual = tv.getCurrentVolume();
        assertEquals(expected, actual, "[ERROR]");
    }

    @Test
    void turnOnTv() {
        boolean expected = true;
        tvController.turnOnTv(tv);
        boolean actual = tv.isTvOn();
        assertEquals(expected, actual, "[ERROR]");
    }

    @Test
    void turnOffTv() {
        boolean expected = false;
        tvController.turnOffTv(tv);
        boolean actual = tv.isTvOn();
        assertEquals(expected, actual, "[ERROR]");
    }
    @Test
    void ExceptionTestController() throws Exception {
        tv.setTvOn(false);
        assertThrows(Exception.class,() -> { tvController.increaseSound(tv); });
        assertThrows(Exception.class,() -> { tvController.decreaseSound(tv); });
        assertThrows(Exception.class,() -> { tvController.turnOnNextChannel(tv); });
        assertThrows(Exception.class,() -> { tvController.turnOnPreviousChannel(tv); });
    }
}