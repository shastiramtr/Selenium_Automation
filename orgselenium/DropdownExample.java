package orgselenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\GIS00221\\eclipse-workspace\\Selenium work space\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://testleaf.herokuapp.com/pages/Dropdown.html");
		
		WebElement Firstdropdown = driver.findElement(By.id("dropdown1"));
		Select select = new Select(Firstdropdown);
		select.selectByIndex(4);
        select.selectByValue("2");
		select.selectByVisibleText("Selenium");
		
		List<WebElement> listofoptions =select.getOptions();
		int size = listofoptions.size();
		System.out.println("Number of element:"+size);
		
		Firstdropdown.sendKeys("Loadrunner");
		
		WebElement multiSelect=driver.findElement(By.xpath("//*[@id='contentblock']/section/div[6]/select"));
		Select multiSelectBox = new Select (multiSelect);
		multiSelectBox.selectByIndex(1);
		multiSelectBox.selectByIndex(2);
		multiSelectBox.selectByIndex(3);
	
		
		
		
		

	}

}
