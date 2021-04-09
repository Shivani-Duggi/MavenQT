package TestPackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.Color;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageobjects.LoginPage;
import resources.*;

public class QTTestCase extends base {
		
	public void logingeneral(String Username, String Password) throws InterruptedException, IOException {
		
		driver = initializeDriver();
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
		LoginPage l = new LoginPage(driver);
		l.ClickUsername().click();
		Thread.sleep(1000);
		l.ClickUsername().sendKeys(Username);
		l.ClickPassword().click();
		Thread.sleep(1000);
		l.ClickPassword().sendKeys(Password);
		Thread.sleep(1000);
		l.ClickLogin().click();
}

@Test(dataProvider="getData")
public void basePageNavigation(String Username, String Password) throws IOException, InterruptedException{
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
	l.ClickUsername().sendKeys(Username);
	l.ClickPassword().click();
	Thread.sleep(1000);
	l.ClickPassword().sendKeys(Password);
	Thread.sleep(1000);
	l.ClickLogin().click();
	log1.info("Successfully entered username and password");
	
}
	
@DataProvider
public Object[][] getData() throws IOException {
	
	Object[][] data= new Object[2][2];
	 
	//valid credentials
	data[0][0]="shivani.duggi@qualitestgroup.com";
	data[0][1]="P@ssw0rd";
	
	//invalid credentials
	data[1][0]="shivaniduggi@gmail.com";
	data[1][1]="P@ssw0rd";
	
	return data;
}
}


