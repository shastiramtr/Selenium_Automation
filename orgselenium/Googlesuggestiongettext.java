package orgselenium;



import java.util.List;

//import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//import jdk.javadoc.internal.doclets.formats.html.markup.Text;

public class Googlesuggestiongettext {
	// google suggestion print 

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\GIS00221\\eclipse-workspace\\Selenium work space\\chromedriver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.google.co.in/");
		
		WebElement searchbox = driver.findElement(By.name("q"));
		searchbox .sendKeys("great");
		Thread.sleep(5000);
		List<WebElement> searchsuggestion =
		driver.findElements(By.xpath("//ul[@role='listbox']//following::li"));
		
		for (WebElement WebElement : searchsuggestion){
		String text = WebElement .getText();
			System.out.println(text);
			if(text.contains("Learning")) {
				WebElement.click();
				break;
			}
			
		
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		//System.out.println(searchsuggestion.size());
		
		/*
		 * for (WebElement webElement : searchsuggestion) { 
		 * String name = webElement.getText();
		 *  System.out.println(name); }
		 */
		
		//searchsuggestion.getText();
		
		/*
		 * for (WebElement WebElement : searchsuggestion){ String Name =
		 * WebElement.getText(); System.out.println(WebElement.getText());
		 */
		
		
		
		}
		
		
	}

}
