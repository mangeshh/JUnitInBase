package com.mockito.sample;


import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;


public class PartialMockingSpiesTest {

    @Test
    public void testSpy() {
        List<String> list = new ArrayList<>();
        List<String> spyList = spy(list);

        // Add an element using the real method
        spyList.add("one");
        assertEquals(1, spyList.size());

        // Stubbing a method
        doReturn(100).when(spyList).size();
        assertEquals(100, spyList.size());
    }
}
