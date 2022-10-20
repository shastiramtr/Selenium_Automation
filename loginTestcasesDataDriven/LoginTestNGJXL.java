package loginTestcasesDataDriven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;


public class LoginTestNGJXL 
{
	WebDriver driver;
	String [][] data = null;
	
	
	/*{"Admin1","admin"},
	{"Admin1","dummy"},
	{"Admin","admin"},
	{"Admin","admin123"}
	};*/
	
	
	@DataProvider( name="loginData")
	public String[][]  loginDataProvider() throws BiffException, IOException {
		data = getexcelData();
		return data;
	}
	
	public String[][] getexcelData() throws BiffException, IOException{
		
		FileInputStream excel = new FileInputStream("C:\\Users\\GIS00221\\Documents\\LoginPageTestCases.xls");
		
		Workbook workbook = Workbook.getWorkbook(excel);
		
		Sheet sheet = workbook .getSheet(0);
		
	int rowCount =	sheet.getRows();
	int columnCount = sheet.getColumns();
	
	String testData[] []= new String [rowCount -1] [columnCount ];
	//forLoop
	for(int i=1;i<rowCount;i++) {
		for(int j=0;j<columnCount;j++) {
			testData [i-1][j] = sheet.getCell(j , i).getContents();
			
			
		}
	}
		return testData;
		
	}
	@BeforeTest
	public void beforeTest() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\GIS00221\\eclipse-workspace\\Selenium work space\\chromedriver\\chromedriver.exe");
		 driver = new ChromeDriver();
	}
	@AfterTest
	 public void afterTest() {
		 driver.quit(); 
	 }
	
	@Test(dataProvider = "loginData")
	
	public void loginwithBothCorrect(String uname, String pword) throws InterruptedException {
		
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		Thread.sleep(3000);
		WebElement username = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input[1]"));
	    username.sendKeys(uname);
	    Thread.sleep(2000);
	    WebElement password = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input"));
	    password.sendKeys(pword);
	    
	    WebElement loginbutton = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button"));
	    loginbutton.click();
	    
	  
	}    

}
