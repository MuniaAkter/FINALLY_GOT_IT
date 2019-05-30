package CapitalOne;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	
	WebDriver driver;
	
	public void openDriver () {
		if (driver == null) {
		System.setProperty("webdriver.chrome.driver", "/Users/muniaakter/Downloads/chromedriver");
		driver = new ChromeDriver();
		driver.get("");
		}
		
	}

}
