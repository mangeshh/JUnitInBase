package com.mockito.sample.spy_examples;

import static org.mockito.Mockito.*;


class MyClass {

    public String doSomething() {
        return "doSomething()";
    }

    public String someMethod() {
        return "someMethod()";
    }

    public String anotherMethod() {
        return "someMethod()";
    }
}

/**
 * spy is like a partial stuffing!
 */
public class BeginnerExample {

    public static void main(String[] args) {
        // Create a real object
        MyClass realObject = new MyClass();

        // Create a spy of the real object
        MyClass spyObject = spy(realObject);

        // Use the spy to retain the real behavior of a method
        System.out.println("Real behavior of doSomething:");
        spyObject.doSomething(); // This calls the real method

        // Stub a specific method on the spy
        when(spyObject.someMethod()).thenReturn("Mocked Result");

        // Now, calling the stubbed method will return the mocked result
        System.out.println("Stubbed behavior of someMethod:");
        System.out.println(spyObject.someMethod());

        // You can still use the spy to call other real methods
        System.out.println("Real behavior of anotherMethod:");
        spyObject.anotherMethod();
    }
}