package BaseClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {


	
	WebDriver driver;
	
	public void setUp() {
		
		WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
	    
	    driver.manage().deleteAllCookies();
	   
	    driver.get("https://practicetestautomation.com/practice-test-login/");
	    
	}
	
	
	
	
	
}
