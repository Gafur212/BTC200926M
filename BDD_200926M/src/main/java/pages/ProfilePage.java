package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProfilePage {

WebDriver dr;
	
	@FindBy(xpath="whatever xpath") WebElement userBox;
	@FindBy(xpath="whatever xpath") WebElement passBox;
	@FindBy(xpath="whatever xpath") WebElement loginbutton;
	public ProfilePage(WebDriver x) {
		dr=x;
		PageFactory.initElements(dr, this);
	}
	public void verifyProfilePage() {
		 if(dr.findElement(By.id("signout")).isDisplayed()) {
		    	System.out.println("i am in profile page");
		    }else
		    	System.out.println("not in profile page");
	}
}
