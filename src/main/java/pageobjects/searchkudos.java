package pageobjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class searchkudos {
	    
	    public WebDriver driver;
	    
	    By search = By.xpath("/html/body/div[1]/div[1]/div[1]/div/div[5]/div/h5/a/span");
	    By emailfeild = By.xpath("//input[@id='s_e_add']");
	    By searchbutton = By.xpath("//*[@id=\"search_panel\"]/button");
	    
	    public searchkudos(WebDriver driver) {
	        this.driver=driver;
	    }
	    
	    public WebElement search() {
	        return driver.findElement(search);
	    }
	    
	    public WebElement emailfeild() {
	        return driver.findElement(emailfeild);
	    }
	    
	    public WebElement searchbutton() {
	        return driver.findElement(searchbutton);
	    }
	}


