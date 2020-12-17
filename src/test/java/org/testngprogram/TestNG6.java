package org.testngprogram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import samp.al.BaseClass;

public class TestNG6 extends BaseClass{
	WebDriver driver;
	@BeforeClass
  private void beforeclass() {
		driver = launchBrowser();
		launchUrl("https://mail.google.com/");
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
	@Parameters({"user"})
	@Test
	private void test(@Optional("hbhg@gmail.com") String u) {
		fill(driver.findElement(By.xpath("//input[@type='email']")), u);
		btnClick(driver.findElement(By.xpath("//div[@class='VfPpkd-RLmnJb']")));
		
	}	

}
