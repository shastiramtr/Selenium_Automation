package orgselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\GIS00221\\eclipse-workspace\\Selenium work space\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://testleaf.herokuapp.com/pages/checkbox.html");
		
		WebElement Firstcheckbox= driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[1]/input[1]"));
		Firstcheckbox.click();
		
		WebElement Seleniumcheckbox =driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/input"));
		boolean selected = Seleniumcheckbox.isSelected ();
		System.out.println(selected);
		
		WebElement firstelement=driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[3]/input[1]"));
		if(firstelement.isSelected()) {
			firstelement.click();
		}
		WebElement secondelement = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[3]/input[2]"));
		if (secondelement.isSelected()) {
			secondelement.click();
			 
		}

		
		

	}

}
