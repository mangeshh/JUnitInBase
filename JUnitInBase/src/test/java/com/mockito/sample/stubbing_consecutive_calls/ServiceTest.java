package com.mockito.sample.stubbing_consecutive_calls;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ServiceTest {

    @Test
    public void testStubbingConsecutiveCalls() {
        // Create a mock object of the Service class
        Service mockService = mock(Service.class);

        // Stubbing consecutive calls
        when(mockService.getResponse(anyString())) // Super important, anyString()!!
                .thenReturn("First call response")
                .thenReturn("Second call response")
                .thenReturn("Third call response");

        // Asserting the behavior for consecutive calls
        assertEquals("First call response", mockService.getResponse("test"));
        assertEquals("Second call response", mockService.getResponse("test"));
        assertEquals("Third call response", mockService.getResponse("test"));

        // Any subsequent calls will return the last stubbed value
        assertEquals("Third call response", mockService.getResponse("another test"));
    }
}
