import bean.PhraseAnalyser;
import service.PhraseService;

public class PhraseAnalyserTest {
    public static void main(String[] args) {
        PhraseAnalyserTest textOne = new PhraseAnalyserTest();
        textOne.testNumberOne();
        textOne.testNumberTwo();
        textOne.testNumberThree();
    }

    public void testNumberOne() {
        PhraseAnalyser testOne = new PhraseAnalyser();
        PhraseService service = new PhraseService();

        String test = "It stands no chance";
        String expectedResult = "It stands no chance";
        String actualResult = service.analyses(testOne.getPhraseAnalyser());
        checkThatEqual(expectedResult, actualResult, test);
    }


    public void testNumberTwo(){
        PhraseAnalyser testTwo = new PhraseAnalyser();
        PhraseService service = new PhraseService();
        testTwo.setPhraseAnalyser("(Make good year crate ! stay home great again");

        String test = "It could be worse";
        String expectedResult = "It could be worse";
        String actualResult = service.analyses(testTwo.getPhraseAnalyser());
        checkThatEqual(expectedResult, actualResult, test);
    }

    public void testNumberThree(){
        PhraseAnalyser testThree = new PhraseAnalyser();
        PhraseService service = new PhraseService();
        testThree.setPhraseAnalyser("!Make good year home crate ! stay home great !! again");

        String test = "It is fine, really";
        String expectedResult = "It is fine, really";
        String actualResult = service.analyses(testThree.getPhraseAnalyser());
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
