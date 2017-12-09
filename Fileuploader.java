package Samples;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import Helper.Browserselection;

public class Fileuploader extends Browserselection{
	WebDriver driver;
	@Test
	public void testing() throws Exception {
		
		driver=Fileuploader.startbrowser("Firefox", "https://beta.vendorsdepot.com/login/buyer");
		File file= new File("D:\\OxygenWorkspace\\Automation\\src\\Samples\\Fileupload.properties");
		
		FileInputStream fis= new FileInputStream(file);
		
		Properties prop= new Properties();
		prop.load(fis);
		
		
		driver.findElement(By.xpath(".//*[@id='email']")).sendKeys(prop.getProperty("username"));
		
		driver.findElement(By.xpath(".//*[@id='password']")).sendKeys(prop.getProperty("password"));
		
		driver.findElement(By.xpath(".//*[@id='signInForm']/div[5]/button")).click();
		
		Thread.sleep(1000);
		
	WebElement Dashboard=	driver.findElement(By.xpath("html/body/header/div[2]/div[2]/div[3]/ul/li[1]/a"));
	Actions a= new Actions(driver);	
	
	a.moveToElement(Dashboard).build().perform();
	
	driver.findElement(By.xpath("html/body/header/div[2]/div[2]/div[3]/ul/li[1]/ul/li[6]/ul/li[2]/a")).click();
	
	Thread.sleep(1000);

	driver.findElement(By.xpath(".//*[@id='myDropPip']")).click();
	
	Thread.sleep(1000);
	
	/*While in autoit i  have used "ControlSetText(“File Upload”,””,”Edit1″,$CmdLine[1])", the cmdline[1] will tells us how many array
	of images we are uploading. i.e, Cmdline[2] for 2 images, Cmdline[3] for 3 images.*/
	
//upload for very first time in first box
	Runtime.getRuntime().exec("C:\\Users\\indianic\\Desktop\\VDForMultiple.exe" +" "+"C:\\Users\\indianic\\Desktop\\RECEIPT.pdf"  );
	
	Thread.sleep(2000);
	driver.findElement(By.xpath(".//*[@id='myDropPip']")).click();
	//upload for second time in first box itself.
	Runtime.getRuntime().exec("C:\\Users\\indianic\\Desktop\\VDForMultiple.exe"+" "+"C:\\Users\\indianic\\Desktop\\RECEIPT.pdf");
	
	
	
	driver.findElement(By.xpath(".//*[@id='myDropFloorPlan']")).click();
	Runtime.getRuntime().exec("C:\\Users\\indianic\\Desktop\\VDForMultiple.exe" +" "+"C:\\Users\\indianic\\Desktop\\RECEIPT.pdf"  );
	
	Thread.sleep(2000);
	
	driver.findElement(By.xpath(".//*[@id='myDropFloorPlan']")).click();
	Runtime.getRuntime().exec("C:\\Users\\indianic\\Desktop\\VDForMultiple.exe" +" "+"C:\\Users\\indianic\\Desktop\\RECEIPT.pdf"  );
	
	Thread.sleep(2000);
	
	
	driver.findElement(By.xpath(".//*[@id='myDropImages']")).click();
	Runtime.getRuntime().exec("C:\\Users\\indianic\\Desktop\\VDForMultiple.exe" +" "+"C:\\Users\\Public\\Pictures\\Sample Pictures\\Desert Landscape.jpg"  );
	
	Thread.sleep(2000);
	
	driver.findElement(By.xpath(".//*[@id='myDropImages']")).click();
	Runtime.getRuntime().exec("C:\\Users\\indianic\\Desktop\\VDForMultiple.exe" +" "+"C:\\Users\\Public\\Pictures\\Sample Pictures\\Desert Landscape.jpg"  );

	}

}
