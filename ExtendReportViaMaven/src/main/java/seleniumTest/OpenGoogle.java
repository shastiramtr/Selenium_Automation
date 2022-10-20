package seleniumTest;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;



public class OpenGoogle {

	public static void main(String[] args) {
// dummy html file
		ExtentSparkReporter reporter = new ExtentSparkReporter("./Testreport.html");
		// report
		ExtentReports extentReports = new ExtentReports();
		extentReports.attachReporter(reporter);
		
		ExtentTest test = extentReports.createTest("TC001 - Search Product");
		test.pass("Test Passed"); 
		extentReports.flush();
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\GIS00221\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in");
		driver.findElement(By.name("q")).sendKeys("Whatsup Duck!");
		driver.findElement(By.name("q")).submit();
		
		driver.quit();
		



	}

}
