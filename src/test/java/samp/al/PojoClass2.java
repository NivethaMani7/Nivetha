package samp.al;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
public class PojoClass2 extends BaseClass{
	public PojoClass2(){
		PageFactory.initElements(driver,this);
	}
	@FindBy(id="location")
	private WebElement loc;
	@FindBy(id="hotels")
	private WebElement hotel;
	@FindBy(id="room_type")
	private WebElement roomType;
	@FindBy(id="Submit")
	private WebElement sea;
	
	public WebElement getLoc() {
		return loc;
	}
	
	public WebElement getHotel() {
		return hotel;
	}
	
	public WebElement getRoomType() {
		return roomType;
	}
	
	public WebElement getSea() {
		return sea;
	}
	
}
	
