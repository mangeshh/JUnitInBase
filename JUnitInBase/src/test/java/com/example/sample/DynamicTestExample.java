package com.example.sample;

import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;
import org.junit.jupiter.api.function.ThrowingConsumer;
import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Stream;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.DynamicTest.dynamicTest;

/**
 * If we see, everything is dynamic. like expected 4 and actual 2+2. it may be functions also.
 * but, not sure where to use dynamic tests.
 *
 * Game Changer is - definition; dynamicTest(String displayName, Executable)
 */
public class DynamicTestExample {

    @TestFactory
    Collection<DynamicTest> dynamicTestsFromCollection() {
        return Arrays.asList(
                dynamicTest("Addition Test", () -> assertEquals(4, 2 + 2)),
                dynamicTest("Subtraction Test", () -> assertEquals(2, 4 - 2)),
                dynamicTest("Multiplication Test", () -> assertEquals(6, 2 * 3)),
                dynamicTest("Division Test", () -> assertEquals(3, 9 / 3))
        );
    }

    @TestFactory
    Stream<DynamicTest> dynamicTestsFromStream() {
        return Stream.of("apple1", "banana", "cherry")
                .map(s -> dynamicTest("Length of " + s, () -> assertEquals(s.length(), 6)));
    }

    @TestFactory
    Stream<DynamicTest> dynamicTestsUsingMethodReference() {
        return Stream.of(1, 2, 3)
                .map(this::createDynamicTestForNumber);
    }

    private DynamicTest createDynamicTestForNumber(int number) {
        ThrowingConsumer<Integer> test = n -> assertEquals(number * number, n * n);
        String testName = "Square of " + number;
        return dynamicTest(testName, () -> test.accept(number));
    }
}
