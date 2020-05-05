package by.jrr.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LightColorDetectorServiceTest {

    @Test
    void lightColorDetectorVioletTest() {
        LightColorDetectorService lightColorDetectorService = new LightColorDetectorService();
        int waveLength = 447;
        String expectedResult = "Violet";
        String actualResult = lightColorDetectorService.detect(waveLength);
        assertEquals(expectedResult, actualResult, "Test with violet light");
        System.out.println("lightColorDetectorVioletTest has passed");
    }

    @Test
    void lightColorDetectorBlueTest() {
        LightColorDetectorService lightColorDetectorService = new LightColorDetectorService();
        int waveLength = 487;
        String expectedResult = "Blue";
        String actualResult = lightColorDetectorService.detect(waveLength);
        assertEquals(expectedResult, actualResult, "Test with blue light");
        System.out.println("lightColorDetectorBlueTest has passed");
    }


    @Test
    void lightColorDetectorGreenTest(){
        LightColorDetectorService lightColorDetectorService = new LightColorDetectorService();
        int waveLength = 500;
        String expectedResult = "Green";
        String actualResult = lightColorDetectorService.detect(waveLength);
        assertEquals(expectedResult, actualResult, "Test with green light");
        System.out.println("lightColorDetectorGreenTest has passed");
    }


    @Test
    void lightColorDetectorYellowTest() {
        LightColorDetectorService lightColorDetectorService = new LightColorDetectorService();
        int waveLength = 570;
        String expectedResult = "Yellow";
        String actualResult = lightColorDetectorService.detect(waveLength);
        assertEquals(expectedResult,actualResult, "Test with yellow light");
    }

    @Test
    void lightColorDetectorOrangeTest() {
        LightColorDetectorService lightColorDetectorService = new LightColorDetectorService();
        int waveLength = 600;
        String expectedResult = "Orange";
        String actualResult = lightColorDetectorService.detect(waveLength);
        assertEquals(expectedResult, actualResult, "Test with Orange light");
        System.out.println("lightColorDetectorOrangeTest has passed");
    }

    @Test
    void lightColorDetectorRedTest() {
        LightColorDetectorService lightColorDetectorService = new LightColorDetectorService();
        int waveLength = 700;
        String expectedResult = "Red";
        String actualResult = lightColorDetectorService.detect(waveLength);
        assertEquals(expectedResult, actualResult, "Test with Red light");
    }

    @Test
    void lightColorDetectorInvisibleLightTest() {
        LightColorDetectorService lightColorDetectorService = new LightColorDetectorService();
        int waveLength = 0;
        String expectedResult = "Invisible Light";
        String actualResult = lightColorDetectorService.detect(waveLength);
        assertEquals(expectedResult, actualResult, "Test with Invisible Light light");
        System.out.println("lightColorDetectorInvisibleLightTest has passed");
    }
}