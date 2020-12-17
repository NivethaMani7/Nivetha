package samp.al;

import org.openqa.selenium.WebElement;

public class PomFrameWork extends BaseClass {
	public static void main(String[] args) {
		launchBrowser();
		launchUrl("http://adactinhotelapp.com/");
		PojoClass1 o1 = new PojoClass1();
		fill(o1.getUname(), "jhg");
		fill(o1.getPass(), "renurenu");
		
	}

}
