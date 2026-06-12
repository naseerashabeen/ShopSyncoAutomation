package testScripts.login;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.project.BaseShopsynco;

import constants.Constant;
import pages.homePage.HomePage;
import pages.login.LoginPage;
import utilities.ExcelUtilities;

public class LoginTest extends BaseShopsynco
{
	@Test
	public void verifyWhether_UserIsAbleto_loginwith_Validcredentials() throws IOException
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
		HomePage hp = new HomePage(driver);
		
		WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait1.until(ExpectedConditions.visibilityOfElementLocated(
		        By.xpath("//span[text()='Store Overview']")));
		boolean display_value=hp.manager_dashBoardDisplayed();
		System.out.println(display_value);
		Assert.assertTrue(display_value,Constant.VALID_CREDENTIAL_ERROR);
		
	}
	//check here
	//@Test
	public void verifyWhether_UserIsAbleto_loginwith_ValidUsername_Invalidpassword() throws IOException
	{
		String username=ExcelUtilities.getStringData(2, 0, "Login-page");
		String password=ExcelUtilities.getStringData(2, 1, "Login-page");
		LoginPage lp=new LoginPage(driver);
		lp.enterEmail(username);
		lp.enterPassword(password);
		lp.clickLoginButton();

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	    wait.until(ExpectedConditions.visibilityOfElementLocated(
	            By.id("swal-title")));

	    String actualError = lp.getErrorMessage();

	    Assert.assertEquals(actualError, "Tenant Account Required");

	}
	@Test
	public void verifyWhether_UserIsAbleto_loginwith_Invalidusername_Validpassword() throws IOException
	{
		String username=ExcelUtilities.getStringData(3, 0, "Login-page");
		String password=ExcelUtilities.getStringData(3, 1, "Login-page");
		LoginPage lp=new LoginPage(driver);
		lp.enterEmail(username);
		lp.enterPassword(password);
		lp.clickLoginButton();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		    wait.until(ExpectedConditions.visibilityOfElementLocated(
		            By.id("swal-title")));

		    String actualError = lp.getErrorMessage();

		    Assert.assertEquals(actualError, "Tenant Account Required");

	}
	@Test
	public void verifyWhether_UserIsAbleto_loginwith_Invalidusername_InValidpassword() throws IOException
	{
		String username=ExcelUtilities.getStringData(4, 0, "Login-page");
		String password=ExcelUtilities.getStringData(4, 1, "Login-page");
		LoginPage lp=new LoginPage(driver);
		lp.enterEmail(username);
		lp.enterPassword(password);
		lp.clickLoginButton();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	    wait.until(ExpectedConditions.visibilityOfElementLocated(
	            By.id("swal-title")));

	    String actualError = lp.getErrorMessage();

	    Assert.assertEquals(actualError, "Tenant Account Required");

	}
}
