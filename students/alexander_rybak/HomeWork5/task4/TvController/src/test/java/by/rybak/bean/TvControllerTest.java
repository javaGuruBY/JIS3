package by.rybak.bean;

import by.rybak.service.TvService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TvControllerTest {
    Tv tv;
    TvController controller;
    
    @BeforeEach
    public void initialization(){
        tv = new Tv(11,22,"Horizont");
        controller = new TvController();
        controller.setConnectedTv(tv);
        controller.turnOnTheTv();
    }

    @Test
    void nextChannel() {
        int expected = 12;
        controller.nextChannel();
        int actual = tv.getCurrentChannel();
        
        assertEquals(expected, actual, "Should return right current channel");
    }

    @Test
    void previousChannel() {
        int expected = 10;
        controller.previousChannel();
        int actual = tv.getCurrentChannel();

        assertEquals(expected, actual, "Should return right current channel");
    }

    @Test
    void increaseVolume() {
        int expected = 23;
        controller.increaseVolume();
        int actual = tv.getCurrentVolume();

        assertEquals(expected, actual, "Should return right current volume");
    }

    @Test
    void reduceVolume() {
        int expected = 21;
        controller.reduceVolume();
        int actual = tv.getCurrentVolume();

        assertEquals(expected, actual, "Should return right current volume");
    }

    @Test
    void turnOnTheTv() {
        boolean expected = true;
        controller.turnOnTheTv();
        boolean actual = tv.isOn();
        
        assertEquals(expected, actual, "Should return right state of tv");
    }

    @Test
    void turnOffTheTv() {
        boolean expected = false;
        controller.turnOffTheTv();
        boolean actual = tv.isOn();

        assertEquals(expected, actual, "Should return right state of tv");
    }
}