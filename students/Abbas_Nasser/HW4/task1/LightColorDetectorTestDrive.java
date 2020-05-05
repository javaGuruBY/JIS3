import service.LightColorDetectorService;
import bean.LightColorDetector;


public class LightColorDetectorTestDrive {

public static void main(String[] args) {

    LightColorDetectorTestDrive num = new LightColorDetectorTestDrive();
    num.testNumberOne();
    num.testNumberTwo();
    num.testNumberThree();
    num.testNumberFour();
    num.testNumberFive();
    num.testNumberSix();
    num.testNumberSeven();
}




    public void testNumberOne(){
        LightColorDetector detector = new LightColorDetector();
        LightColorDetectorService service = new LightColorDetectorService();
        detector.setColor(380);
        String test = "Violet";
        String expectedResult = "Violet";
        String actualResult = service.detect(detector.getColor());
        checkIfEqual(expectedResult, actualResult, test);
    }


    public void testNumberTwo(){
        LightColorDetector detector = new LightColorDetector();
        LightColorDetectorService service = new LightColorDetectorService();

    detector.setColor(66);
        String test = "Blue";
        String expectedResult = "Blue";
        String actualResult = service.detect(detector.getColor());
        checkIfEqual(expectedResult, actualResult, test);
    }


    public void testNumberThree(){
        LightColorDetector detector = new LightColorDetector();
        LightColorDetectorService service = new LightColorDetectorService();

    detector.setColor(590);
        String test = "Orange";
        String expectedResult = "Orange";
        String actualResult = service.detect(detector.getColor());
        checkIfEqual(expectedResult, actualResult, test);
    }


    private void testNumberFour() { LightColorDetector detector = new LightColorDetector();
        LightColorDetectorService service = new LightColorDetectorService();

        detector.setColor(570);
        String test = "Yellow";
        String expectedResult = "Yellow";
        String actualResult = service.detect(detector.getColor());
        checkIfEqual(expectedResult, actualResult, test);
    }


    private void testNumberFive() { LightColorDetector detector = new LightColorDetector();
        LightColorDetectorService service = new LightColorDetectorService();

        detector.setColor(495);
        String test = "Green";
        String expectedResult = "Green";
        String actualResult = service.detect(detector.getColor());
        checkIfEqual(expectedResult, actualResult, test);
    }

    private void testNumberSix() {LightColorDetector detector = new LightColorDetector();
        LightColorDetectorService service = new LightColorDetectorService();

        detector.setColor(623);
        String test = "Red";
        String expectedResult = "Red";
        String actualResult = service.detect(detector.getColor());
        checkIfEqual(expectedResult, actualResult, test);
    }

    public void testNumberSeven(){
        LightColorDetector detector = new LightColorDetector();
        LightColorDetectorService service = new LightColorDetectorService();

        detector.setColor(999);
        String test = "Invisible Light";
        String expectedResult = "Invisible Light";
        String actualResult = service.detect(detector.getColor());
        checkIfEqual(expectedResult, actualResult, test);
    }

    public void checkIfEqual(String expected, String actual, String test) {
        if (expected.equals(actual)) {
            System.out.println(test + " <.....> has passed!");
        } else {
            System.out.println(test + " <.....> has failed!");
            System.out.println("Expected '" + expected + "' but was '" + actual + "'");
        }
    }
}
