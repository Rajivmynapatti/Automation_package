package Samples;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import Helper.Browserselection;

public class DataWithPropertyFile  extends Browserselection{
	
	public static WebDriver driver;

	@Test
	public void pf() throws Exception {
		
		 driver=DataWithPropertyFile.startbrowser("firefox", "http://the-internet.herokuapp.com/login");
	
		 //Below 4 line of code is used to intialize and run the Properties file.
		 File file = new File("D:\\OxygenWorkspace\\Automation\\src\\datafile.properties");//to store the property file location
		 
		 FileInputStream fileInput = new FileInputStream(file);//upload the property file
		 Properties prop= new Properties();//creating the object for properties 
		 
		 prop.load(fileInput);//taking the data from property file.

		 driver.findElement(By.id("username")).sendKeys(prop.getProperty("uname"));

		 driver.findElement(By.id("password")).sendKeys(prop.getProperty("pass"));

		 driver.findElement(By.xpath(".//*[@id='login']/button")).click();

	}
	
	@AfterClass
	public void teardown() {
		
		driver.quit();
	}
}


