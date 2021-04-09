package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class recentcontacts {
	
	 public WebDriver driver;
	 	
	 By recentcontacts=By.xpath("//body/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/h5[1]/small[1]/a[1]/i[1]");
	 
	 By confirmboxes=By.xpath("//body/div[@id='myModal']/div[1]/div[1]/form[1]/div[2]/div[3]/div[1]/div[1]/div[1]");
		
	 By comment=By.xpath("//textarea[@id='comment']");
		
	 By send=By.xpath("//button[@class='btn btn-primary']");
	 
	 public void kudostype(String kudostype) {
			WebElement kt=driver.findElement(By.xpath("//i[contains(text(),'"+kudostype+"')]/ancestor::center"));
			kt.click();
		}
	 
	   public recentcontacts(WebDriver driver) {
	        this.driver=driver;
	    }
	    
	    public WebElement recentcontacts() {
	        return driver.findElement(recentcontacts);
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


