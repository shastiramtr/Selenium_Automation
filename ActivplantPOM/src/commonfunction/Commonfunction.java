package commonfunction;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class Commonfunction 

{
	public static WebDriver driver;
	public static Properties properties;
	public Properties loadPropertyFile() throws IOException {

		FileInputStream fileInputStream = new FileInputStream("config.file");
		System.out.println(fileInputStream);
		
		//properties Object
		properties = new Properties();
		properties.load(fileInputStream);
		
		//property file load.return
		return properties;
	}

	@BeforeSuite
	public void launchBrowser() throws IOException {

//		loadPropertyFile();
//		String browser =properties.getProperty("browser");
//		System.out.println(browser);
//		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);	

		/*
		 * String driverlocation = properties.getProperty("driverlocation");
		 * System.out.println(driverlocation);
		 * 
		 * System.setProperty("webdriver.edge.driver", driverlocation); driver = new
		 * EdgeDriver();
		 * 
		 * String url = properties.getProperty("url"); driver.get(url);
		 * driver.manage().window().maximize();
		 */
		
	}
	
	@BeforeMethod
	
	public void MIAdmin() throws IOException {
		loadPropertyFile();
		String browser = properties.getProperty("browser");
		System.out.println(browser);
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);	

	
	String driverlocation = properties.getProperty("driverlocation");
	System.out.println(driverlocation);
	

	System.setProperty("webdriver.edge.driver", driverlocation);
	driver = new EdgeDriver();

	String url = properties.getProperty("url");
	driver.get(url);
	driver.manage().window().maximize();
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}














//   Note ----  {Cross browser}
/*	if(browser.equals("edge"))
{
	System.setProperty("webdriver.edge.driver", "C:\\Users\\GIS00221\\eclipse-workspace\\Activplant\\Edge driver\\msedgedriver.exe");
	driver = new EdgeDriver();
	String url = properties.getProperty("url");
	driver.get(url);
} 
else if( browser.equals("chrome")) 
{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\GIS00221\\eclipse-workspace\\Activplant\\chrome driver\\msedgedriver.exe");
	driver = new ChromeDriver();
	String url = properties.getProperty("url");
	driver.get(url);
} */