package Samples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;


import org.testng.asserts.SoftAssert;

import Helper.Browserselection;

public class ToolTipText extends Browserselection {
	
	WebDriver driver;

	public void TTT() throws Exception {
		
		driver=ToolTipText.startbrowser("firefox", "http://learn-automation.com/how-to-capture-tooltip-in-selenium-webdriver/");
		
		
		SoftAssert SoftAssertion= new SoftAssert();
		WebElement social= driver.findElement(By.xpath(".//*[@id='social-profile-icons-2']/div/ul/li[2]/a"));
		//((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", social);
		
		
		Actions builder = new Actions (driver);				
		
		builder.moveToElement(social).build().perform();
       	
		String tttext=social.getAttribute("title");
		
		String Expectedtitle="Google+";
		SoftAssertion.assertEquals(tttext, Expectedtitle);
		SoftAssertion.assertAll();
		System.out.println("The tooltip text of the inspected element is "+ tttext);
		/*
		if(Expectedtitle.equals(tttext)) {
			System.out.println("Title matched.");
		}
		else{
			System.out.println("Title do not matched.");
		}*/
				
	
		driver.quit();
	}

}
