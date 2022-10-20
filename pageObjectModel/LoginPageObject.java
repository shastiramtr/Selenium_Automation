package pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


public class LoginPageObject {
	//Username,Password,Submit
	
	
	@FindBy(how=How.NAME,using="username")
	public static WebElement username;
	
	@FindBy(name="password")
	public static WebElement password;
	
	@FindBy(xpath = "//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")
	public static WebElement submit;
	
	
	
	/*
	 * public static WebElement userName(WebDriver driver) { return
	 * driver.findElement(By.xpath(
	 * "//*[@id='app']/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input"
	 * ));
	 * 
	 * }
	 * 
	 * public static WebElement password(WebDriver driver) { return
	 * driver.findElement(By.xpath(
	 * "//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input"
	 * ));
	 * 
	 * }
	 * 
	 * public static WebElement loginbutton(WebDriver driver) { return
	 * driver.findElement(By.xpath(
	 * "//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button"));
	 * 
	 * }
	 */

}
