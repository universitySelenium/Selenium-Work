package com.mycompany.app;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class POMselenium_with_parameter {
	
	@Test
	public void pomSelenium()
	{
		System.setProperty("webdriver.chrome.driver","D:\\chromeBrowserDriver\\chromedriver.exe");
		ChromeDriver driver =new ChromeDriver();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable--notifications");
		driver.get("https://www.guru99.com/first-webdriver-script.html");
		
	}

}
