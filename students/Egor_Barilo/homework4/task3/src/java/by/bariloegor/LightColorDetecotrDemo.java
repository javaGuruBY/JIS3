package by.bariloegor;

import by.bariloegor.service.LightColorDetectorService;
import by.bariloegor.test.LightColorDetectorTest;

public class LightColorDetecotrDemo {
    public static void main(String[] args) {
        LightColorDetectorTest lightColorDetectorTest = new LightColorDetectorTest();
        lightColorDetectorTest.lightColorDetectorTest();
        LightColorDetectorService lightColorDetectorService = new LightColorDetectorService();
        String result = lightColorDetectorService.detect(580);
        System.out.println(result);
    }
}
