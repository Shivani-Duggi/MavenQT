package pageobjects;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class kudosfromme {
	    
	    public WebDriver driver;
	    
	    By kudosfromme = By.xpath("/html/body/div[1]/div[1]/div[1]/div/div[3]/div/h5");
	    
	    public kudosfromme(WebDriver driver) {
	        this.driver=driver;
	    }
	    
	    public WebElement kudosfromme() {
	        return driver.findElement(kudosfromme);
	    }

	}
	 


