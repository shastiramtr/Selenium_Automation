package seleniumadvanceconcept;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoCompeteExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\\\GIS00221\\eclipse-workspace\\Selenium work space\\chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.leafground.com/drag.xhtml;jsessionid=node01us3bkepkgog3nfgu0ie1tx6l160726.node0");
        
        WebElement input=driver.findElement(By.id(null));
        input.sendKeys("shasti");
        Thread.sleep(4000);
        List<WebElement> optionsList=driver.findElements(By.xpath(null));
        
        System.out.println(optionsList.size());
        
        for (WebElement webelement : optionsList) {
        	
        	if (webelement.getText().equals("Selenium")) {
        		webelement.click();
        		System.out.println("If Part");
        		break;
        	}else 
        		System.out.println("else part");
        	
        }

	}

}
