package com.fizzbuzz.testing;

import com.fizzbuzz.methods.FizzBuzz;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class FizzBuzzStepDefinitions {

    FizzBuzz fizzBuzz;
    String result;

    @Given("^Create a FizzBuzz game$")
    public void createAFizzBuzzGamePlay() throws Throwable {
        fizzBuzz = new FizzBuzz();
    }

    @When("^I play with number (\\d+)$")
    public void iPlayWithNumber(int number) throws Throwable {
        result = fizzBuzz.play(number);
    }

    @Then("^I expect \"([^\"]*)\"$")
    public void theResultIs(String resultString) throws Throwable {
        Assert.assertEquals(result, resultString);
    }
}
