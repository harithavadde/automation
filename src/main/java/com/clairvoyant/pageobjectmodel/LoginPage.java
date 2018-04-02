package com.clairvoyant.pageobjectmodel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	WebDriver driver;
	
	By userName = By.xpath("/html/body/form/table/tbody/tr[1]/td[2]/input");
	By password = By.name("password");
	By loginButton = By.name("btnLogin");
	By displayText = By.className("barone");
	
	public LoginPage(WebDriver driver) {
		
		this.driver = driver;
	}
	
	public void setUserName(String strUserName) {
		 
		driver.findElement(userName).sendKeys(strUserName);
	}
	
	public void setPassword(String strPassword) {
		
		driver.findElement(password).sendKeys(strPassword);
	}
	
	public void clickLogin() {
		
		driver.findElement(loginButton).click();
	}
	
	public String getTextDisplay() {
		
		 return driver.findElement(displayText).getText();
	}
	
	public void loginToGuru(String strUserName, String strPassword) {
		
		this.setUserName(strUserName);
		
		this.setPassword(strPassword);
		
		this.clickLogin();
	}
}
	
	
