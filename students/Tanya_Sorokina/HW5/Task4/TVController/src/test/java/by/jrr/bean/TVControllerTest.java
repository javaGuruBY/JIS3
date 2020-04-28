package by.jrr.bean;

import by.jrr.srvice.TVService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TVControllerTest {
    TV tv;
    TVService tvService;
    TVController tvController;

    @BeforeEach
    public void init() {
        tv = new TV();
        tv.setCurrentChannel(2);
        tv.setCurrentVolume(4);
        tvService = new TVService();
        tvController = new TVController();
        tvController.setConnectedTvWithController(true);
        tv.setTVSwichOn(true);
    }


    @Test
    void switchToTheNextChannel() throws Exception {
        tvController.switchToTheNextChannel(tv);
        int expected = 3;
        int actual = tv.getCurrentChannel();
        assertEquals(expected, actual, "ERROR");
        System.out.println("switchToTheNextChannelTest has passed");
    }

    @Test
    void switchToTheLastChannel() throws Exception {
        tvController.switchToTheLastChannel(tv);
        int expected = 1;
        int actual = tv.getCurrentChannel();
        assertEquals(expected, actual, "ERROR");
        System.out.println("switchToTheLastChannel has passed");
    }

    @Test
    void increaseTheVolume() throws Exception {
        tvController.increaseTheVolume(tv);
        int expected = 5;
        int actual = tv.getCurrentVolume();
        assertEquals(expected, actual, "ERROR");
        System.out.println("increaseTheVolume has passed");
    }

    @Test
    void decreaseTheVolume() throws Exception {
        tvController.decreaseTheVolume(tv);
        int expected = 3;
        int actual = tv.getCurrentVolume();
        assertEquals(expected, actual, "ERROR");
        System.out.println("increaseTheVolume has passed");
    }
}