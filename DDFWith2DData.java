package Samples;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Helper.Browserselection;

public class DDFWith2DData extends Browserselection{
	
	WebDriver driver;
	HSSFWorkbook wb;
	HSSFSheet sh1;
	HSSFCell cell;
	
	@Test(dataProvider="testdata")
	public void ddf(String uname, String password) throws Exception {
		
	//	SoftAssert SA=new SoftAssert();
		driver= DDFWith2DData.startbrowser("firefox", "http://the-internet.herokuapp.com/login");
		
		driver.findElement(By.xpath(".//*[@id='username']")).sendKeys(uname);
		driver.findElement(By.xpath(".//*[@id='password']")).sendKeys(password);
		
		driver.findElement(By.xpath(".//*[@id='login']/button")).click();
		
		String url= driver.getCurrentUrl();
		
		String expected= "http://the-internet.herokuapp.com/secure";
Assert.assertEquals(url, expected);
		
		Thread.sleep(2000);
		
		driver.quit();
		
		
	}
	@DataProvider(name="testdata")
	public Object[][] testdataone(){
		
		Object[][]login = new Object[2][2];
		login[0][0]="tomsmith";
		login[0][1]="SuperSecretPassword!";
		
		login[1][0]="New";
		login[1][1]="password";
		return login;
		}
	}
	

	
	

