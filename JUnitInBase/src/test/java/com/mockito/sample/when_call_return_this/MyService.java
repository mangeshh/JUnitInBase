package com.mockito.sample.when_call_return_this;

public class MyService {
    public CustomObject calculateValue() {
        // Some complex logic...
        return new CustomObject("Real Value");
    }
}