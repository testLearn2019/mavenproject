package sampleprgmaven;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class Class_maven1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./Drivers./chromedriver.exe");
		WebDriver mav =new ChromeDriver();
		mav.get("https://www.facebook.com/");
        mav.manage().window().maximize();
        Screen s =new Screen();
        Pattern p =new Pattern("C:\\Users\\mozhi\\OneDrive\\Documents\\finalworkspace\\SampleMAVEN\\sikuliimage\\Capture1.JPG");
        try {
			s.click(p);
		} catch (FindFailed e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
