package com.inetbankingPageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver ldriver;
	
	public LoginPage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
		
	}
	@FindBy(name="uid")
	@CacheLookup
	WebElement txtUsername;
	
	@FindBy(name ="password")
	@CacheLookup
	WebElement txtPassword; 
	
	@FindBy(name = "cmdLogin")
	@CacheLookup
	WebElement cmdLogin;

	public void setPassword(String password) 
	{
		txtUsername.sendKeys("Administrator");
	}

	public void setUserName(String username) 
	{
		txtPassword.sendKeys("qwerty");
		
	}

	public void clickSubmit() 
	{
		cmdLogin.click();
		
	}
		
	}
