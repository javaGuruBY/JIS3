package by.bariloegor.tv.bean;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TvTest {
    private Tv tv;

    @Before
    public void setUp(){
        tv = new Tv(1, 20, "Samsung");
    }

    @Test
    public void getCurrentChannelTest(){
        int expected = 1;
        int actual = tv.getCurrentChannel();
        assertEquals("Received current channel should be 1.", expected, actual);
    }

    @Test
    public void setCurrentChannelTest(){
        int expected = 5;
        tv.setCurrentChannel(5);
        int actual = tv.getCurrentChannel();
        assertEquals("Current channel should be set to 5.", expected, actual);
    }

    @Test
    public void getCurrentVolumeTest(){
        int expected = 20;
        int actual = tv.getCurrentVolume();
        assertEquals("Received current volume should be 20.", expected, actual);
    }

    @Test
    public void setCurrentVolumeTest(){
        int expected = 25;
        tv.setCurrentVolume(25);
        int actual = tv.getCurrentVolume();
        assertEquals("Current volume should be set to 25.", expected, actual);
    }

    @Test
    public void getTvManufacturerTest(){
        String expected = "Samsung";
        String actual = tv.getTvManufacturer();
        assertEquals("Received name of TV manufacturer should be Samsung.", expected, actual);
    }

    @Test
    public void setTvManufacturerTest(){
        String expected = "LG";
        tv.setTvManufacturer("LG");
        String actual = tv.getTvManufacturer();
        assertEquals("Name of TV manufacturer should be set to LG.", expected, actual);
    }

    @Test
    public void isPowerOnTest(){
        boolean expected = false;
        boolean actual = tv.isPowerOn();
        assertEquals("TV should be off.", expected, actual);
    }

    @Test
    public void setPowerOnTest(){
        boolean expected = true;
        tv.setPowerOn(true);
        boolean actual = tv.isPowerOn();
        assertEquals("TV should be on.", expected, actual);
    }

    @Test
    public void toStringTest(){
        String expected = "Tv{currentChannel=1, currentVolume=20, tvManufacturer='Samsung', powerOn=false}";
        String actual = tv.toString();
        assertEquals("Strings should be same.", expected, actual);
    }

    @Test
    public void equalsTest(){
        boolean expected = true;
        Tv newTv = new Tv(1, 20, "Samsung");
        boolean actual = tv.equals(newTv);
        assertEquals("Equal of TVs should be true.", expected, actual);
    }

    @Test
    public void hashcodeTest(){
        int expected = tv.hashCode();
        Tv newTv = tv;
        int actual = newTv.hashCode();
        assertEquals("Hashcodes should be same.", expected, actual);
    }
}