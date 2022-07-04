package pages;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BGTestBasePage {
	
	public static WebDriver driver; 
	
	public static void initDriver() { 
		
		System.setProperty("webdriver.chrome.driver", "driver\\chromedriverupdated.exe");
		driver = new ChromeDriver(); 
		driver.get("http://techfios.com/test/103/");
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	
	}
	
	
}