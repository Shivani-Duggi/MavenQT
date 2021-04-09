package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class countofkudos {
	
	public WebDriver driver;
	
	By count=By.xpath("[id='todayCount']");
	
	public WebElement countkudos() {
		return driver.findElement(count);
	}

}
