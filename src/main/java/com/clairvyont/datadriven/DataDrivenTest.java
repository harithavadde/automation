package com.clairvyont.datadriven;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.clairvyont.helper.ExcelHelper;

public class DataDrivenTest {
	
	WebDriver driver;
	
	@BeforeTest
	public void setUp() {
		
		System.setProperty("webdriver.gecko.driver", "D:/geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get(Constant.URL);
	}
	
	@Test
	public void Execute() throws Exception {
		
		ExcelHelper.setExcelFile(Constant.Path_TestData + Constant.File_TestData, "Test");
		
		String sFirstName = ExcelHelper.getCell(1, 1);
		String uPassword = ExcelHelper.getCell(1,2);
		System.out.println("UserName:" + sFirstName);
		System.out.println("Password:" + uPassword);
		
		clickAccount();
		
		loginClick(sFirstName, uPassword);
		
		ExcelHelper.setCellData("pass", 1, 3);
		
	}
	
	private void clickAccount() {

       driver.findElement(By.xpath("//*[@id=\"account\"]/a")).click();
		
	}
	
	private void loginClick(String firstName, String password) {

	    
			driver.findElement(By.xpath("//*[@id=\"log\"]")).sendKeys(firstName);
		
			driver.findElement(By.xpath("//*[@id=\"pwd\"]")).sendKeys(password);
		
			driver.findElement(By.xpath("//*[@id=\"login\"]")).click();
		
			
		}
	@AfterTest
	public void afterTest() {
		driver.close();
		
	}

}
