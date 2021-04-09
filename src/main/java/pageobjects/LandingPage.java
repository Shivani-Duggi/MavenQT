package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {
	
	public WebDriver driver;
	
	By username=By.xpath("//body/div[2]/form[1]/input[1]");
	
	public LandingPage(WebDriver driver) {
		this.driver=driver;
	}
	
	public WebElement ClickUsername() {
		return driver.findElement(username);
	}

}
