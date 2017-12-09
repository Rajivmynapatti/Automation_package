package Samples;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Log4j {

		private static WebDriver driver;

		private static Logger Log = Logger.getLogger(Log4j.class.getName());

		public static void main(String[] args) throws Exception {

			//Need to be very carefull with this line also.
			DOMConfigurator.configure("log4j.xml");

			// Create a new instance of the Firefox driver

	        driver = new FirefoxDriver();

	        Log.info("New driver instantiated");

	        //Put a Implicit wait, this means that any search for elements on the page could take the time the implicit wait is set for before throwing exception
	        driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	        Log.info("Implicit wait applied on the driver for 10 seconds");

	        //Launch the Online Store Website

	        driver.get("http://the-internet.herokuapp.com/login");

	        Log.info("Web application launched");

	        // Find the element that's ID attribute is 'account'(My Account)

	        driver.findElement(By.xpath(".//*[@id='username']")).sendKeys("tomsmith");

	        Log.info("Username is entered");

	        // Find the element that's ID attribute is 'log' (Username)

	        // Enter Username on the element found by above desc.

	        driver.findElement(By.xpath(".//*[@id='password']")).sendKeys("SuperSecretPassword!");

	        Log.info("Password entered in the Password text box");

	       

	     driver.findElement(By.xpath(".//*[@id='login']/button")).click();

	        Log.info("Click action performed on Submit button");

	        // Print a Log In message to the screen

	        System.out.println(" Login Successfully, now it is the time to Log Off buddy.");

Thread.sleep(2000);
	        driver.quit();

	        Log.info("Browser closed");

		}

}
