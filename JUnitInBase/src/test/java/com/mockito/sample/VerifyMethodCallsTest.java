package com.mockito.sample;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.mockito.Mockito.*;

public class VerifyMethodCallsTest {

    @Test
    public void testVerify() {
        List<String> mockedList = mock(List.class);

        // Some interactions
        mockedList.add("one");
        mockedList.add("two");
        mockedList.add("two");

        // Verifying exact number of invocations
        verify(mockedList, times(1)).add("one");
        verify(mockedList, times(2)).add("two");

        // Verify that method was never called with a certain value
        verify(mockedList, never()).add("three");

        // Verify that method was called at least once
        verify(mockedList, atLeastOnce()).add("one");
    }
}
