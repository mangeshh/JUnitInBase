package com.junit.sample;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @ValueSource
 * @CsvSource
 * @MethodSource
 * @CsvFileSource
 *
 * Note - we covered all scenarios to parameterized class.
 *
 */
public class ParameterizingTest {

    @ParameterizedTest
    @ValueSource(ints = {1, 2, 3, 4, 5})
    void testWithValueSource(int value) {
        // Test code using the 'value' parameter
    }

    @ParameterizedTest
    @CsvSource({"1, 2, 3", "0, 0, 0", "-1, 1, 0", "10, -5, 5"})
    void testAddition(int num1, int num2, int expectedSum) {
        Calculator calculator = new Calculator();
        int actualSum = calculator.add(num1, num2);
        assertEquals(expectedSum, actualSum, () -> num1 + " + " + num2 + " should equal " + expectedSum);
    }


    @ParameterizedTest
    @MethodSource("com.example.sample.Util#stringProvider") // ClassName#methodName.
    void testStringLength(String input, int expectedLength) {
        assertEquals(expectedLength, input.length());
    }


    @ParameterizedTest
    @CsvFileSource(resources = "/test-data.csv", numLinesToSkip = 1) // Provide the correct path to your CSV file
    void testWithCsvFileSource(String param1, int param2, boolean param3) {
        // Test code using the parameters from the CSV file
        System.out.println("param1: " + param1);
        System.out.println("param2: " + param2);
        System.out.println("param3: " + param3);
    }

}
