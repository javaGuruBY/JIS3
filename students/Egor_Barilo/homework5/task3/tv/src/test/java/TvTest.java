import by.bariloegor.bean.Tv;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TvTest {
    private Tv tv;

    @BeforeEach
    void setUp(){
        tv = new Tv(1, 20, "Samsung");
    }

    @Test
    void getCurrentChannelTest(){
        int expected = 1;
        int actual = tv.getCurrentChannel();
        assertEquals(expected, actual, "Received current channel should be 1.");
    }

    @Test
    void setCurrentChannelTest(){
        int expected = 5;
        tv.setCurrentChannel(5);
        int actual = tv.getCurrentChannel();
        assertEquals(expected, actual, "Current channel should be set to 5.");
    }

    @Test
    void getCurrentVolumeTest(){
        int expected = 20;
        int actual = tv.getCurrentVolume();
        assertEquals(expected, actual, "Received current volume should be 20.");
    }

    @Test
    void setCurrentVolumeTest(){
        int expected = 25;
        tv.setCurrentVolume(25);
        int actual = tv.getCurrentVolume();
        assertEquals(expected, actual, "Current volume should be set to 25.");
    }

    @Test
    void getTvManufacturerTest(){
        String expected = "Samsung";
        String actual = tv.getTvManufacturer();
        assertEquals(expected, actual, "Received name of TV manufacturer should be Samsung.");
    }

    @Test
    void setTvManufacturerTest(){
        String expected = "LG";
        tv.setTvManufacturer("LG");
        String actual = tv.getTvManufacturer();
        assertEquals(expected, actual, "Name of TV manufacturer should be set to LG.");
    }

    @Test
    void isPowerOnTest(){
        boolean expected = false;
        boolean actual = tv.isPowerOn();
        assertEquals(expected, actual, "TV should be off.");
    }

    @Test
    void setPowerOnTest(){
        boolean expected = true;
        tv.setPowerOn(true);
        boolean actual = tv.isPowerOn();
        assertEquals(expected, actual, "TV should be on.");
    }

    @Test
    void toStringTest(){
        String expected = "Tv{currentChannel=1, currentVolume=20, tvManufacturer='Samsung', powerOn=false}";
        String actual = tv.toString();
        assertEquals(expected, actual, "Strings should be same.");
    }

    @Test
    void equalsTest(){
        boolean expected = true;
        Tv newTv = new Tv(1, 20, "Samsung");
        boolean actual = tv.equals(newTv);
        assertEquals(expected, actual, "Equal of TVs should be true.");
    }

    @Test
    void hashcodeTest(){
        int expected = tv.hashCode();
        Tv newTv = tv;
        int actual = newTv.hashCode();
        assertEquals(expected, actual, "Hashcodes should be same.");
    }

}
