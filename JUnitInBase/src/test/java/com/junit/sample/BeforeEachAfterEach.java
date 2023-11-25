package com.junit.sample;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BeforeEachAfterEach {

    @BeforeEach
    void beforeEachTestCase() {
        System.out.println("starting : beforeEachTestCase");
        // Add setup code for inner container 1 here
    }

    @AfterEach
    void afterEachTestCase() {
        System.out.println("starting : afterEachTestCase");
        // Add teardown code for inner container 1 here
        System.out.println("\n");
    }

    @Test
    void testMethod1() {
        System.out.println("executing actual test case 1");
        assertEquals(2, 1 + 1);
    }

    @Test
    void testMethod2() {
        System.out.println("executing actual test case 2");
        assertEquals(3, 2 + 1);
    }
}

