package seleniumadvanceconcept;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadFileExamble {

	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\\\GIS00221\\eclipse-workspace\\Selenium work space\\chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.leafground.com/drag.xhtml;jsessionid=node01us3bkepkgog3nfgu0ie1tx6l160726.node0");
        
        WebElement uploadbutton =driver.findElement(By.name(null));
        uploadbutton.click();
        
     // Windows controls begins here
        
        
        
        
        
        
        
        
        
        
        
        
        Thread.sleep(3000);
        String file = "c:\\Users\\download.xls";
        
        StringSelection selection = new StringSelection(file);
        
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);
        
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(3000);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        
        
        
        
        

	}

}
