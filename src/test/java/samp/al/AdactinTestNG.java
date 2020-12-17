package samp.al;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AdactinTestNG extends BaseClass{
	WebDriver driver;
	@BeforeClass
  private void beforeclass() {
		driver = launchBrowser();
		launchUrl("http://adactinhotelapp.com/");
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
	@Parameters({"user", "password"})
	@Test
	private void test(String u, String p) {
		PojoClass1 p1 = new PojoClass1();
		fill(p1.getUname(), u);
		fill(p1.getPass(), p);
		
		
		
	}
}
