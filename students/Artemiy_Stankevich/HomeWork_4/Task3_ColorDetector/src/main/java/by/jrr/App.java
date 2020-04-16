package by.jrr;

import by.jrr.bean.ColorDetector;
import by.jrr.service.ColorDetectorService;

public class App {
    public static void main(String[] args) {
        ColorDetector colorDetector = new ColorDetector();
        ColorDetectorService colorDetectorService = new ColorDetectorService();
        colorDetector.setWaveLength(700);
        System.out.println(colorDetectorService.detect(colorDetector.getWaveLength()));
    }
}
