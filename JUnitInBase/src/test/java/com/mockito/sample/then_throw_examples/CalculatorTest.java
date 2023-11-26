package com.mockito.sample.then_throw_examples;

import static org.mockito.Mockito.*;

public class CalculatorTest {

    public static void main(String[] args) {
        Calculator calculatorMock = mock(Calculator.class);

        when(calculatorMock.divide(10.0, 2.0)).thenReturn(5.0); // Returns 5.0 when divisor is not zero
        // Uncomment this line to see magic --> when(calculatorMock.divide(10.0, 0.0)).thenReturn(5.0); // Returns 5.0 when divisor is not zero

        /**
         * below line; This line specifies that when the divide method is called on calculatorMock
         * with arguments 10.0 and 0.0, it should throw an ArithmeticException with the provided message.
         * Mockito then remembers this behavior and applies it when you call calculatorMock.divide(10.0, 0.0) in your test.
         */
        when(calculatorMock.divide(10.0, 0.0)).thenThrow(new ArithmeticException("Division by zero is not allowed.")); // Throws an exception when divisor is zero
        // Uncomment this line to see magic --> when(calculatorMock.divide(10.0, 0.0)).thenReturn(5.0); // Returns 5.0 when divisor is not zero

        System.out.println(calculatorMock.divide(10.0, 2.0)); // Prints 5.0
        try {
            System.out.println(calculatorMock.divide(10.0, 0.0)); // Throws ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}