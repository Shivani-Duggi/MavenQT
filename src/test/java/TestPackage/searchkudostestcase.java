package TestPackage;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

import pageobjects.LoginPage;
import pageobjects.searchkudos;
import resources.base;

	public class searchkudostestcase extends base {
	    @Test
	    
	    public void searchkudospage() throws IOException, InterruptedException, AWTException {
	        
	    	driver = initializeDriver();
	    	
	    	Properties prop=new Properties();
	    	FileInputStream fis = new FileInputStream("C:\\Selenium projects\\Qualitest\\src\\main\\java\\resources\\data.properties");
	    	prop.load(fis);
	    	
	    	driver.get(prop.getProperty("url"));
	    	log1.info("Successfully opened the application");
	    	
	    	//Verification and login
	    	LoginPage l = new LoginPage(driver);
	    	driver.manage().window().maximize();
	    	l.ClickUsername().click();
	    	Thread.sleep(1000);
	    	l.ClickUsername().sendKeys("shivani.duggi@qualitestgroup.com");
	    	l.ClickPassword().click();
	    	Thread.sleep(1000);
	    	l.ClickPassword().sendKeys("P@ssw0rd");
	    	Thread.sleep(1000);
	    	l.ClickLogin().click();
	    	log1.info("Successfully entered username and password");
	        
	        searchkudos SK = new searchkudos(driver);
	        SK.search().click();
	        Thread.sleep(1000);
	        SK.emailfeild().sendKeys("shivani.duggi");
	        Thread.sleep(1000);
	        Robot R = new Robot();
	        R.keyPress(KeyEvent.VK_DOWN);
	        R.keyPress(KeyEvent.VK_ENTER);
	        R.keyPress(KeyEvent.VK_TAB);
	        R.keyPress(KeyEvent.VK_ENTER);
	        
	        Thread.sleep(1000);
	        
	        SK.searchbutton().click();
	    }
	}
	 
	       
