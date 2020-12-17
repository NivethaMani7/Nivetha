package samp.al;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PojoClass4 extends BaseClass {
	public PojoClass4(){
		PageFactory.initElements(driver,this);
	}
	@FindBy(id="first_name")
	private WebElement fname;
	@FindBy(id="last_name")
	private WebElement lname;
	@FindBy(id="address")
	private WebElement address;
	@FindBy(id="cc_num")
	private WebElement ccardno;
	@FindBy(id="cc_type")
	private WebElement ccardType;
	@FindBy(id="cc_exp_month")
	private WebElement expiryMonth;
	@FindBy(id="cc_exp_year")
	private WebElement expiryYear;
	@FindBy(id="cc_cvv")
	private WebElement cvvNo;
	@FindBy(id="book_now")
	private WebElement bookNow;
	
	public WebElement getFname() {
		return fname;
	}
	public WebElement getLname() {
		return lname;
	}
	public WebElement getAddress() {
		return address;
	}
	public WebElement getCcardno() {
		return ccardno;
	}
	public WebElement getCcardType() {
		return ccardType;
	}
	public WebElement getExpiryMonth() {
		return expiryMonth;
	}
	public WebElement getExpiryYear() {
		return expiryYear;
	}
	public WebElement getCvvNo() {
		return cvvNo;
	}
	public WebElement getBookNow() {
		return bookNow;
	}

}
