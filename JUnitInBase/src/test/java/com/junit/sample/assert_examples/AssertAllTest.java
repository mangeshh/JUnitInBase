package com.junit.sample.assert_examples;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AssertAllTest {

    @Test
    void testMultipleAssertions() {
        String firstName = "John";
        String lastName = "Doe";
        int age = 30;
        // assertAll has heading and all executables.
        assertAll("Person Details",
                () -> assertEquals("John", firstName, "First name mismatch"),
                () -> assertEquals("Doe", lastName, "Last name mismatch"),
                () -> assertTrue(age >= 18 && age <= 65, "Age out of valid range")
        );
    }
}
