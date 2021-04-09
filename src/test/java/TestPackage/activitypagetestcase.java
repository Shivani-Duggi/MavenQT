package TestPackage;


import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import pageobjects.LoginPage;
import resources.base;

public class activitypagetestcase extends base {
	
	
    @Test
    public void activitynavigationpage() throws IOException, InterruptedException
    {
    	driver = initializeDriver();
    	
    	Properties prop=new Properties();
    	FileInputStream fis = new FileInputStream("C:\\Selenium projects\\Qualitest\\src\\main\\java\\resources\\data.properties");
    	prop.load(fis);
    	
    	driver.get(prop.getProperty("url"));
    	log1.info("Successfully opened the application");
        
    	LoginPage l = new LoginPage(driver);
		l.ClickUsername().click();
		Thread.sleep(1000);
		l.ClickUsername().sendKeys("shivani.duggi@qualitestgroup.com");
		l.ClickPassword().click();
		Thread.sleep(1000);
		l.ClickPassword().sendKeys("P@ssw0rd");
		Thread.sleep(1000);
		l.ClickLogin().click();
		log1.info("Successfully entered username and password");
		
        //To verify if the user name is displayed on the left side of the screen after logging in 
		
        WebElement ele = driver.findElement(By.xpath("//div[@class='media']"));
        Point loc = ele.getLocation();
        int x = loc.getX();
        System.out.println(+x);
        int y=loc.getY();
        System.out.println(+y);
         
        if(x<=450 && y<=200)
        {
            System.out.println("username is in the Left side of the screen");
            log1.info("Username is visible in left side of the screen ");
        }
        else
        {
            System.out.println("username is not in the Left side of the screen");
        }
    }
}
 