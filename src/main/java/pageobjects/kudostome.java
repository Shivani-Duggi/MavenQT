package pageobjects;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class kudostome {
	    
	    public WebDriver driver;
	    
	    By kudostome = By.xpath("/html/body/div[1]/div[1]/div[1]/div/div[4]/div/h5");
	    
	    
	    public kudostome(WebDriver driver) {
	        this.driver=driver;
	    }
	    
	    
	    public WebElement kudostome() {
	        return driver.findElement(kudostome);
	    }
	    
	    

	 

	}
	 

