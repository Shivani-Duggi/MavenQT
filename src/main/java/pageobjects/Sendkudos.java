package pageobjects;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Sendkudos {
	
	public WebDriver driver;
	
	By clicksendkudos=By.xpath("//a[@href='#myModal']");
	
	By emailaddress=By.xpath("//input[@id='email_address']");
	
	By confirmboxes=By.xpath("//body/div[@id='myModal']/div[1]/div[1]/form[1]/div[2]/div[3]/div[1]/div[1]/div[1]");
	
	By comment=By.xpath("//textarea[@id='comment']");
	
	By send=By.xpath("//button[@class='btn btn-primary']");
	
	public void kudostype(String kudostype) {
		WebElement kt=driver.findElement(By.xpath("//i[contains(text(),'"+kudostype+"')]/ancestor::center"));
		kt.click();
	}
	
	public Sendkudos(WebDriver driver) {
		this.driver=driver;
	}
	
	public WebElement clicksendkudos() {
		return driver.findElement(clicksendkudos);
	}

	public WebElement emailaddress() {
		return driver.findElement(emailaddress);
	}
	
	public WebElement confirmboxes() {
		return driver.findElement(confirmboxes);
	}
	
	public WebElement comment() {
		return driver.findElement(comment);
	}
	
	public WebElement send() {
		return driver.findElement(send);
	}
	
	
	
}


