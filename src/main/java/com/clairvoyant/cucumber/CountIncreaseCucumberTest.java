package com.clairvoyant.cucumber;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;


@CucumberOptions(
		
		features = {
				"src/test/resources/features/"
		},
		glue = {
				
				"com.clairvoyant.cucumber"
		}
		)

public class CountIncreaseCucumberTest extends AbstractTestNGCucumberTests {
	
}
