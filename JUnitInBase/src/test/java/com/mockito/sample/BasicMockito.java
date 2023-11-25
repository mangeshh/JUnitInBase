package com.mockito.sample;

import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;

import java.util.List;
import java.util.Map;

public class BasicMockito {

    @Test
    public void testMockingList() {
        // Create a mock
        List mockedList = mock(List.class);

        // Use the mock
        mockedList.add("one");
        mockedList.clear();

        // Verify behaviors
        verify(mockedList).add("one");
        verify(mockedList).clear();
    }

    @Test
    public void testMockingMap() {
        // Create a mock
        Map mockedList = mock(Map.class);

        // Use the mock
        mockedList.put("one",1);
        mockedList.clear();

        // Verify behaviors
        verify(mockedList).put("one", 1);
        verify(mockedList).clear();
    }
}