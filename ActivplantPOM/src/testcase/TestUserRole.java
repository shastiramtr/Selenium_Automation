package testcase;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonfunction.Commonfunction;
import pageObject.LoginPageObjectModel;

public class TestUserRole extends Commonfunction {

	@Test
	public void MILogin() {
		PageFactory.initElements(driver,LoginPageObjectModel.class);
		LoginPageObjectModel.Username.sendKeys(properties.getProperty("username"));
		LoginPageObjectModel.Password.sendKeys(properties.getProperty("password"));
		LoginPageObjectModel.LoginButton.click();
		String text = LoginPageObjectModel.LoginText.getText();
		System.out.println(text);
	}
	
	@Test 
	public void ManualDataEntry() {
		PageFactory.initElements(driver,LoginPageObjectModel.class);
		LoginPageObjectModel.ManualDataEntry.click();
		LoginPageObjectModel.Username.sendKeys(properties.getProperty("username"));
		LoginPageObjectModel.Password.sendKeys(properties.getProperty("password"));
		LoginPageObjectModel.LoginButton.click();
		String text = LoginPageObjectModel.LoginText.getText();
		System.out.println(text);
		}
	
	@Test
	public void ReportViewer() {
		PageFactory.initElements(driver, LoginPageObjectModel.class);
		LoginPageObjectModel.ReportViewer.click();
		LoginPageObjectModel.Username.sendKeys(properties.getProperty("username"));
		LoginPageObjectModel.Password.sendKeys(properties.getProperty("password"));
		LoginPageObjectModel.LoginButton.click();	
		String text = LoginPageObjectModel.LoginText.getText();
		System.out.println(text);
	    }
	
	@Test
	public void RootCase() {
		PageFactory.initElements(driver, LoginPageObjectModel.class);
		LoginPageObjectModel.RootCase.click();
		LoginPageObjectModel.Username.sendKeys(properties.getProperty("username"));
		LoginPageObjectModel.Password.sendKeys(properties.getProperty("password"));
		LoginPageObjectModel.LoginButton.click();	
		String text = LoginPageObjectModel.LoginText.getText();
		System.out.println(text);
	    }	
	
}