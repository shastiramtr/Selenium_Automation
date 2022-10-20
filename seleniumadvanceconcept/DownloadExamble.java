package seleniumadvanceconcept;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DownloadExamble {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\\\GIS00221\\eclipse-workspace\\Selenium work space\\chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.leafground.com/drag.xhtml;jsessionid=node01us3bkepkgog3nfgu0ie1tx6l160726.node0");
        
        WebElement downloadlink=driver.findElement(By.linkText(null));
        downloadlink.click();
        
        Thread.sleep(4000);
        // Windows control
        
        File filelocation =new File("C:\\Users\\GIS00221\\Downloads");
        File[] totalfiles= filelocation.listFiles();
        
        for (File file : totalfiles) {
        	
        	if (file.getName().equals("download.xls")) {
        		System.out.println("File is downloaded");
        		break;
				
			}
			
		}
        
        
        
        

	}

}
