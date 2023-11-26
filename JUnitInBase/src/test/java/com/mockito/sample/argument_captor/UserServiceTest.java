package com.mockito.sample.argument_captor;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;
import org.mockito.ArgumentCaptor;

/**
 * This approach is particularly useful when you want to perform assertions on the arguments that are passed to the methods of your mocked objects.
 *
 */
public class UserServiceTest {

    @Test
    public void testCreateUser() {
        // Create a mock UserService
        UserService mockUserService = mock(UserService.class);

        // Use the UserService
        mockUserService.createUser("Alice", 30);

        // Create Argument Captors for String and Integer
        ArgumentCaptor<String> nameCaptor = ArgumentCaptor.forClass(String.class);
        ArgumentCaptor<Integer> ageCaptor = ArgumentCaptor.forClass(Integer.class);

        // Capture the arguments
        verify(mockUserService).createUser(nameCaptor.capture(), ageCaptor.capture());

        // Assert that the captured values are the ones we expect
        assertEquals("Alice", nameCaptor.getValue());
        assertEquals(30, (int) ageCaptor.getValue());
    }

}
