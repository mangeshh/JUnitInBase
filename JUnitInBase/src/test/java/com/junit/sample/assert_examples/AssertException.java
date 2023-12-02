package com.junit.sample.assert_examples;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class AssertException {

    @Test
    public void testDivideByZero() {
        Calculator calculator = new Calculator();

        // Assert that an ArithmeticException is thrown when dividing by zero
        assertThrows(ArithmeticException.class, () -> {
            calculator.divide(10, 0);
        });
    }

    class Calculator {
        double divide(int i, int j) {
            return i / j;
        }
    }
}

