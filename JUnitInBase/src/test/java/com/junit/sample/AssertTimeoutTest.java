package com.junit.sample;

import org.junit.jupiter.api.Test;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.*;

public class AssertTimeoutTest {

    @Test
    void testExecutionWithinTimeout() {
        // Simulate a time-consuming operation (e.g., a long computation)
        long result = assertTimeout(Duration.ofSeconds(2), () -> performTimeConsumingOperation());

        // Assertions on the result after the operation completes within the specified timeout
        assertEquals(10, result, "Expected result is 10");
    }

    @Test
    void testExecutionExceedsTimeout() {
        // Simulate an operation that exceeds the timeout
        assertTimeout(Duration.ofSeconds(2), () -> performOperationExceedingTimeout());

        // This code will not be reached if the operation exceeds the timeout
    }

    private long performTimeConsumingOperation() {
        // Simulate a time-consuming operation that takes less than 2 seconds
        try {
            Thread.sleep(1000); // Sleep for 1 second
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        return 10;
    }

    private void performOperationExceedingTimeout() {
        // Simulate an operation that takes longer than 2 seconds
        try {
            Thread.sleep(1900); // Sleep for 3 seconds, to see error!!
            //Thread.sleep(2001); // Sleep for 2+ seconds, to see error!!
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
