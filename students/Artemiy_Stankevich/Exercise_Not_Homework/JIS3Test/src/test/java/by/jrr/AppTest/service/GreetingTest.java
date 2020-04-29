package by.jrr.AppTest.service;

import by.jrr.service.GreetingService;
import org.junit.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GreetingTest {

    private static GreetingService greetingService;
    private  static Logger logger;

    @BeforeClass
    public static void setUpTest() {
        logger = LoggerFactory.getLogger("GreetingTest");
        logger.warn("setUpTest");
        greetingService = new GreetingService();
    }

    @AfterClass
    public static void tearDownTest(){
        logger = LoggerFactory.getLogger("GreetingTest");
        logger.info("tearDown");
        greetingService = null;
    }
    @Before
    public void setUp() {
        logger.warn("setUpTest");
        greetingService = new GreetingService();
    }

    @After
    public void tearDown(){
        logger.info("tearDown");
        greetingService = null;
    }

    @Test(timeout = 2)
    public void greetShouldReturnHelloAndNAme() {
        logger.info("greetShouldReturnHelloAndNAme");
        String actual = greetingService.greet("Art");
        String expected = "Hello Art";
        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2,expected = IllegalArgumentException.class)
    public void greetShouldReturnExceptionForNameIsNull() {
        logger.info("greetShouldReturnExceptionForNameIsNull");
        greetingService.greet(null);
    }

    @Test(timeout = 2, expected = IllegalArgumentException.class)
    public void greetShouldReturnExceptionForNameIsBlank() {
        logger.info("greetShouldReturnExceptionForNameIsBlank");
        greetingService.greet("");
    }

    @Test(timeout = 2, expected = IllegalArgumentException.class)
    public void greetShouldReturnExceptionForNameIsSpace() {
        logger.info("greetShouldReturnExceptionForNameIsSpace");
        greetingService.greet("  ");
    }
}
