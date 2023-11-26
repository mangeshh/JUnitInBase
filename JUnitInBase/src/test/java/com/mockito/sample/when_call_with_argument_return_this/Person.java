package com.mockito.sample.when_call_with_argument_return_this;

public class Person {
    private String name;
    private int age;

    // Constructor, getters, setters...
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}

