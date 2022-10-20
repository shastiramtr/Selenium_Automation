package com.gis;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


public class TestcaseloginBaseclass {

	@Test
	public void logintest()

	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("http://dga1app18actdv.swg.cdc.root/activplant_new/default.aspx");
		
		driver.findElement(By.id("txtUsername")).sendKeys("Administrator");

		driver.findElement(By.id("txtPassword")).sendKeys("qwerty");

		driver.findElement(By.id("cmdLogin")).click();

		Assert.assertEquals(driver.getTitle(), "Activplant Platform: Log On");
	} 
		public static void screenshots(String Filename) {
	        	
			TakesScreenshot driver = null;
				File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	        	try {
	        	FileUtils.copyFile(file, new File ("C:\\Users\\GIS00221\\eclipse-workspace\\myprojectmaven\\src\\test\\java\\screenshort\\Screenshorts"+Filename+".jpg"));
	        }
	        catch(IOException e) {
	        	e.printStackTrace();
	        }
		
		//driver.close();

	}

}
