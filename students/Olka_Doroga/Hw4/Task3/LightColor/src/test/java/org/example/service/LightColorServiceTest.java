package org.example.service;

import org.example.bean.LightColor;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LightColorServiceTest {

    @Test
    void detectViolet() {
        String expected = "Violet";
        LightColor lightColor = new LightColor(400);
        int wavelength = lightColor.getWavelength();
        LightColorService lightColorService = new LightColorService();
        String actual = lightColorService.detect(wavelength);

        assertEquals(expected, actual, "111");
    }

    @Test
    void detectYellow() {
        String expected = "Yellow";
        LightColor lightColor = new LightColor(575);
        int wavelength = lightColor.getWavelength();
        LightColorService lightColorService = new LightColorService();
        String actual = lightColorService.detect(wavelength);

        assertEquals(expected, actual, "222");
    }

    @Test
    void detectRed() {
        String expected = "Red";
        LightColor lightColor = new LightColor(700);
        int wavelength = lightColor.getWavelength();
        LightColorService lightColorService = new LightColorService();
        String actual = lightColorService.detect(wavelength);

        assertEquals(expected, actual, "333");
    }

}