package seleniumadvanceconcept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\GIS00221\\eclipse-workspace\\Selenium work space\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/drag.xhtml;jsessionid=node01us3bkepkgog3nfgu0ie1tx6l160726.node0");
		
		WebElement from = driver.findElement(By.id("form:drag"));
		WebElement to = driver.findElement(By.id("form:drop"));
		
		Actions actions = new Actions(driver);
		//actions.clickAndHold(from).moveToElement(to).release(to).build().perform();
		actions.dragAndDrop(from, to).build().perform();

	}

}
