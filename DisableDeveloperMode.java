package Samples;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DisableDeveloperMode {
	
	
	WebDriver driver;
	
	public void main() {
		System.setProperty("Webdriver.chrome.driver", "C:\\chromedriver2.20\\chromedriver.exe");
		//driver= new ChromeDriver();
		//Create object of ChromeOptions class
		ChromeOptions options = new ChromeOptions();
		 
		// add parameter which will disable the extension
		options.addArguments("--disable-extensions");
		 
		// Start the chrome session
		 driver = new ChromeDriver(options);
	
	

}}
