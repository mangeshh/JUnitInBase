package com.mockito.sample.when_call_return_this;

import static org.mockito.Mockito.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MyServiceTest {

    @Test
    public void testCalculateValue() {
        // Create a mock of MyService
        MyService myServiceMock = mock(MyService.class);

        // Create a custom object to be returned
        CustomObject stubbedObject = new CustomObject("Stubbed Value");

        // Stubbing calculateValue method
        doReturn(stubbedObject).when(myServiceMock).calculateValue();

        // When calculateValue is called, it returns the stubbed object
        CustomObject result = myServiceMock.calculateValue();

        // Assertions
        assertNotNull(result);
        assertEquals("Stubbed Value", result.getValue());
    }
}