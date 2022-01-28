package com.salesforce.login;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * @author Taha Zahid
 *	This class will store all locators and methods of login page
 */

public class loginPage_Parameter {
	
	WebDriver driver;
	
	By username = By.id("username");
	By password = By.name("pw");
	By loginbutton = By.xpath("//input[@name='Login']");
	
	
	
	// Constructor
	public loginPage_Parameter(WebDriver driver){
		
		this.driver = driver;
		
	}
	
	
	public void typeUserName(String uid) 
	{
		driver.findElement(username).sendKeys(uid);
	}
	
	public void typePassword(String pass) 
	{
		driver.findElement(password).sendKeys(pass);
	}
	
	public void clickOnLoginButton() 
	{
		driver.findElement(loginbutton).click();
	}
	
}
