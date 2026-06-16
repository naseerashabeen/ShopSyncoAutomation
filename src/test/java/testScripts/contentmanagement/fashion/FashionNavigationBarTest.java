package testScripts.contentmanagement.fashion;
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
import pages.contentmanagement.fashiontemplateedit.FashionNavigationBarEditPage;
import utilities.CommonMethods;

public class FashionNavigationBarTest extends BaseShopsynco{	
	@Test
	public void verifyLogoText() throws IOException, InterruptedException
	{
		CommonMethods c=new CommonMethods();
		c.logintoFashionTemplateEditpage(driver);
		FashionNavigationBarEditPage fn=new FashionNavigationBarEditPage(driver);
		fn.clearLogoText();
		String expectedLogoText = "kichufashion";
		fn.enterLogoText(expectedLogoText);
		fn.clickSaveButton();
		fn.enterStyleName("Fashion Style 2025");
		fn.clicksavestylepopup();
		WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));

		WebElement okButton = wait1.until(
		        ExpectedConditions.elementToBeClickable(
		                By.xpath("//button[@id='swal-ok-btn']")
		        )
		);

		fn.clickokbutton();

		WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(20));

		// Wait until popup overlay disappears
		wait2.until(ExpectedConditions.invisibilityOfElementLocated(
		        By.xpath("//div[contains(@class,'bg-black/40')]")));

		// Wait until Back button is clickable
		wait2.until(ExpectedConditions.elementToBeClickable(
		        By.xpath("//button[text()='Back']")));

		fn.clickBackButton();
		WebDriverWait wait3 = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait3.until(ExpectedConditions.urlContains("content"));
		
		fn.clicksavedstylecontentmanagement();
		WebDriverWait wait4= new WebDriverWait(driver, Duration.ofSeconds(50));
 	    WebElement fashionCard = wait4.until(
 		        ExpectedConditions.presenceOfElementLocated(
 		                By.xpath("//h3[contains(.,'Fashion Style 2025')]")
 		        )
 		);
 	   System.out.println(fashionCard.getText());
 	    fn.newsavedstyleclick();
 	   WebDriverWait wait5 = new WebDriverWait(driver, Duration.ofSeconds(10));

		WebElement okButton1 = wait5.until(
		        ExpectedConditions.elementToBeClickable(
		                By.xpath("//button[@id='swal-ok-btn']")
		        )
		);
 	    fn.clickokbutton();
 	    fn.clickPublishButton();
 	    fn.clickPublishpopupButton();
 	   WebDriverWait wait6 = new WebDriverWait(driver, Duration.ofSeconds(10));

		WebElement okButton2 = wait5.until(
		        ExpectedConditions.elementToBeClickable(
		                By.xpath("//button[@id='swal-ok-btn']")
		        )
		);
	    fn.clickokbutton();
	 // Wait until Back button is clickable
		WebDriverWait wait7 = new WebDriverWait(driver, Duration.ofSeconds(20));

	 		wait7.until(ExpectedConditions.elementToBeClickable(
	 		        By.xpath("//button[text()='Back']")));

	 		fn.clickBackButton();
	 	// Store current tab
	 		String parentWindow = driver.getWindowHandle();

	 		fn.clickstorefront();
	 		
	 		// Wait until new tab opens
	 		WebDriverWait wait8 = new WebDriverWait(driver, Duration.ofSeconds(20));

	 		wait8.until(ExpectedConditions.numberOfWindowsToBe(2));

	 		// Switch to new tab
	 		for (String window : driver.getWindowHandles()) {

	 		    if (!window.equals(parentWindow)) {

	 		        driver.switchTo().window(window);

	 		        break;
	 		    }
	 		}
	 		wait8.until(webDriver ->
	 	    ((String)((org.openqa.selenium.JavascriptExecutor)webDriver)
	 	    .executeScript("return document.readyState"))
	 	    .equals("complete")
	 	  );
	 		
	 		// Wait until logo is visible
	 		WebElement logo = wait8.until(
	 		        ExpectedConditions.visibilityOfElementLocated(
	 		                By.xpath("//*[contains(text(),'kichu')]")
	 		        )
	 		);

	 		String actualLogoText = logo.getText();

	 		Assert.assertEquals(
	 		        actualLogoText.toLowerCase(),
	 		        expectedLogoText.toLowerCase(),
	 		        Constant.LOGOTEXT_UPDATED_ERROR
	 		);
	 	
	}		
	public void verifyLogoTypeText()
	{
		
	}
	public void verifyLogoTypeImage()
	{
		
	}
	public void verifyLogoPositionCenter()
	{
		
	}
	public void verifyBackgroundColor()
	{
		
	}
	}

