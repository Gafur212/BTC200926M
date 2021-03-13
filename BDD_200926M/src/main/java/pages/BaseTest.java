package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest {

	WebDriver dr;
	public void openBrowser(String b) {
		 if(b.equals("chrome")) {
			 System.setProperty("","");
			 dr=new ChromeDriver();
		   }else  if(b.equals("firefox")) {
			   dr=new FirefoxDriver();
		   }
	}
	public HomePage gotoURL() {
		 dr.get("http://www.facebook.com");
		 return new HomePage(dr);
	}
}
