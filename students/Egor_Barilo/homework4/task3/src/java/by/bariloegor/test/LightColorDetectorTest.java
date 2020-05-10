package by.bariloegor.test;

import by.bariloegor.service.LightColorDetectorService;

public class LightColorDetectorTest {
    private LightColorDetectorService lightColorDetectorService = new LightColorDetectorService();

    private void assertEquals(String testName, String expected, String actual){
        boolean result = expected.equals(actual);
        if(result){
            System.out.println("[INFO] " + testName + " test passed successfully.");
        } else{
            System.out.println("[ERROR] " + testName + " failed. Expected " + expected + " but was " + actual);
        }
    }

    private void violetColorTest(){
        String expected = "Violet.";
        String actual = lightColorDetectorService.detect(380);
        assertEquals("Violet color", expected, actual);
    }

    private void blueColorTest(){
        String expected = "Blue.";
        String actual = lightColorDetectorService.detect(450);
        assertEquals("Blue color", expected, actual);
    }

    private void greenColorTest(){
        String expected = "Green.";
        String actual = lightColorDetectorService.detect(495);
        assertEquals("Green color", expected, actual);
    }

    private void yellowColorTest(){
        String expected = "Yellow.";
        String actual = lightColorDetectorService.detect(570);
        assertEquals("Yellow color", expected, actual);
    }

    private void orangeColorTest(){
        String expected = "Orange.";
        String actual = lightColorDetectorService.detect(590);
        assertEquals("Orange color", expected, actual);
    }

    private void redColorTest(){
        String expected = "Red.";
        String actual = lightColorDetectorService.detect(620);
        assertEquals("Red color", expected, actual);
    }

    private void invisibleLightTest(){
        String expected = "Invisible light.";
        String actual = lightColorDetectorService.detect(1);
        assertEquals("Invisible light", expected, actual);
    }

    public void lightColorDetectorTest(){
        violetColorTest();
        blueColorTest();
        greenColorTest();
        yellowColorTest();
        orangeColorTest();
        redColorTest();
        invisibleLightTest();
        System.out.println();
    }
}
