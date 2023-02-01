package com.pom.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.pom.qa.base.TestBase;

public class LoginPage extends TestBase{
	
	//Page Factory - Object Repositories;
	@FindBy(name = "username")
	WebElement username;
	
	@FindBy(name = "password")
	WebElement password;
	
	@FindBy(xpath = "xpath")
	WebElement loginButton;
	
	@FindBy(xpath = "xpath")
	WebElement logo;
	
	//Initialization of Page Factory
	public LoginPage() {
		PageFactory.initElements(driver, this); //initializing page factory(elements) using initElements method
	}
	
	//Actions available on Login Page
	public String validateLoginPageTitle() {
		return driver.getTitle();
	}
	
	public boolean validateLogo() {
		return logo.isDisplayed();
	}
	
	public HomePage login(String un, String pwd) {
		username.sendKeys(un);
		password.sendKeys(pwd);
		loginButton.click();
		
		return new HomePage();
	}
	

}
