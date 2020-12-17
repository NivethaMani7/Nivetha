package org.testngprogram;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.pojo.PojoflipLogin1;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import samp.al.BaseClass;

public class TestNG4 extends BaseClass{
	WebDriver driver;
	@BeforeClass
  private void beforeclass() {
		driver = launchBrowser();
		launchUrl("http://www.greenstechnologys.com/");
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
		System.out.println("Test");
		
	}	
		
	}
