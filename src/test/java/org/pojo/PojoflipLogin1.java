package org.pojo;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import samp.al.BaseClass;


public class PojoflipLogin1 extends BaseClass{
	
	
		public PojoflipLogin1(){
			PageFactory.initElements(driver,this);
		}
		@FindBy(xpath="(//input[@type='text'])[2]")
		
		private WebElement login;
		
		@FindBy(xpath="//input[@type='password']")

		private WebElement pass;
		
		@FindBy(xpath= "(//button[@type='submit'])[2]")
		private WebElement clickLog;
		
		

		public WebElement getLogin() {
			return login;
		}

		public WebElement getPass() {
			return pass;
		}
		public WebElement getClickLog() {
			return clickLog;
		}
		

	}


