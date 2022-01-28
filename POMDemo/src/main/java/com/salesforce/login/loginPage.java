package com.salesforce.login;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * @author Taha Zahid
 *	This class will store all locators and methods of login page
 */

public class loginPage {
	
	WebDriver driver;
	
	By username = By.id("username");
	By password = By.name("pw");
	By loginbutton = By.xpath("//input[@name='Login']");
	
	
	
	// Constructor
	public loginPage(WebDriver driver){
		
		this.driver = driver;
		
	}
	
	
	public void typeUserName() 
	{
		driver.findElement(username).sendKeys("TahaZahidKhan");
	}
	
	public void typePassword() 
	{
		driver.findElement(password).sendKeys("12345678");
	}
	
	public void clickOnLoginButton() 
	{
		driver.findElement(loginbutton).click();
	}
	
}
