package com.junit.sample.lambda_examples;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LambdaExpressionTest {

    @Test
    void testLambdaExpression() {
        int result = performOperation(5, x -> x * 2);
        assertEquals(10, result);
    }

    private int performOperation(int number, IntOperation operation) {
        return operation.apply(number);
    }

    @FunctionalInterface
    interface IntOperation {
        int apply(int number);
    }
}
