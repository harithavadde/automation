package com.clairvoyant.pageobjectmodel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
	
	WebDriver driver ;
	
	By homePageName = By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[3]");
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
	}
	
	public String goToHomePage() {
		
		return driver.findElement(homePageName).getText();
		
	}

}
