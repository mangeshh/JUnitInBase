package com.mockito.sample.doAnswer_for_void_methods;

public class UserManager {
    public void updateUser(User user) {
        System.out.println("i am actual method.. call me!!!!");
        // Update user details in the database
    }
}