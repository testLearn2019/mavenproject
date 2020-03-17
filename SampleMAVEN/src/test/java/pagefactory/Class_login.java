package pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Class_login {
	WebDriver driver;
	 @FindBy(id="name")
	 WebElement login;
	 
	 @FindBy(id="pass")
	 WebElement password;
	  
	 @FindBy(how=How.XPATH, using="//input[@ value ='Log In']")
	 WebElement loginbutton;
	  
	  public Class_login(WebDriver driver) {
		  this .driver= driver;
	  }
	 

public void loginid(String  log,String pass) {
		 login.sendKeys(log);
		 password.sendKeys(pass);
		 loginbutton.click();
		 
	 } 
	 

}
