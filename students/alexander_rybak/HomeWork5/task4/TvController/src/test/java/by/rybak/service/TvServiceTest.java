package by.rybak.service;

import by.rybak.bean.Tv;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TvServiceTest {

    Tv tv;
    TvService service;

    @BeforeEach
    public void initialization(){
        tv = new Tv(43,25,"Vituaz");
        service = new TvService();
        service.turnOnTheTv(tv);
    }

    @Test
    void nextChannel() {
        int expected = 44;
        service.nextChannel(tv);
        int actual = tv.getCurrentChannel();

        assertEquals(expected, actual, "Should return right channel");
    }

    @Test
    void previousChannel() {
        int expected = 42;
        service.previousChannel(tv);
        int actual = tv.getCurrentChannel();

        assertEquals(expected, actual, "Should return right channel");
    }

    @Test
    void increaseVolume() {
        int expected = 26;
        service.increaseVolume(tv);
        int actual = tv.getCurrentVolume();

        assertEquals(expected, actual, "Should return right volume");
    }

    @Test
    void reduceVolume() {
        int expected = 24;
        service.reduceVolume(tv);
        int actual = tv.getCurrentVolume();

        assertEquals(expected, actual, "Should return right volume");
    }

    @Test
    void turnOnTheTv() {
        Boolean expected = true;
        service.turnOnTheTv(tv);
        Boolean actual = tv.isOn();

        assertEquals(expected, actual, "Should return right state of the Tv");
    }

    @Test
    void turnOffTheTv() {
        Boolean expected = false;
        service.turnOffTheTv(tv);
        Boolean actual = tv.isOn();

        assertEquals(expected, actual, "Should return right state of the Tv");
    }
}