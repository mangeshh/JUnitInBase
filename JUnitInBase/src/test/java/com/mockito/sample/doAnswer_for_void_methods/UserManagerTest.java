package com.mockito.sample.doAnswer_for_void_methods;

import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.stubbing.Answer;

/**
 * this is how we apply interceptor!
 */
public class UserManagerTest {

    @Test
    public void testUpdateUser() {
        // Mock the UserManager
        UserManager mockUserManager = mock(UserManager.class);

        // Use doAnswer to add behavior to the updateUser method -- like interceptor.
        doAnswer(new Answer<Void>() {
            public Void answer(InvocationOnMock invocation) {
                Object[] args = invocation.getArguments();
                User user = (User) args[0]; // argument is user
                System.out.println("User updated: " + user.getName() + ", Age: " + user.getAge());
                // You can add more logic here, like assertions or additional method calls
                return null;
            }
        }).when(mockUserManager).updateUser(any(User.class)); // Imp, see the usage of any in case of custom object,  User

        // Call the method
        User user = new User();
        user.setName("Alice");
        user.setAge(30);
        mockUserManager.updateUser(user);
    }
}