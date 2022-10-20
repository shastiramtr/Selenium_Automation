package orgselenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertExamble {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\GIS00221\\\\eclipse-workspace\\\\Selenium work space\\\\chromedriver\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://testleaf.herokuapp.com/pages/Alert.html");
		
		WebElement alertBox = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[1]/div/div/button"));
		alertBox.click();
		
		Alert alert = driver.switchTo().alert();
		Thread.sleep(3000);
		alert.accept();
		
		WebElement ConfirmButton = driver.findElement(By.xpath("//*[@id='contentblock']/section/div[2]/div/div/button"));
		ConfirmButton.click();
		
		Alert confirmalert = driver.switchTo().alert();
		Thread.sleep(3000);
		confirmalert.dismiss();
	    
	    WebElement promptBox = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[3]/div/div/button"));
	    promptBox.click();
	    
	    Alert promptAlert = driver.switchTo().alert();
	    Thread.sleep(3000);
	    promptAlert.sendKeys("Duckling");
	    Thread.sleep(3000);
	    promptAlert.accept();
	    
		
		 
		

	}

}
