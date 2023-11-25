package com.example.sample;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

/**
 * `@BeforeAll` and @AfterAll methods should be used with caution because they operate at the class level
 *
 * `@BeforeAll/@AfterAll` indicates that it should run once before/after all test methods "in the test class".
 */
public class BeforeAfterAllExample {

    @BeforeAll
    static void setupOnce() {
        System.out.println("BeforeAll");
    }

    @Test
    void testMethod1() {
        // Test code
    }

    @Test
    void testMethod2() {
        // Test code
    }

    @AfterAll
    static void cleanupOnce() {
        System.out.println("AfterAll");
    }
}

