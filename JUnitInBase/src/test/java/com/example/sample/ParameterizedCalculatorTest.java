package com.example.sample;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * learn parameterized tests.
 */
public class ParameterizedCalculatorTest {


    @ParameterizedTest
    @CsvSource({ "1, 2, 3", "0, 0, 0", "-1, 1, 0", "10, -5, 5" })
    void testAddition(int num1, int num2, int expectedSum) {
        Calculator calculator = new Calculator();
        int actualSum = calculator.add(num1, num2);
        assertEquals(expectedSum, actualSum, () -> num1 + " + " + num2 + " should equal " + expectedSum);
    }

}