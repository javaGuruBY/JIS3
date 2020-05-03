package by.khilko.service;


import by.khilko.bean.NumberRange;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberServiceTest {
    private NumberRange number;
    private NumberService service;

    @BeforeEach
    void setUp() {
        number = new NumberRange(3,23);
        service = new NumberService();
    }

    @Test
    void calculationOfTheAmountInTheRangeOfGivenNumbers() {
        String message = "Return sum of numbers and event numbers";
        String expected = "Sum of numbers = 273 ; The number of even numbers = 10";
        String actual = service.calculationOfTheAmountInTheRangeOfGivenNumbers(number);

        assertEquals(expected, actual, message);
    }
    @Test
    void calculationOfTheAmountInTheRangeOfGivenNumbersTwo() {
        number.setChOne(23);
        number.setChTwo(3);
        String message = "Return sum of numbers and event numbers";
        String expected = "Sum of numbers = 273 ; The number of even numbers = 10";
        String actual = service.calculationOfTheAmountInTheRangeOfGivenNumbers(number);

        assertEquals(expected, actual, message);
    }

}