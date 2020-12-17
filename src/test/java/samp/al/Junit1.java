package samp.al;


import java.sql.Driver;
import java.util.Date;

import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.sun.org.apache.bcel.internal.generic.LNEG;

public class Junit1 extends BaseClass{
	@BeforeClass
	public static void beforeClass() {
		System.out.println("Before Class");
		WebDriver d = launchBrowser();
		launchUrl("http://adactinhotelapp.com/");
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
	public void test1() {
		PojoClass1 o1 = new PojoClass1();
		fill(o1.getUname(), "renurenu");
		fill(o1.getPass(), "renurenu");
		btnClick(o1.getclogin());
	}
	
	@Test
	public void test2() {
		PojoClass2 o2 = new PojoClass2();
		sselect(o2.getLoc(), 2);
		sselect(o2.getHotel(), 2);
		sselect(o2.getRoomType(), 2);
		btnClick(o2.getSea());
	}
	
	@Test
	public void test3() {
	PojoClass3 o3 = new PojoClass3();
	btnClick(o3.getRadioButton());
	btnClick(o3.getConti());
	}
	
	@Test
	public void test4() throws InterruptedException {
	PojoClass4 o4 = new PojoClass4();
	fill(o4.getFname(), "sfg");
	fill(o4.getLname(), "sdf");
	fill(o4.getAddress(),"ghdgh");
	fill(o4.getCcardno(),"1234567890123456");
	sselect(o4.getCcardType(), 2);
	sselect(o4.getExpiryMonth(), 12);
	sselect(o4.getExpiryYear(), 12);
	fill(o4.getCvvNo(), "234");
	btnClick(o4.getBookNow());
	Thread.sleep(7000);
	
	}
	
	@Test
	public void test5() {
		PojoClass5 o5 = new PojoClass5();
		WebElement box = driver.findElement(By.id("order_no"));
		String attribute = box.getAttribute("value");
		System.out.println(attribute);
		
		
	}
	
	

}
