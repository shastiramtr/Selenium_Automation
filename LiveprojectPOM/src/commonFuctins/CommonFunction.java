package commonFuctins;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class CommonFunction {
	
	 public static Properties properties=null;
	 public static WebDriver driver = null;
	
	public Properties loadPropertyFile() throws IOException {
		
		FileInputStream fileInputStream = new FileInputStream("Config.properties");
		Properties properties = new Properties();
			properties.load(fileInputStream);
		//property file load.return
			return properties;
			
	}

	@BeforeSuite
	public void lanchBrowser() throws IOException {
		loadPropertyFile();
		
		String browser = properties.getProperty("browser");
		String url = properties.getProperty("url");
		String driverLocation = properties.getProperty("DriverLocation");
		
		if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", driverLocation);
			driver=new ChromeDriver();
			
		}else if (browser.equalsIgnoreCase("fireFox")) {
			System.setProperty("webdriver.gecko.driver", driverLocation);
			driver = new FirefoxDriver();
		}
		
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		}
	@AfterSuite
	public void tearDown() {
		//river.quit();
		
	}
	}

