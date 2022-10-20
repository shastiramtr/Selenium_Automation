package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SuiteExample {

	//Aim: open chrome and go to 
	//1. google.co.in 2) bing.com and 3. yahoo.comand then close the browser

	
	
	@Test
	public void openGoogle(){
		long starttime = System.currentTimeMillis();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\GIS00221\\eclipse-workspace\\Selenium work space\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");
		driver.quit();
		long endtime = System.currentTimeMillis();
		
		long totaltime = endtime-starttime;
		System.out.println("Total time taken"+totaltime);
		

	}
	
	@Test
	public void openBing() {
		long starttime = System.currentTimeMillis();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\GIS00221\\eclipse-workspace\\Selenium work space\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.bing.com/");
		driver.quit();
		long endtime = System.currentTimeMillis();
		
		long totaltime = endtime-starttime;
		System.out.println("Total time taken"+totaltime);

	}
	@Test
	public void openYahoo() {
		long starttime = System.currentTimeMillis();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\GIS00221\\eclipse-workspace\\Selenium work space\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://in.search.yahoo.com/?fr2=inr");
		driver.quit();
		long endtime = System.currentTimeMillis();
		
		long totaltime = endtime-starttime;
		System.out.println("Total time taken"+totaltime);
		
		

	}


}

//package testNG;

//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.annotations.AfterSuite;
//import org.testng.annotations.BeforeSuite;
//import org.testng.annotations.Test;

//public class SuiteExample {
	//WebDriver driver;
	//long starttime;
	//long endtime;

	//Aim: open chrome and go to 
	//1. google.co.in 2) bing.com and 3. yahoo.comand then close the browser



	//@BeforeSuite
	//public void launchbrowser () {
		// starttime = System.currentTimeMillis();
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\GIS00221\\eclipse-workspace\\Selenium work space\\chromedriver\\chromedriver.exe");
		 //driver = new ChromeDriver();
	//}

	//@Test
	//public void openGoogle(){
		//driver.get("https://www.google.co.in/");
	//}

	//@Test
	//public void openBing() {
		
	//	driver.get("https://www.bing.com/");
//	}
	
	//@Test
	//public void openYahoo() {
		//driver.get("https://in.search.yahoo.com/?fr2=inr");
	//}
	
	//@AfterSuite
	//public void closebrowser() {
		//driver.quit();
	    //endtime = System.currentTimeMillis();
		//long totaltime = endtime-starttime;
		//System.out.println("Total time taken"+totaltime);

	//}

//}

