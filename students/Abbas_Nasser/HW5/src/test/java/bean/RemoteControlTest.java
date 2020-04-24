package bean;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RemoteControlTest {

    TV tv;
    RemoteControl remoteControl;

    @BeforeEach
    void setUp(){
        tv = new TV(66, 66, "panasonic", true);
        remoteControl = new RemoteControl();

    }

    @Test
    void nextChannel() {
        String testMessage = "Should switch to channel 67";
        int expected = 67;
        remoteControl.nextChannel(tv);
        int actual = tv.getCurrentChannel();
        assertEquals(expected, actual, testMessage);
    }

    @Test
    void previousChannel() {
        String testMessage = "Should switch to  channel 65";
        int expected = 65;
        remoteControl.previousChannel(tv);
        int actual = tv.getCurrentChannel();
        assertEquals(expected, actual, testMessage);
    }

    @Test
    void volumeUp() {
        String testMessage = "Should volume up till 67";
        int expected = 67;
        remoteControl.volumeUp(tv);
        int actual = tv.getCurrentVolume();
        assertEquals(expected, actual, testMessage);
    }

    @Test
    void volumeDown() {
        String testMessage = "Should volume down till 65";
        int expected = 65;
        remoteControl.volumeDown(tv);
        int actual = tv.getCurrentVolume();
        assertEquals(expected, actual, testMessage);
    }

    @Test
    void tvTurnOn() {
        String testMessage = "Should turn on tv";
        boolean expected = true;
        tv.setPowerOn(false);
       remoteControl.turnOnTv(tv);
        boolean actual = tv.isPowerOn();
        assertEquals(expected, actual, testMessage);
    }

    @Test
    void tvTurnOff() {
        String testMessage = "Should turn off tv";
        boolean expected = false;
        tv.setPowerOn(true);
        remoteControl.turnOffTv(tv);
        boolean actual = tv.isPowerOn();
        assertEquals(expected, actual, testMessage);
    }
}