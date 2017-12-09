package Samples;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import Helper.Browserselection;




public class Open extends Browserselection{

	WebDriver driver;
	
	@Test
public void Login() throws Exception {
		
		driver=Open.startbrowser("Chrome", "http://52.57.40.194/");
		Thread.sleep(2000);
		
		Open.css(driver);
		
		driver.close();
		
		
	}

	

	
		
	}


		
	



	