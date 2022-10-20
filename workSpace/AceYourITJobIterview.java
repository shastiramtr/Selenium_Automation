package workSpace;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AceYourITJobIterview {

	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\GIS00221\\eclipse-workspace\\Selenium work space\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.greatinnovus.com/ace-your-it-job-interview.html?utm_source=Linkedin&utm_medium=socialmedia&utm_campaign=Ace+your+IT+job+interview");
		
		Thread.sleep(4000);
		
		WebElement Name = driver.findElement(By.name("entry.1901127837"));
		Name.sendKeys("T.R Shastiram");
		
		WebElement Phonenumber = driver.findElement(By.name("entry.499201361"));
		Phonenumber.sendKeys("7373979701");
		
		WebElement Emailid = driver.findElement(By.name("entry.1755543207"));
		Emailid.sendKeys("shastiram.t@greatinnovus.com");
		
		WebElement referencedropdown = driver.findElement(By.name("entry.1201895821"));
		Select select = new Select (referencedropdown);
		select.selectByVisibleText("Employee");
		
		List<WebElement>listofoptions = select.getOptions();
		int size = listofoptions.size();
		System.out.println("Number of Elements"+size);
		
		WebElement CollegeName = driver.findElement(By.name("entry.23483025"));
		CollegeName.sendKeys("KLNCE");
		
		WebElement ResidentialCity = driver.findElement(By.name("entry.1071770594"));
		ResidentialCity.sendKeys("Madurai");
		
		Thread.sleep(4000);
		
		WebElement Uploadresumebutton = driver.findElement(By.xpath("//*[@id=\"Display1576902170\"]"));
		Uploadresumebutton.click();
		
		Thread.sleep(4000);
		
		WebElement browsefile = driver.findElement(By.xpath("/html/body/div[4]/div[2]/div/div[2]/div[1]/button"));
		browsefile.click();
		
		// Windows Control 
		//"C:\Users\GIS00221\Downloads\Shastiram T.R QA.pdf"
		
		String file = "C:\\Users\\GIS00221\\DownloadsShastiram T.R QA.pdf";
		
		StringSelection selection = new StringSelection (file);
		
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);
		
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		
		Thread.sleep(4000);
		
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
		
		
		
		

	}

}
