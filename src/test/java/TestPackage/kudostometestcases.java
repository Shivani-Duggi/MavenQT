package TestPackage;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

import pageobjects.LoginPage;
import pageobjects.kudostome;
import resources.base;

	public class kudostometestcases extends base{
	    
	    @Test
	    
	    public void kudostomenavigationpage() throws IOException, InterruptedException {
	    	
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
	    	    
	        kudostome km = new kudostome(driver);
	        
	        km.kudostome().click();
	        log1.info("displaying kudos to me");
	    }
	   
	}
	 

