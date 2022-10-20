package pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPageObjectModel {
	
	// MI Admin
	@FindBy(id = "txtUsername")
	public static WebElement Username ;
	
	@FindBy(id = "txtPassword")
	public static WebElement Password;
	
	@FindBy(id = "cmdLogin")
	public static WebElement LoginButton;
	
	//Login Text
	@FindBy (id = "tdText")
	public static WebElement LoginText;
	
	// ManualDataEntry
	@FindBy(xpath = "//*[@id=\'lstProfile\']//option[2]")
	public static WebElement ManualDataEntry;
	
	//ReportViewer
	@FindBy (xpath = "//*[@id=\'lstProfile\']//option[3]")
	public static WebElement ReportViewer;
	
	//RootCase
	@FindBy (xpath = "//*[@id=\'lstProfile\']//option[4]")
	public static WebElement RootCase;

}
