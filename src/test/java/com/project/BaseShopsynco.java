package com.project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseShopsynco {
	public WebDriver driver;
	@BeforeMethod
	public void initializeBrowser()
	{
		driver=new ChromeDriver();
		driver.get("https://manager.shopsynco.com/login");
		driver.manage().window().maximize();
	}
	@AfterMethod
	public void closeBrowser()
	{
		//driver.close();
		//driver.quit();
	}
	
	
}
