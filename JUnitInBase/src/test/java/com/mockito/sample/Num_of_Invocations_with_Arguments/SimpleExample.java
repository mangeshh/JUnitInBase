package com.mockito.sample.Num_of_Invocations_with_Arguments;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.mockito.Mockito.*;

public class SimpleExample {

    @Test
    public void test(){
        List<String> mockedList = mock(List.class);

        // Example of verifying method invocation counts with arguments
        mockedList.add("once");

        mockedList.add("twice");
        mockedList.add("twice");

        mockedList.add("three times");
        mockedList.add("three times");
        mockedList.add("three times");

        verify(mockedList, times(1)).add("once");
        verify(mockedList, times(2)).add("twice");
        verify(mockedList, times(3)).add("three times");
    }
}
