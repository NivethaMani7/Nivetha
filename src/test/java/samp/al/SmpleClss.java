package samp.al;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SmpleClss extends BaseClass{
	public static void main(String[] args) throws IOException, InterruptedException {
		

		
			WebDriver d = launchBrowser();
			launchUrl("http://adactinhotelapp.com/");
			WebElement userName = d.findElement(By.xpath("//input[@id='username']"));
			fill(userName, "renurenu");
			WebElement pass = d.findElement(By.xpath("//input[@id='password']"));
			fill(pass, "renurenu");
			
			btnClick(d.findElement(By.xpath("//input[@id='login']")));
			WebElement location = d.findElement(By.xpath("//select[@id='location']"));
			
			sselect(location, 1);
			sselect(d.findElement(By.xpath("//select[@id='hotels']")), 1);
			sselect(d.findElement(By.xpath("//select[@id='room_type']")), 1);
			sselect(d.findElement(By.xpath("//select[@id='room_nos']")), 1);
			btnClick(d.findElement(By.id("Submit")));
			Thread.sleep(3000);
			
			btnClick(d.findElement(By.id("radiobutton_0")));
			Thread.sleep(3000);
			btnClick(d.findElement(By.xpath("//input[@name='continue']")));
			
		
			fill(d.findElement(By.id("first_name")), "jgj");
			fill(d.findElement(By.id("last_name")), "jgj");
			fill(d.findElement(By.id("address")), "jgj");
			fill(d.findElement(By.id("cc_num")), "4467564431234567");
			sselect(d.findElement(By.id("cc_type")), 1);
			sselect(d.findElement(By.id("cc_exp_month")), 1);
			sselect(d.findElement(By.id("cc_exp_year")), 9);
			fill(d.findElement(By.id("cc_cvv")), "456");
			btnClick(d.findElement(By.id("book_now")));
			Thread.sleep(7000);
			//WebElement orderno = d.findElement(By.id("order_no"));
			WebElement box = d.findElement(By.id("order_no"));
			String attribute = box.getAttribute("value");
			System.out.println(attribute);
			
			
			
			
			
			
		}

}
