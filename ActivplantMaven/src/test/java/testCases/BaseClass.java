package testCases;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass {
	
	public String baseURL = "http://dga1app18actdv.swg.cdc.root/activplant_new/default.aspx";
    public String username ="Administrator";
    public String password ="qwerty";
    public static WebDriver driver;
    
    public static Logger Logger;
    
    @BeforeClass
    public void setup()
    {
    	System.setProperty("webdriver.edge.driver","C:\\Users\\GIS00221\\eclipse-workspace\\ActivplantMaven\\Drivers\\msedgedriver.exe");
    	driver=new EdgeDriver();
    	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    	Logger = Logger.getLogger("Activplant");
    	PropertyConfigurator.configure("Log4j.properties");
    }
    
    @AfterClass
    public void tearDown()
    {
    	driver.quit();
    }
    
}
