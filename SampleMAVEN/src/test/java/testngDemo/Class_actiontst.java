package testngDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Class_actiontst {
	WebDriver web;
	@BeforeSuite
	public void bs() {
	System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");}
	
	@Test
	public void act() {
		
		WebDriver web =new ChromeDriver();
	    web.get("http://demo.guru99.com/test/newtours");
	    WebElement home= web.findElement(By.linkText("Home"));
	    Actions act= new Actions(web);
	    Action moveclick = act.moveToElement(home)
	    		.click()
	    		.build();
	    		moveclick.perform();
	}

}
