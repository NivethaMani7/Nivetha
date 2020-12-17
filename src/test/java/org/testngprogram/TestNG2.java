package org.testngprogram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import samp.al.BaseClass;

public class TestNG2 extends BaseClass{
	WebDriver driver;
	@BeforeClass
  private void beforeclass() {
		driver = launchBrowser();
		launchUrl("https://www.redbus.in/");
		driver.manage().window().maximize();
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
		
		
		WebElement sign = driver.findElement(By.id("signin-block"));
		btnClick(sign);
		
		WebElement signin = driver.findElement(By.id("hc"));
		btnClick(signin);
		WebElement phno = driver.findElement(By.xpath("(//input[@class='IP'])[1]"));
		fill(phno, "9080728859");
		
		
	
	}

}
