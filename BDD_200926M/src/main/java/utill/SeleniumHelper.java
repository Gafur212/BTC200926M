package utill;

import org.openqa.selenium.WebElement;

public class SeleniumHelper {

	public static void type(WebElement ele,String text) {
		ele.sendKeys(text);
	}
	public static void click(WebElement ele) {
		ele.click();
	}
}
