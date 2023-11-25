package com.example.sample.healthcheck.test;


import com.example.sample.healthcheck.BMICalculator;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

class BMICalculatorTest {

    @org.junit.jupiter.api.Test
    void isDietRecommended() {
        // given
        double weight = 81.2;
        double height = 1.65;

        //when
        boolean expected = BMICalculator.isDietRecommended(weight, height);

        //then
        assertTrue(expected);

    }

    @org.junit.jupiter.api.Test
    void isDietRecommendedWithException() {
        // given
        double weight = 81.2;
        double height = 0.0;

        //when
        org.junit.jupiter.api.function.Executable executable = ()-> BMICalculator.isDietRecommended(weight, height);

        //then
        assertThrows(ArithmeticException.class, executable);

    }

    @org.junit.jupiter.api.Test
    void findCoderWithWorstBMI() {
    }

    @org.junit.jupiter.api.Test
    void getBMIScores() {
    }
}