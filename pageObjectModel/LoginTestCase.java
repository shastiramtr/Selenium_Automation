package pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class LoginTestCase {

	/*
	 * public static void main(String[] args) throws InterruptedException { // TODO
	 * Auto-generated method stub
	 */	
	@Test
	public void login() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\\\GIS00221\\eclipse-workspace\\Selenium work space\\chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        Thread.sleep(3000);
        
        PageFactory.initElements(driver, LoginPageObject.class);
        
        
        LoginPageObject.username.sendKeys("Admin");
        LoginPageObject.password.sendKeys("admin123");
        LoginPageObject.submit.click();
        
        
        
		/* LoginPageObject loginpageobject = new LoginPageObject(); */
		/*
		 * LoginPageObject.userName(driver).sendKeys("Admin");
		 * LoginPageObject.password(driver).sendKeys("admin123");
		 * LoginPageObject.loginbutton(driver).click();
		 */
        	
        	
        	
        	
        	
        	
        	
        	
        
           
        
			
            
            
            
            
            
            
            
            
            
            /*
			 * WebElement username = driver.findElement(By.xpath(
			 * "//*[@id='app']/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input"
			 * )); username.sendKeys("Admin");
			 * 
			 * WebElement password = driver.findElement(By.xpath(
			 * "//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input"
			 * )); password .sendKeys("admin123");
			 * 
			 * WebElement loginButton = driver.findElement(By.xpath(
			 * "//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button"));
			 * loginButton.click();
			 */
        
  
        
        
        

	}

}
