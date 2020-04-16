package by.jrr.service;

import by.jrr.bean.ColorDetector;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ColorDetectorServiceTest {
    ColorDetector colorDetectorTest;
    ColorDetectorService colorDetectorServiceTest;
    @BeforeEach
    void init() {
        colorDetectorTest = new ColorDetector();
        colorDetectorServiceTest = new ColorDetectorService();
    }

    @Test
    void detectVioletColor() {
        String colorType = "Violet";
        String expected = colorType;
        colorDetectorTest.setWaveLength(400);
        String actual = colorDetectorServiceTest.detect(colorDetectorTest.getWaveLength());

        assertEquals(expected, actual, "[Error] Test detectVioletColor has not passed. Expected: " +
                " Violet, but actual: " + actual);
    }

    @Test
    void detectBlueColor() {
        String colorType = "Blue";
        String expected = colorType;
        colorDetectorTest.setWaveLength(470);
        String actual = colorDetectorServiceTest.detect(colorDetectorTest.getWaveLength());

        assertEquals(expected, actual, "[Error] Test detectBlueColor has not passed. Expected: " +
                " Blue, but actual: " + actual);
    }

    @Test
    void detectGreenColor() {
        String colorType = "Green";
        String expected = colorType;
        colorDetectorTest.setWaveLength(501);
        String actual = colorDetectorServiceTest.detect(colorDetectorTest.getWaveLength());

        assertEquals(expected, actual, "[Error] Test detectGreenColor has not passed. Expected: " +
                " Green, but actual: " + actual);
    }

    @Test
    void detectYellowColor() {
        String colorType = "Yellow";
        String expected = colorType;
        colorDetectorTest.setWaveLength(577);
        String actual = colorDetectorServiceTest.detect(colorDetectorTest.getWaveLength());

        assertEquals(expected, actual, "[Error] Test detectYellowColor has not passed. Expected: " +
                " Yellow, but actual: " + actual);
    }

    @Test
    void detectOrangeColor() {
        String colorType = "Orange";
        String expected = colorType;
        colorDetectorTest.setWaveLength(616);
        String actual = colorDetectorServiceTest.detect(colorDetectorTest.getWaveLength());

        assertEquals(expected, actual, "[Error] Test detectOrangeColor has not passed. Expected: " +
                " Orange, but actual: " + actual);
    }

    @Test
    void detectRedColor() {
        String colorType = "Red";
        String expected = colorType;
        colorDetectorTest.setWaveLength(666);
        String actual = colorDetectorServiceTest.detect(colorDetectorTest.getWaveLength());

        assertEquals(expected, actual, "[Error] Test detectRedColor has not passed. Expected: " +
                " Red, but actual: " + actual);
    }


}