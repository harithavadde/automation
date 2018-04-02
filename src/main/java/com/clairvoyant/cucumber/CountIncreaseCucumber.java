package com.clairvoyant.cucumber;

import static org.testng.Assert.assertTrue;

import java.util.Random;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;



public class CountIncreaseCucumber {
	
	private int counter;
	private int previousValue;
	
	@Given("^a counter$")
	public void aCounter() {
		
	}
	
	@Given("^the counter has any integral value$")
	public void integralValue() {
		
		counter = new Random().nextInt();
		previousValue = counter;
	}
	
	@When("^the user increases the counter$")
	public void increaseCounter() {
		
		counter++;
	}
	
	@Then("^the value of the counter must be 1 greater than previous value$")
	public void counterGreater() {
		
		assertTrue(1 == counter - previousValue);
	}

}


