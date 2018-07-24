package oops;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class ExcelRetrieval {	

	
	   @Test
		public void instantiateDriver() {
		
		System.setProperty("webdriver.chrome.driver", "Chrome//chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.cleartrip.com/");
	}
	   
	   
}
