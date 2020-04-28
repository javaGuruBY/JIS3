package by.khilko;

import by.khilko.bean.TV;
import by.khilko.service.TvService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TVDemoTest {

    @Test
    void channelUp() {
        TV newTv = new TV("Sony",25, 20,true);
        TvService service = new TvService();
        service.channelUp(newTv);

        String message = "Should switch to channel above";
        int expected = 26;
        int actual = newTv.getChannelTv();

        assertEquals(expected, actual, message);
    }

    @Test
    void channelDown() {
        TV newTv = new TV("Sony",25, 20,true);
        TvService service = new TvService();
        service.channelDown(newTv);

        String message = "Should switch to channel below";
        int expected = 24;
        int actual = newTv.getChannelTv();

        assertEquals(expected, actual, message);
    }

    @Test
    void soundUp() {
            TV newTv = new TV("Sony",25, 20,true);
            TvService service = new TvService();
            service.soundUp(newTv);

            String message = "Should be sound up";
            int expected = 21;
            int actual = newTv.getSoundTv();

            assertEquals(expected, actual, message);
    }

    @Test
    void soundDown() {
        TV newTv = new TV("Sony",25, 20,true);
        TvService service = new TvService();
        service.soundDown(newTv);

        String message = "Should be sound down";
        int expected = 19;
        int actual = newTv.getSoundTv();

        assertEquals(expected, actual, message);
    }

    @Test
    void turnOnTv() {
        TV newTv = new TV("Sony",25, 20,false);
        TvService service = new TvService();
        service.turnOnTv(newTv);

        String message = "Tv should be on";
        boolean expected = true;
        boolean actual = newTv.isWorksTv();

        assertEquals(expected, actual, message);
    }

    @Test
    void turnOffTv() {
        TV newTv = new TV("Sony",25, 20,true);
        TvService service = new TvService();
        service.turnOffTv(newTv);

        String message = "Tv should be off";
        boolean expected = false;
        boolean actual = newTv.isWorksTv();

        assertEquals(expected, actual, message);
    }
}