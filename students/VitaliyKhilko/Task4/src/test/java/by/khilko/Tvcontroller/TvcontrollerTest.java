package by.khilko.Tvcontroller;

import by.khilko.bean.Tv;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TvcontrollerTest {

    @Test
    void setConnectTv() {
        Tv newtv = new Tv("Vityaz", 34, 5,true);
        Tvcontroller controller = new Tvcontroller();
        controller.setConnectTv(newtv);

        String message = "Should be connect tv";
        boolean expected = true;
        boolean actual = newtv.isWorksTv();

        assertEquals(expected, actual, message);

    }

    @Test
    void newChannelTvUp() {
        Tv newtv = new Tv("Vityaz", 34, 5,true);
        Tvcontroller controller = new Tvcontroller();
        controller.setConnectTv(newtv);

        String message = "Should return channel up";
        int expected = 35;
        controller.newChannelTvUp();
        int actual = newtv.getChannelTv();

        assertEquals(expected, actual, message);
    }

    @Test
    void newChannelTvDown() {
        Tv newtv = new Tv("Vityaz", 34, 5,true);
        Tvcontroller controller = new Tvcontroller();
        controller.setConnectTv(newtv);

        String message = "Should return channel down";
        int expected = 33;
        controller.newChannelTvDown();
        int actual = newtv.getChannelTv();

        assertEquals(expected, actual, message);
    }

    @Test
    void newVolumeUp() {
        Tv newtv = new Tv("Vityaz", 34, 5,true);
        Tvcontroller controller = new Tvcontroller();
        controller.setConnectTv(newtv);

        String message = "Should be return volume up";
        int expected = 6;
        controller.newVolumeUp();
        int actual = newtv.getSoundTv();

        assertEquals(expected, actual, message);
    }

    @Test
    void newVolumeDown() {
        Tv newtv = new Tv("Vityaz", 34, 5,true);
        Tvcontroller controller = new Tvcontroller();
        controller.setConnectTv(newtv);

        String message = "Should be return volume down";
        int expected = 4;
        controller.newVolumeDown();
        int actual = newtv.getSoundTv();

        assertEquals(expected, actual, message);
    }

    @Test
    void newTurnOnTv() {
        Tv newtv = new Tv("Vityaz", 34, 5,true);
        Tvcontroller controller = new Tvcontroller();
        controller.setConnectTv(newtv);

        newtv.setWorksTv(false);
        controller.newTurnOnTv();

        String message = "Should return tv on";
        boolean expected = true;
        boolean actual = newtv.isWorksTv();

        assertEquals(expected, actual, message);
    }

    @Test
    void newTurnOffTv() {
        Tv newtv = new Tv("Vityaz", 34, 5,true);
        Tvcontroller controller = new Tvcontroller();
        controller.setConnectTv(newtv);
        newtv.setWorksTv(false);

        String message = "Should return tv off";
        boolean expected = false;
        controller.newTurnOffTv();
        boolean actual = newtv.isWorksTv();

        assertEquals(expected, actual, message);
    }
}