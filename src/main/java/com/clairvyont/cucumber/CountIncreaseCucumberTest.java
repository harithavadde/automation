package com.clairvyont.cucumber;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;


@CucumberOptions(
		
		features = {
				"src/test/resources/features/"
		},
		glue = {
				
				"com.clairvyont.cucumber"
		}
		)

public class CountIncreaseCucumberTest extends AbstractTestNGCucumberTests {
	
}
