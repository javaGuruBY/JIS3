package by.jrr.service;

import by.jrr.bean.LightColor;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LightColorDetectorTest {

    LightColor lightColor = new LightColor();
    LightColorDetector lightColorDetector = new LightColorDetector();



    @Test
    void detectViolet() {
        lightColor.setWavelength(390);
        String testMessage = "Should be Violet color";
        String expected = "Violet";
        String actual = lightColorDetector.detect(lightColor.getWavelength());

        assertEquals(expected, actual, "Should be Violet");
    }
    @Test
    void detectBlue() {
        lightColor.setWavelength(490);
        String testMessage = "Should be Blue color";
        String expected = "Blue";
        String actual = lightColorDetector.detect(lightColor.getWavelength());

        assertEquals(expected, actual, "Should be Blue");
    }
    @Test
    void detect() {
        lightColor.setWavelength(540);
        String testMessage = "Should be Green color";
        String expected = "Green";
        String actual = lightColorDetector.detect(lightColor.getWavelength());

        assertEquals(expected, actual, "Should be Green");
    }
}