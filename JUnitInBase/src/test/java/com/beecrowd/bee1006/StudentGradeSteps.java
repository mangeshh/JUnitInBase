package com.beecrowd.bee1006;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.assertEquals;

public class StudentGradeSteps {
    public static final double DELTA = 0.0001;

    private final StudentGrade equation = new StudentGrade();
    private double actual;

    @Given("three_numbers_avg: first number is {double}")
    public void first_number_is(Double a) {
        equation.setA(a);
    }
    @Given("three_numbers_avg: second number is {double}")
    public void second_number_is(Double b) {
        equation.setB(b);
    }
    @Given("three_numbers_avg: third number is {double}")
    public void third_number_is(Double c) {
        equation.setC(c);
    }
    @When("three_numbers_avg: average is calculated")
    public void average_is_calculated() {
        actual = equation.getAverage();
    }
    @Then("three_numbers_avg: result should be {double}")
    public void result_should_be(Double expected) {
        assertEquals(expected, actual, DELTA);
    }
}
