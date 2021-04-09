package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class activitypage {
	
public WebDriver driver;
	
	By username=By.xpath("//input[@name='username']");
	By password=By.xpath("//input[@name='pass']");
	By login=By.xpath("//button");
	
	public WebElement ClickUsername() {
		return driver.findElement(username);
	}
	
	public WebElement ClickPassword() {
		return driver.findElement(password);
	}
	
	public WebElement ClickLogin() {
		return driver.findElement(login);
	}

}
