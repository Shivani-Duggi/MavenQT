package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	
	public WebDriver driver;
	
	By username=By.xpath("//input[@name='username']");
	By password=By.xpath("//input[@name='pass']");
	By login=By.xpath("//button");
	By titlecolour=By.xpath("/html/body/div[1]");
	By bodycolour=By.xpath("/html/body/div[2]");
	By buttoncolour=By.xpath("/html/body/div[2]/form/button");
	
	
	
	public LoginPage(WebDriver driver) {
		this.driver=driver;
	}
	
	public WebElement ClickUsername() {
		return driver.findElement(username);
	}
	
	public WebElement ClickPassword() {
		return driver.findElement(password);
	}
	
	public WebElement ClickLogin() {
		return driver.findElement(login);
	}
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
	

	
	
	
	
    
	

			
		
		
	


	


