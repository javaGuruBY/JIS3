package by.jrr.controller;

import by.jrr.bean.TV;
import by.jrr.service.TVService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TVControllerTest {

    @Test
    void isControllerConnectedToTheTv() {
        boolean expected = true;
        TVController tvController = new TVController();
        tvController.setControllerConnectedToTheTv(true);

        assertEquals(expected, tvController.isControllerConnectedToTheTv(), "remote controller connected");

    }

    @Test
    void nextChannelWithController() {
        int expectedResult = 10;
        TV tv = new TV(9);
        TVController tvController = new TVController();
        tvController.setControllerConnectedToTheTv(true);
        tv.setIfTVIsOn(true);

        tvController.nextChannelWithController(tv);

        assertEquals(expectedResult, tv.getCurrentChannel(), "next channel should be 10");
    }

    @Test
    void previousChannelWithController() {
        int expectedResult = 8;
        TV tv = new TV(9);
        TVController tvController = new TVController();
        tvController.setControllerConnectedToTheTv(true);
        tv.setIfTVIsOn(true);
        tvController.previousChannelWithController(tv);

        assertEquals(expectedResult, tv.getCurrentChannel(), "previous channel should be 8");
    }

    @Test
    void volumeUpWithController() {
        int expectedResult = 10;
        TV tv = new TV();
        TVController tvController = new TVController();
        tvController.setControllerConnectedToTheTv(true);
        tv.setIfTVIsOn(true);
        tv.setCurrentVolume(9);
        tvController.volumeUpWithController(tv);
        assertEquals(expectedResult, tv.getCurrentVolume(), "current volume should be 10");
    }

    @Test
    void volumeDownWithController() {
        int expectedResult = 10;
        TV tv = new TV();
        TVController tvController = new TVController();
        tvController.setControllerConnectedToTheTv(true);
        tv.setIfTVIsOn(true);
        tv.setCurrentVolume(9);
        tvController.volumeUpWithController(tv);
        assertEquals(expectedResult, tv.getCurrentVolume(), "current volume should be 8");
    }
}