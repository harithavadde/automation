package com.clairvoyant.pageobjectmodel;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class TestLoginPage {
	
	WebDriver driver;
	
	LoginPage loginPage;
	
	HomePage homePage;
	
	
	@BeforeTest
	public void setUp() {
		
		System.setProperty("webdriver.gecko.driver", "D:/geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("http://demo.guru99.com/V4/");
	}
	
	@Test
	public void verifyLoginPage() {
		
		loginPage = new LoginPage(driver);
		
		String loginTitle = loginPage.getTextDisplay();
		
		Assert.assertTrue(loginTitle.toLowerCase().equalsIgnoreCase("Guru99 Bank"));
		
		loginPage.loginToGuru("mngr125864", "nApUgEp");
		homePage = new HomePage(driver);
		
		Assert.assertTrue(homePage.goToHomePage().contains("Manger Id : mngr125864"));
	}
	
	@AfterTest
	public void afterTest() {
		driver.close();
		
	}
	
	
	

}
