package pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Class_test {
      WebDriver driver;
      @BeforeSuite
      public void driverset() {
    	  System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
    	  driver=new ChromeDriver();
    	  driver.get("https://www.facebook.com/");
    	  driver.manage().window().maximize();
      }
      @Test
      public void loginpage() {
    	  Class_login web = PageFactory.initElements(driver, Class_login.class);
    	  web.loginid("thn","mzhi");
    	  
      }
}
