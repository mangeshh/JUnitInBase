package com.mockito.sample.donothing_examples;

import static org.mockito.Mockito.*;

/**
 * do nothing is used - Isolating Code Under Test.
 * Stubs for Unimportant Methods.
 * Avoiding Unwanted Behavior
 */
class FileProcessor {
    public void processFile(String filePath) {
        // Some file processing logic here
        // We want to avoid executing this logic during testing
    }
}

public class Example {
    public static void main(String[] args) {
        // Create a mock of the FileProcessor class
        FileProcessor fileProcessorMock = mock(FileProcessor.class);

        // Use doNothing to specify that processFile should have no effect
        doNothing().when(fileProcessorMock).processFile(anyString());

        // Test the mock
        fileProcessorMock.processFile("test.txt"); // This will have no effect

        // You can also verify that the method was called with specific arguments
        verify(fileProcessorMock).processFile("test.txt");
    }
}
