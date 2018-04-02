package com.clairvyont.jbehave;

import static org.testng.Assert.assertTrue;

import java.util.Random;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

public class IncreaseSteps {
	
	
	private int counter;
	private int previousValue;
	
	@Given("a counter")
	public void aCounter() {
		
	}
	
	@Given("the counter has any integral value")
	public void integralValue() {
		
		counter = new Random().nextInt();
		previousValue = counter;
	}
	
	@When("the user increases the counter")
	public void increaseCounter() {
		
		counter++;
	}
	
	@Then("the value of the counter must be 1 greater than previous value")
	public void counterGreater() {
		
		assertTrue(1 == counter - previousValue);
	}

}
