package com.mockito.sample;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.*;

/**
 * Interesting!!
 *
 * if we ask for any value (get(index)) from mocked list then return "element".
 */
public class ArgumentMatchingTest {

    @Test
    public void testArgumentMatchers() {
        List<String> mockedList = mock(List.class);

        // Using an argument matcher
        when(mockedList.get(anyInt())).thenReturn("element");

        // This would return "element" for any integer index
        assertEquals("element", mockedList.get(0));
        assertEquals("element", mockedList.get(99));

        // Verification using argument matcher
        verify(mockedList).get(anyInt());
    }


}
