package testngDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class Class_testng {
	WebDriver driver;
	@Test	
	public void befores() throws InterruptedException{ 
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		
		//ChromeOptions class is used to add any additional chrome browser related functions 
		ChromeOptions chro =new ChromeOptions();
		
		//To run chrome with incognito mode 
		//chro.addArguments("incognito");	
		//headless runs the program without invoking the browser
		chro.addArguments("headless");
		WebDriver driver =new ChromeDriver(chro);
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		System.out.println(driver.getTitle());		
	}
}
