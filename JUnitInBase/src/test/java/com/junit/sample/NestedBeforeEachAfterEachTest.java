package com.junit.sample;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Usually @BeforeEach and @AfterEach runs before-after each testcase.
 */
public class NestedBeforeEachAfterEachTest {

    @BeforeEach
    void beforeEachOuter() {
        System.out.println("Before each <<OUTER>> test container");
        // Add setup code for outer container here
    }

    @AfterEach
    void afterEachOuter() {
        System.out.println("After each <<OUTER>> test container");
        // Add teardown code for outer container here
    }

    @Nested
    class InnerTests1 {

        @BeforeEach
        void beforeEachInner1() {
            System.out.println("starting : InnerTests1 : afterEachInner1");
            // Add setup code for inner container 1 here
            System.out.println("ending : InnerTests1: beforeEachInner1 \n");

        }

        @AfterEach
        void afterEachInner1() {
            System.out.println("starting : InnerTests1 : afterEachInner1");
            // Add teardown code for inner container 1 here
            System.out.println("ending : InnerTests1: afterEachInner1 \n");

        }

        @Test
        void testInner1() {
            assertEquals(2, 1 + 1);
        }
    }

    @Nested
    class InnerTests2 {

        @BeforeEach
        void beforeEachInner2() {
            System.out.println("starting : InnerTests2 : beforeEachInner2");
            // Add setup code for inner container 2 here
            System.out.println("ending : InnerTests2 : beforeEachInner2 \n");

        }

        @AfterEach
        void afterEachInner2() {
            System.out.println("starting : InnerTests2 : afterEachInner2");
            // Add teardown code for inner container 2 here
            System.out.println("ending : InnerTests2 : afterEachInner2 \n");

        }

        @Test
        void testInner2() {
            assertEquals(4, 2 * 2);
        }
    }

    @Test
    void testOuter() {
        assertEquals(8, 2 * 4);
    }
}

