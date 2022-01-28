/**
 * 
 */
package PracticePOM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * @author Taha Zahid
 *	This class will store all login page locators for podio crm
 */
public class podioCrmLogin {
	
	WebDriver driver;
	
	By username = By.name("email");
	By password = By.xpath("//input[@id='password']");
	By loginbutton = By.id("loginFormSignInButton");
	
	//constructor
	public podioCrmLogin(WebDriver driver) {
		
		this.driver=driver;
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
