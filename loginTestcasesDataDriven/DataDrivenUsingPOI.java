package loginTestcasesDataDriven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DataDrivenUsingPOI {
	
	
	static List<String> userNameList = new ArrayList<String>();
	static List<String> passwordList = new ArrayList<String>();
	

	public void readExcel() throws IOException {
		
		//File creation 
		FileInputStream excel = new FileInputStream("C:\\Users\\GIS00221\\Documents\\LoginTestCases Apache POI.xlsx");
		// Workbook create 
		Workbook workbook = new XSSFWorkbook(excel);
		//Excel Sheet find
		Sheet sheet = workbook.getSheetAt(0);
		//Row count row select
		Iterator<Row> rowIterator = sheet.iterator();
		//while loop
		  while (rowIterator.hasNext()) {
			Row rowValue =   rowIterator.next();
			  
			  
		 Iterator<Cell> columnIterator = rowValue.iterator();
		 int i=2;
		 
		 while(columnIterator.hasNext()) {
			 if(i%2==0) {
				 userNameList.add (columnIterator.next().getStringCellValue());
				 }
			 else {
				  passwordList.add(columnIterator.next().getStringCellValue());
				 
			 }
			 i++;
				/*
				 * Cell cellValue = columnIterator.next(); System.out.println(cellValue);
				 */
			
			
		 }
			  
		  }	
	}
	
	public void login(String uname, String pword) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\GIS00221\\eclipse-workspace\\Selenium work space\\chromedriver\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		
		
driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		Thread.sleep(3000);
		WebElement username = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input[1]"));
	    username.sendKeys(uname);
	    Thread.sleep(2000);
	    WebElement password = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input"));
	    password.sendKeys(pword);
	    
	    WebElement loginbutton = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button"));
	    loginbutton.click();
	    
	    driver.quit();
	    
	}
	
	public void executeTest() throws InterruptedException {
		
		for(int i =0 ; i<userNameList.size(); i++) {
			login(userNameList.get(i),passwordList.get(i));
		}
	}
	
	
	public static void main (String[] args) throws IOException, InterruptedException {
		
		DataDrivenUsingPOI usingPOI = new DataDrivenUsingPOI();
		usingPOI.readExcel();
		System.out.println("userNameList"+ userNameList );
		System.out.println("passwordList"+ passwordList );
		usingPOI.executeTest();
	}
}
