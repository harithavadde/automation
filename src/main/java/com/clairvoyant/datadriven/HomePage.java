package com.clairvoyant.datadriven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
	
	WebDriver driver;
	
	By myAccount = By.xpath("//*[@id=\"account\"]/a");
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void clickAccount() {
		
		driver.findElement(myAccount).click();
	}

}
