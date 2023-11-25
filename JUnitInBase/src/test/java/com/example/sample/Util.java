package com.example.sample;

import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

public class Util {

    public static Stream<Arguments> stringProvider() {
        return Stream.of(
                Arguments.of("hello", 5), //input, expectedLength
                Arguments.of("JUnit", 5),
                Arguments.of("parameterized", 13)
        );
    }

}
