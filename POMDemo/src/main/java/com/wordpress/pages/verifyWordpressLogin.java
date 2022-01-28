
package com.wordpress.pages;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
//import com.salesforce.login.loginPage;
import com.salesforce.login.loginPage_Parameter;

/**
 * @author Taha Zahid
 *
 */
public class verifyWordpressLogin {
	
	@Test
	public void verifyLogin()
	{
		System.setProperty("webdriver.chrome.driver","D:\\chromeBrowserDriver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://login.salesforce.com/");
		
		
		loginPage_Parameter login = new loginPage_Parameter(driver);
		
		login.typeUserName("TahaZahidKhan");
		
		login.typePassword("12345678");
		
		login.clickOnLoginButton();
		
		driver.quit();
	}

}
