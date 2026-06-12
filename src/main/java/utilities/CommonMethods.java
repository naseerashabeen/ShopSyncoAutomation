package utilities;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import constants.Constant;
import pages.contentmanagement.ContentManagementPage;
import pages.homePage.HomePage;
import pages.login.LoginPage;

public class CommonMethods 
{
	public void loginToApplication(WebDriver driver) throws IOException 
	{
		String username=ExcelUtilities.getStringData(1, 0, "Login-page");
		String password=ExcelUtilities.getStringData(1, 1, "Login-page");
		LoginPage lp=new LoginPage(driver);
		lp.enterEmail(username);
		lp.enterPassword(password);
		lp.clickLoginButton();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		WebElement okButton = wait.until(
		    ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='ok']"))
		);
		lp.clickOkButton();
		WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait1.until(ExpectedConditions.visibilityOfElementLocated(
		        By.xpath("//span[text()='Store Overview']")));
	}

	public void logintoFashionTemplateEditpage(WebDriver driver) throws IOException
    {
    	CommonMethods cm=new CommonMethods();
		cm.loginToApplication(driver);
        HomePage hp=new HomePage(driver);
        hp.clickcontentmanagementinhomepage();
    	
    	ContentManagementPage cmp =
                new ContentManagementPage(driver);
        WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(50));
    	 wait1.until(ExpectedConditions.visibilityOfElementLocated(
	                By.xpath("//h3[text()='Fashion']")));
    	 cmp.fashion_use_button_click();
    	 
    	 WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(10));

 		WebElement okButton = wait2.until(
 		    ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='ok']"))
 		);
 		cmp.clickOkButton();
    	 WebDriverWait wait3 = new WebDriverWait(driver, Duration.ofSeconds(15));

    	    wait3.until(ExpectedConditions.visibilityOfElementLocated(
    	            By.xpath("//div[text()='Fashion']")));
    }
}
