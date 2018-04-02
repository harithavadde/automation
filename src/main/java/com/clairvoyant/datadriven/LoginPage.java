package com.clairvoyant.datadriven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginPage {
		
		WebDriver driver;
		
		By userName = By.xpath("//*[@id=\"log\"]");
		By passWord = By.xpath("//*[@id=\"pwd\"]");
		By login = By.xpath("//*[@id=\"login\"]");
		
		
		public LoginPage(WebDriver driver) {
			 this.driver = driver ;
		}
		
		public void setUserName(String strUserName) {
			driver.findElement(userName).sendKeys(strUserName);
		}
		
		public void setPassword(String strPassword) {
			
			driver.findElement(passWord).sendKeys(strPassword);
		}
		
		public void loginClick() {
			driver.findElement(login).click();
		}
		
		
		
	
	

}
