package test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import service.LightColorDetectorService;

public class LightColorDetectorServiceJUnitTest extends Assert {
    private LightColorDetectorService service = new LightColorDetectorService();

    @Before
    public void setUp(){
        service = new LightColorDetectorService();
    }

    @Test
    public void violetColorTest(){
        int myWaveLength = 390;
        String testMessage = "Should be violet color";
        String expected = "Violet";
        String actual = service.detect(myWaveLength);
        assertEquals(testMessage, expected, actual);
    }

    @Test
    public void blueColorTest(){
        int myWaveLength = 493;
        String testMessage = "Should be blue color";
        String expected = "Blue";
        String actual = service.detect(myWaveLength);
        assertEquals(testMessage, expected, actual);
    }

    @Test
    public void greenColorTest(){
        int myWaveLength = 495;
        String testMessage = "Should be green color";
        String expected = "Green";
        String actual = service.detect(myWaveLength);
        assertEquals(testMessage, expected, actual);
    }

    @Test
    public void yellowColorTest(){
        int myWaveLength = 580;
        String testMessage = "Should be yellow color";
        String expected = "Yellow";
        String actual = service.detect(myWaveLength);
        assertEquals(testMessage, expected, actual);
    }

    @Test
    public void orangeColorTest(){
        int myWaveLength = 617;
        String testMessage = "Should be orange color";
        String expected = "Orange";
        String actual = service.detect(myWaveLength);
        assertEquals(testMessage, expected, actual);
    }

    @Test
    public void redColorTest(){
        int myWaveLength = 721;
        String testMessage = "Should be red color";
        String expected = "Red";
        String actual = service.detect(myWaveLength);
        assertEquals(testMessage, expected, actual);
    }

    @Test
    public void invisibleLightTest(){
        int myWaveLength = 0;
        String testMessage = "Should be invisible light";
        String expected = "Invisible Light";
        String actual = service.detect(myWaveLength);
        assertEquals(testMessage, expected, actual);
    }

}
