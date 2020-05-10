import bean.SignComparator;
import service.SignComparatorService;

public class SignComparatorTest {
    public static void main(String[] args) {
        SignComparatorTest serv = new SignComparatorTest();

        serv.testNumberOne();
        serv.testNumberTwo();
        serv.testNumberThree();
    }

    public void testNumberOne() {

        SignComparator testOne = new SignComparator();
        SignComparatorService service = new SignComparatorService();

        int number = service.getSignComparatorRandom(testOne);
        String text = "Number is positive";
        String expectedResult = "Number is positive";
        String actualResult = testOne.getSign(number);
        checkThatEqual(expectedResult, actualResult, text);
    }


    public void testNumberTwo() {
        SignComparator testTwo = new SignComparator();
        SignComparatorService service = new SignComparatorService();

        int number = service.getSignComparatorRandom(testTwo);
        String textTwo = "Number is negative";
        String expectedResult = "Number is negative";
        String actualResult = testTwo.getSign(number);
        checkThatEqual(expectedResult, actualResult, textTwo);
    }


    public void testNumberThree() {
        SignComparator testThree = new SignComparator();
        SignComparatorService service = new SignComparatorService();

        int number = service.getSignComparatorRandom(testThree);
        String textThree = "Number is equal to zero";
        String expectedResult = "Number is equal to zero";
        String actualResult = testThree.getSign(number);
        checkThatEqual(expectedResult, actualResult, textThree);
    }

    public void checkThatEqual(String expected, String actual, String text) {
        if (expected.equals(actual)) {
            System.out.println(text + " has passed!");
        } else {
            System.out.println(text + " has failed!");
            System.out.println("Expected '" + expected + "' but was '" + actual + "'");
        }
    }

}
