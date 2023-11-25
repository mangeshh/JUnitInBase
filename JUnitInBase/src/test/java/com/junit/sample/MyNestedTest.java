package com.junit.sample;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * Different Test Configurations: (** precision level is different in both nested container)
 *
 * You want to test a class or method with different configurations.
 * Each nested container can represent a different configuration, making it easier to understand the test cases for each configuration.
 *
 *
 */
public class MyNestedTest {

    @Nested
    class LowPrecisionCalculator {
        private final Calculator calculator = new Calculator(2); // Set precision to 2 decimal places

        @Test
        void testAddition() {
            assertEquals(4.56, calculator.add(2.34, 2.22), 0.01);
        }

        @Test
        void testSubtraction() {
            assertEquals(1.00, calculator.subtract(3.25, 2.25), 0.01);
        }
    }

    @Nested
    class HighPrecisionCalculator {
        private final Calculator calculator = new Calculator(4); // Set precision to 4 decimal places

        @Test
        void testAddition() {
            assertEquals(4.5678, calculator.add(2.3456, 2.2222), 0.0001);
        }

        @Test
        void testSubtraction() {
            assertEquals(1.0000, calculator.add(3.2500, 2.2500), 0.0001);
        }
    }

    class Calculator {
        private int precision;

        public Calculator(int precision) {
            if (precision < 0) {
                throw new IllegalArgumentException("Precision must be non-negative.");
            }
            this.precision = precision;
        }

        public double add(double num1, double num2) {
            return round(num1 + num2);
        }

        public double subtract(double num1, double num2) {
            return round(num1 - num2);
        }

        private double round(double value) {
            double scaleFactor = Math.pow(10, precision);
            return Math.round(value * scaleFactor) / scaleFactor;
        }
    }
}