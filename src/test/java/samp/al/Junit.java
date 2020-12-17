package samp.al;


import java.sql.Driver;
import java.util.Date;

import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Junit {
	static WebDriver driver;
	@BeforeClass
	public static void beforeClass() {
		System.out.println("Before Class");
		System.setProperty("webdriver.chrome.driver","D:\\Selenium Programs\\Newprogram\\Selenium\\Lib\\chromedriver.exe");
		  driver = new ChromeDriver();
		}
	@AfterClass	
	public static void afterClass() {
		System.out.println("After Class");
	
	}
	
	@Before
	public  void Before() {
		Date d = new Date();
		System.out.println("Start Time"+ d);
	}
	@After
	public  void After() {
		Date d = new Date();
		System.out.println("End Time"+ d);
	}
	
	@Test
public  void test1() {
	driver.get("http://adactinhotelapp.com/");
	WebElement userName = driver.findElement(By.xpath("//input[@id='username']"));
	userName.sendKeys("renurenu"); 
	WebElement pass = driver.findElement(By.xpath("//input[@id='password']"));
    pass.sendKeys("renurenu"); 
	WebElement btnClick = driver.findElement(By.xpath("//input[@id='login']"));
	btnClick.click();
	}	
	@Test
	public  void test2() {
		Select s1 = new Select(driver.findElement(By.xpath("//select[@id='location']")));
		s1.selectByIndex(1);
		
		Select s2 = new Select(driver.findElement(By.xpath("//select[@id='hotels']")));
		s2.selectByIndex(1);
		Select s3 = new Select(driver.findElement(By.xpath("//select[@id='room_type']")));
		s3.selectByIndex(1);
		Select s4 = new Select(driver.findElement(By.xpath("//select[@id='room_nos']")));
		s4.selectByIndex(1);
		WebElement btnClick = driver.findElement(By.id("Submit"));
		btnClick.click();
	}
	@Test
	public  void test3() throws InterruptedException {
		
		WebElement btnClick = driver.findElement(By.id("radiobutton_0"));
		btnClick.click();
		Thread.sleep(3000);
		
		WebElement conti = driver.findElement(By.xpath("//input[@name='continue']"));
		conti.click();
		}
	@Test
	public  void test4() throws InterruptedException {
		WebElement fname = driver.findElement(By.id("first_name"));
		fname.sendKeys("jgj");
		WebElement lname = driver.findElement(By.id("last_name")); 
		lname.sendKeys("fgdf");
		WebElement address = driver.findElement(By.id("address")); 
		address.sendKeys("fgdf");
		WebElement cardno = driver.findElement(By.id("cc_num")); 
		cardno.sendKeys("4467564431234567");
		WebElement ctype = driver.findElement(By.id("cc_type")); 
		Select s1 = new Select(ctype);
		s1.selectByIndex(1);
		Select s2 = new Select(driver.findElement(By.id("cc_exp_month")));
		s2.selectByIndex(12);
		
		Select s3 = new Select(driver.findElement(By.id("cc_exp_year")));
		s3.selectByIndex(12);
		
		WebElement cvv = driver.findElement(By.id("cc_cvv"));
		cvv.sendKeys("453");
		WebElement click =driver.findElement(By.id("book_now")); 
		click.click();
		Thread.sleep(7000);
		}
	@Test
	public  void test5() {
		WebElement box = driver.findElement(By.id("order_no"));
		String attribute = box.getAttribute("value");
		System.out.println(attribute);
		
	}
	
	
	
	
	
	
	
	
	

}
