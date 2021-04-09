package TestPackage;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

import pageobjects.LoginPage;
import pageobjects.Sendkudos;
import resources.base;


public class sendsinglekudostestcase extends base {
			
		@Test
		public void basePageNavigation() throws IOException, InterruptedException, AWTException{
		 driver=initializeDriver();
		 
		Properties prop=new Properties();
		FileInputStream fis = new FileInputStream("C:\\Selenium projects\\Qualitest\\src\\main\\java\\resources\\data.properties");
		prop.load(fis);
			
		 driver.get(prop.getProperty("url"));
		 log1.info("Successfully opened the application");
		 
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
			
			
			Sendkudos s=new Sendkudos(driver);
			s.clicksendkudos().click();
			s.emailaddress().sendKeys("Chaithra K Chandraiah  (chaithra.chandraiah@qualitestgroup.com)");
			s.emailaddress().click();
			
			Robot r=new Robot();
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyPress(KeyEvent.VK_ENTER);
			Thread.sleep(1000);
			
			s.kudostype("Hard Worker"); //sending one kudos 
			
			s.comment().sendKeys("Well Done");
			s.send().click();
			Thread.sleep(1000);
			log1.info("Kudos successfully sent with citation");
			log1.info("Email sent successfully");
			driver.close();
	}
	}


