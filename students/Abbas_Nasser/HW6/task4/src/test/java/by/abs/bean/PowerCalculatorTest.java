package by.abs.bean;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import javax.swing.*;

import static org.junit.jupiter.api.Assertions.*;

class PowerCalculatorTest {
    PowerCalculator service;

    @BeforeEach
    void setUp() {
        service = new PowerCalculator();
    }

    @Test
    void calcul() {
        String testMessage = "must calculate number";
        long[] expected = {27, 256, 3125};
        long[] numbers = {3, 4, 5};
        long[] powers = {3, 4, 5};

    for (int i = 0; i < expected.length; i++){
        long actual = service.calcul(numbers[i], powers[i]);
        assertEquals(expected[i], actual, testMessage);

    }
}}