package testngDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Testleaf {
	WebDriver driver;
	@BeforeSuite
	public void bs() {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		driver =new ChromeDriver();
		 driver.get("http://demo.guru99.com/test/newtours");
		
	}
  @Test
  public void leaf() {
	 
		 String value = driver.findElement(By.id("name")).getAttribute("value");
		  System.out.println("Attribute value is : "+ value);
  }
}
