package com.example.sample;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ParameterizingTest {

    @ParameterizedTest
    @MethodSource("stringProvider")
    void testStringLength(String input, int expectedLength) {
        assertEquals(expectedLength, input.length());
    }

    static Stream<Arguments> stringProvider() {
        return Stream.of(
                Arguments.of("hello", 5), //input, expectedLength
                Arguments.of("JUnit", 5),
                Arguments.of("parameterized", 12)
        );
    }

}
