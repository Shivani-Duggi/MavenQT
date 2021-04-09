package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class colors {
	
	public WebDriver driver;
	
	By titlecolour=By.xpath("/html/body/div[1]");
	By bodycolour=By.xpath("/html/body/div[2]");
	By buttoncolour=By.xpath("/html/body/div[2]/form/button");

	public WebElement TitleColour() {
		return driver.findElement(titlecolour);


	}
	public WebElement BodyColour() {
		return driver.findElement(bodycolour);

	}
	public WebElement ButtonColour() {
		return driver.findElement(buttoncolour);
	}

}
