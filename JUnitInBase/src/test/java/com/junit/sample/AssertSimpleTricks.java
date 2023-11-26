package com.junit.sample;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AssertSimpleTricks {

    @Test
    public void testArray(){
        int [] a = {1,2,3,4};
        int [] b = {1,2,3,4};
        assertArrayEquals(a,b, "array values are equal.");
    }

    @Test
    public void testStringEquality(){
        String a = "aaa";
        String b = "aaa";
        assertEquals(a,b, "String values are equal.");
    }
}
