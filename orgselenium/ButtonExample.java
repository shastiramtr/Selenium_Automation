package orgselenium;

import java.awt.Point;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ButtonExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\GIS00221\\eclipse-workspace\\Selenium work space\\chromedriver\\chromedriver.exe" );
		WebDriver driver =  new ChromeDriver();
		
		driver.get("http://testleaf.herokuapp.com/pages/Button.html");
		//get xy position in the button 
		WebElement getPositionButton =  driver.findElement(By.id("position"));
		
		org.openqa.selenium.Point xypoint= getPositionButton.getLocation();
		int xValue=xypoint.getX();
		int yValue=xypoint.getY();
		System.out.println("x value is:"+xValue+"Y value is :"+yValue);
		
		// Find the color button
		 WebElement colorbutton = driver.findElement(By.id("color"));
		String color =  colorbutton.getCssValue("background-color");
		 System.out.println("Button clor is:"+color);		
		 
		 // Find the size 
		 WebElement sizeButton=driver.findElement(By.id("size"));
		int height =  sizeButton.getSize().getHeight();
		int width = sizeButton.getSize().getWidth();
		System.out.println("Height is :"+ height + "Width is :"+ width);
		
		// go to home
		WebElement homeButton = driver.findElement(By.id("home"));
		homeButton.click();
		
		
		

		
	}

}
