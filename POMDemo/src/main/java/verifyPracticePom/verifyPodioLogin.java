/**
 * 
 */
package verifyPracticePom;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import PracticePOM.podioCrmLogin;

/**
 * @author Taha Zahid
 *
 */
public class verifyPodioLogin {
	
	@Test
	public void verifyLogin() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","D:\\chromeBrowserDriver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://podio.com/login");
		Thread.sleep(6000);
		
		podioCrmLogin login = new podioCrmLogin(driver);
		
		login.typeUserName("TahaZahidKhan@gmail.com");
		
		login.typePassword("12345678");
		
		login.clickOnLoginButton();
		
//		driver.quit();
	}
}
