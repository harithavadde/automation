package com.clairvoyant.automation;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SeleniumAllFunctions {
	
	WebDriver wd;
	
	@BeforeTest
	public void setUp() {
		
		System.setProperty("webdriver.gecko.driver", "D:/geckodriver.exe");
		//get firefox webdriver to interact with firefoxwebdriver
		wd = new FirefoxDriver();
		//get the web page
		wd.get("http://demoqa.com/registration/");
	}

	@Test
	public void register() {
		
		try {
		
		
		//find the elements for first and last name using ID locator
		WebElement  first = wd.findElement(By.id("name_3_firstname"));
		first.sendKeys("Haritha");
		WebElement last = wd.findElement(By.name("last_name"));
		last.sendKeys("Vadde");
		//Find element radioButton using xpath locator
		WebElement maritalStatusRadioButton = wd.findElement(By.xpath("//*[@id=\"pie_register\"]/li[2]/div/div/input[1]"));
		maritalStatusRadioButton.click();
		//Find element CheckBox using xpath locator
		WebElement hobbyCheckBox = wd.findElement(By.xpath("//*[@id=\"pie_register\"]/li[3]/div/div/input[1]"));
		hobbyCheckBox.click();
		//Find element DropDown using xpath locator
		WebElement countryDropDown = wd.findElement(By.xpath("//*[@id=\"dropdown_7\"]"));
		Select country = new Select (countryDropDown);
		country.selectByValue("India");
		//Find Month element Dropdown using xpath locator
		WebElement month = wd.findElement(By.xpath("//*[@id=\"mm_date_8\"]"));
		Select birthMonth=new Select (month);
		birthMonth.selectByValue("10");
		//Find Day element Dropdown using xpath locator
		WebElement day = wd.findElement(By.xpath("//*[@id=\"dd_date_8\"]"));
		Select birthDay=new Select (day);
		birthDay.selectByValue("31");
		//Find Year element Dropdown using xpath locator
		WebElement year = wd.findElement(By.xpath("//*[@id=\"yy_date_8\"]"));
		Select birthYear=new Select (year);
		birthYear.selectByValue("1988");
		//Find element PhoneNumber using xpath locator
		WebElement phoneNumberText = wd.findElement(By.xpath("//*[@id=\"phone_9\"]"));
		phoneNumberText.sendKeys("7755538378");
		
		Random rand = new Random();
		int randomNumber = rand.nextInt();
		
		//Find element Email using xpath locator
		WebElement emailText = wd.findElement(By.xpath("//*[@id=\"email_1\"]"));
		String email = "reg"+randomNumber+"@mailinator.com";
		emailText.sendKeys(email);
		WebElement aboutYourself=wd.findElement(By.xpath("//*[@id=\"description\"]"));
		aboutYourself.sendKeys("Selenium");
		//Find element Password using xpath locator
		WebElement passwordText = wd.findElement(By.xpath("//*[@id=\"password_2\"]"));
		passwordText.sendKeys("Demoqa@123");
		//Find element confirmPassword using xpath locator
		WebElement confirmPasswordText = wd.findElement(By.xpath("//*[@id=\"confirm_password_password_2\"]"));
		confirmPasswordText.sendKeys("Demoqa@123");
		//Find element profilePic using ID locator
		WebElement chooseProfilePic = wd.findElement(By.xpath("//*[@id=\"profile_pic_10\"]"));
		//chooseProfilePic.sendKeys("D:\\IMG_6819.JPEG");
		//chooseProfilePic.findElement(By.xpath("//*[@id=\"profile_pic_10\"]")).click();;
		WebElement userNameText = wd.findElement(By.xpath("//*[@id=\"username\"]"));
		userNameText.sendKeys(email);
		//Find element submit using xpath locator
		WebElement submitButton = wd.findElement(By.xpath("//*[@id=\"pie_register\"]/li[14]/div/input"));
		submitButton.click();
		Thread.sleep(3000);
		WebElement success = wd.findElement(By.className("piereg_message"));
		System.out.println(success.getText());
		}
		catch(Exception e) {
			System.out.println("Error");
		}

	}
	
	@AfterTest
	public void afterTest() {
		wd.close();
		
	}

}
