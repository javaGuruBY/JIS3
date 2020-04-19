package by.jrr.Tv.service;

import by.jrr.Tv.bean.Tv;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TvServiceTest {
    Tv tv;
    TvService tvService;
    @BeforeEach
    void init() {
        tv = new Tv();
        tvService = new TvService();
        tv.setTvOn(true);
    }
    @Test
    void turnOnNextChannel() throws Exception{
        int expected = 1;
        tvService.turnOnNextChannel(tv);
        int actual = tv.getCurrentChannel();
        assertEquals(expected, actual, "[ERROR]");
    }

    @Test
    void turnOnPreviousChannel() throws Exception{
        tv.setCurrentChannel(10);
        int expected = 9;
        tvService.turnOnPreviousChannel(tv);
        int actual = tv.getCurrentChannel();
        assertEquals(expected, actual, "[ERROR]");
    }

    @Test
    void increaseSound() throws Exception{
       int expected = 1;
       tvService.increaseSound(tv);
       int actual = tv.getCurrentVolume();
        assertEquals(expected, actual, "[ERROR]");
    }

    @Test
    void decreaseSound() throws Exception{
        tv.setCurrentVolume(5);
        int expected = 4;
        tvService.decreaseSound(tv);
        int actual = tv.getCurrentVolume();
        assertEquals(expected, actual, "[ERROR]");
    }

    @Test
    void turnOnTv() {
        boolean expected = true;
        tvService.turnOnTv(tv);
        boolean actual = tv.isTvOn();
        assertEquals(expected, actual, "[ERROR]");
    }

    @Test
    void turnOffTv() {
        boolean expected = false;
        tvService.turnOffTv(tv);
        boolean actual = tv.isTvOn();
        assertEquals(expected, actual, "[ERROR]");
    }

    @Test
    void ExceptionTest() throws Exception {
        tv.setTvOn(false);
        assertThrows(Exception.class,() -> { tvService.increaseSound(tv); });
        assertThrows(Exception.class,() -> { tvService.decreaseSound(tv); });
        assertThrows(Exception.class,() -> { tvService.turnOnNextChannel(tv); });
        assertThrows(Exception.class,() -> { tvService.turnOnPreviousChannel(tv); });
    }
}