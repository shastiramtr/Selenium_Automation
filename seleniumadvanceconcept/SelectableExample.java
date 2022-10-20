package seleniumadvanceconcept;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SelectableExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\\\GIS00221\\eclipse-workspace\\Selenium work space\\chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.leafground.com/drag.xhtml;jsessionid=node01us3bkepkgog3nfgu0ie1tx6l160726.node0");
        
        
      List  <WebElement> Selectable = driver.findElements(By.xpath(null));
      
      int listsize=Selectable.size();
      System.out.println(listsize);
      
      Actions actions = new Actions(driver);
      actions.keyDown(Keys.CONTROL)
      .click(Selectable.get(0))
      .click(Selectable.get(1))
      .click(Selectable.get(2)).build().perform();
      // Example
      Actions actions1 = new Actions(driver);
      actions1.clickAndHold(Selectable.get(0));
      actions1.clickAndHold(Selectable.get(1));
      actions1.clickAndHold(Selectable.get(2));
      actions1.build().perform();
      
      
        

	}

}
