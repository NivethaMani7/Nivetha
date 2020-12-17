package org.testngprogram;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.*;
import org.testng.annotations.Test;
import org.openqa.selenium.interactions.Actions;

import org.testng.asserts.*;

import samp.al.BaseClass;

public class TestNG1 extends BaseClass{
	WebDriver driver;
	@BeforeClass
  private void beforeclass() {
		driver = launchBrowser();
		launchUrl("https://www.facebook.com/");
System.out.println("Before Class");
}
	@AfterClass
	  private void afterclass() {
	System.out.println("After Class");
	}
	
	@BeforeMethod
	  private void beforeMethod() {
	System.out.println("Before Class");
	}
	
	@AfterMethod
	  private void afterMethod() {
	System.out.println("Before Class");
	}
	
	@Test
	private void test() {
		
		SoftAssert s = new SoftAssert();
		
		
		WebElement user = driver.findElement(By.id("email"));
		user.sendKeys("nivedha");
		
		String tuser = user.getAttribute("value");
		
		s.assertEquals(tuser, "nived", "verify user name");

		WebElement txtPass= driver.findElement(By.id("pass"));
		txtPass.sendKeys("nivedha");
		String pass = user.getAttribute("value");
		s.assertEquals(1234567,23456, "verify password");
		WebElement btnLogin = driver.findElement(By.name("login"));
		btnLogin.click();
		s.assertAll();
		
	
	}

}
