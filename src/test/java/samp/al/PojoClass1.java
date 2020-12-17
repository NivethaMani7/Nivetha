package samp.al;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class PojoClass1 extends BaseClass{
	
	public PojoClass1(){
		PageFactory.initElements(driver,this);
	}
@FindBy(id="username")	
     private WebElement uname;
@FindBy(id="password")
   	private WebElement pass;

  @FindBy(id="login")   
     private WebElement clogin;
     
     public WebElement getUname() {
 		return uname;
 	}


 	public WebElement getPass() {
 		return pass;
 	}


 	public WebElement getclogin() {
 		return clogin;
 	}

     
}


