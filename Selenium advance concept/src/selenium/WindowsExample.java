package selenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class WindowsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("wedriver.chrome.driver", "C:\\Users\\GIS00221\\eclipse-workspace\\Selenium advance concept\\driver Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		String oldwindow = driver.getWindowHandle();
		
		WebElement Homebutton =driver.findElement(By.id("home"));
		Homebutton.click();
		
	Set<String> handles=driver.getWindowHandles(); 
	
		for (String newwindow : handles) {
			driver.switchTo().window(newwindow);
			
		}
		
		WebElement editbox = driver.findElement(By.xpath("//*[@id=\'post-153\']/div[2]/div/ul/li[1]/a/img"));
		editbox.click();

	}

}
