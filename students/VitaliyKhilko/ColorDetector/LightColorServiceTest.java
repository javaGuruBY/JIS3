import service.LightColorService;
import bean.LightColorDetector;

public class LightColorServiceTest {
    public static void main(String[] args) {
        LightColorServiceTest num = new LightColorServiceTest();
        num.testNumberOne();
        num.testNumberTwo();
        num.testNumberThree();
        num.testNumberFour();
    }

    public void testNumberOne(){
        LightColorDetector number = new LightColorDetector();
        LightColorService service = new LightColorService();

        String test = "Violet";
        String expectedResult = "Violet";
        String actualResult = service.detect(number.getColor());
        checkThatEqual(expectedResult, actualResult, test);
    }


    public void testNumberTwo(){
        LightColorDetector number = new LightColorDetector();
        LightColorService service = new LightColorService();

        number.setColor(475);
        String test = "Blue";
        String expectedResult = "Blue";
        String actualResult = service.detect(number.getColor());
        checkThatEqual(expectedResult, actualResult, test);
    }


    public void testNumberThree(){
        LightColorDetector number = new LightColorDetector();
        LightColorService service = new LightColorService();

        number.setColor(77);
        String test = "Orange";
        String expectedResult = "Orange";
        String actualResult = service.detect(number.getColor());
        checkThatEqual(expectedResult, actualResult, test);
    }

    public void testNumberFour(){
        LightColorDetector number = new LightColorDetector();
        LightColorService service = new LightColorService();

        number.setColor(-9);
        String test = "Invisible Light";
        String expectedResult = "Invisible Light";
        String actualResult = service.detect(number.getColor());
        checkThatEqual(expectedResult, actualResult, test);
    }

    public void checkThatEqual(String expected, String actual, String test) {
        if (expected.equals(actual)) {
            System.out.println(test + " <----> has passed!");
        } else {
            System.out.println(test + " <----> has failed!");
            System.out.println("Expected '" + expected + "' but was '" + actual + "'");
        }
    }
}

