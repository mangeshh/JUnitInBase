package com.example.sample;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNull;

public class AssertNullTest {

    @Test
    void testNullValue() {
        String value = null;
        assertNull(value, "Expected null, but the value was not null");
    }
}
