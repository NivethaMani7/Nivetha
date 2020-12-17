package samp.al;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.interactions.Actions;
	import org.openqa.selenium.support.ui.Select;


public class BaseClass {
		public static	WebDriver driver;
		public static Actions a;
		public static Select s;
		
		public static WebDriver launchBrowser() {
			System.setProperty("webdriver.chrome.driver", "D:\\Selenium Programs\\Newprogram\\Selenium\\Lib\\chromedriver.exe");
			driver = new ChromeDriver();
					return driver;
		}
	public static void launchUrl(String url) {
			driver.get(url);
		}
	public static void maxWindow() {
		driver.manage().window().maximize();
	}

	public static void pageTitle() {
		String title = driver.getTitle();
		System.out.println(title);
	}
	public static void pageUrl() {
		String url = driver.getCurrentUrl();
		System.out.println(url);
	}

	public static void fill(WebElement ref, String value) {
		ref.sendKeys(value);
	}
	public static void btnClick(WebElement ref) {
		ref.click();
	}
	public static void rightClick(WebElement e) {
		a.contextClick(e).perform();
		}
	public static void clickDouble(WebElement element) {
	 a = new Actions(driver);
	 a.doubleClick(element).perform();
	}

	public static void sselect(WebElement ref, int num) {
		 s = new Select(ref);
		s.selectByIndex(num);
	}
  public static void attributee(WebElement ref) {
	  ref.getAttribute("value");

}




	public static void closeBrowser() {
	driver.quit();
	}



	

}
