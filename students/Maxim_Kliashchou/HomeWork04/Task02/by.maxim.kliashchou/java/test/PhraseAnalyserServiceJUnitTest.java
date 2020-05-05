package test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import service.PhraseAnalyserService;

public class PhraseAnalyserServiceJUnitTest extends Assert {
    private PhraseAnalyserService service = new PhraseAnalyserService();

    @Before
    public void setUp(){
        service = new PhraseAnalyserService();
    }

    @Test
    public void startWithMakeAndEndWithGreatAgain(){
        String testMessage = "Should be make and great again";
        String myText = "Make code great again";
        String expected = "It stands no chance";
        String actual = service.analyse(myText);
        assertEquals(testMessage, expected, actual);
    }

    @Test
    public void startWithMakeAndWithoutGreatAgain(){
        String testMessage = "Should be make without great again";
        String myText = "Make code great";
        String expected = "It could be worse";
        String actual = service.analyse(myText);
        assertEquals(testMessage, expected, actual);
    }

    @Test
    public void endWithGreatAgainAndWithoutMake(){
        String testMessage = "Should be great again without make";
        String myText = "code great again";
        String expected = "It could be worse";
        String actual = service.analyse(myText);
        assertEquals(testMessage, expected, actual);
    }

    @Test
    public void withoutMakeAndGreatAgain(){
        String testMessage = "Should be without make and great again";
        String myText = "code great";
        String expected = "It is fine, really";
        String actual = service.analyse(myText);
        assertEquals(testMessage, expected, actual);
    }

}
