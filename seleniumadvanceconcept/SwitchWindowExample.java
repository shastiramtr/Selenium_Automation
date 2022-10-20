package seleniumadvanceconcept;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchWindowExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\GIS00221\\eclipse-workspace\\Selenium work space\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://testleaf.herokuapp.com/pages/Window.html");
		
		String oldwindow = driver.getWindowHandle();
		
		WebElement Homebutton =driver.findElement(By.xpath("//*[@id='home']"));
		Homebutton.click();
		
	Set<String> handles=driver.getWindowHandles(); 
	
		for (String newwindow : handles) {
			driver.switchTo().window(newwindow);
			
		}
		
		WebElement editbox = driver.findElement(By.xpath("//*[@id=\'post-153\']/div[2]/div/ul/li[1]/a/img"));
		editbox.click();
		
		driver.close();
		
		driver.switchTo().window(oldwindow);
		
		WebElement openmultiplewindows= driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/button"));
		openmultiplewindows.click();
		Thread.sleep(3000);
		
		int numberofwindows=driver.getWindowHandles().size();
		System.out.println("number of windows opented:"+numberofwindows);

		WebElement donotcloseme =driver.findElement(By.xpath("//*[@id=\'color\']"));
		donotcloseme.click();
		Thread.sleep(3000);
		
		Set<String>newwindowhandles=driver.getWindowHandles();
		
		for (String allwindows : newwindowhandles) {
			if(!allwindows.equals(oldwindow)){
				driver.switchTo().window(allwindows);
				driver.close();
				
			}
			
		}
		
		
	}


	}


