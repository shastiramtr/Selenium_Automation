package seleniumadvanceconcept;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HyperLinkExtendedExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\\\GIS00221\\eclipse-workspace\\Selenium work space\\chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("http://testleaf.herokuapp.com/pages/Link.html");
        
        WebElement Homepagelink=driver.findElement(By.linkText("Go to Home Page"));
        Homepagelink.click();
        
        driver.navigate().back();
        
        WebElement wheretogo= driver.findElement(By.partialLinkText("Find where"));
       String where=  wheretogo.getAttribute("href");
       System.out.println("This link is going to"+where);
       
       WebElement brockenlink=driver.findElement(By.linkText("Verify am I broken?"));
       brockenlink.click();
       
       String title=driver.getTitle();
       
       if(title.contains("404")) {
    	   System.out.println("Link is Brocken");
       }
       
       driver.navigate().back();
       WebElement homepagelink=driver.findElement(By.linkText("Go to Home Page"));
       homepagelink.click();
       
       driver.navigate().back();
       
      List<WebElement> totalLinks=  driver.findElements(By.tagName("a"));
      int linkcount=totalLinks.size();
      
      System.out.println("totalLinks"+linkcount);
      
      
      
      
       
       
       
       
       
       
       
       
       
       
        

	}

}
