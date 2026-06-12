package testScripts.contentmanagement.fashion;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.project.BaseShopsynco;

import pages.contentmanagement.fashiontemplateedit.FashionNavigationBarEditPage;
import utilities.CommonMethods;

public class FashionNavigationBarTest extends BaseShopsynco{
	
	@Test
	public void verifyLogoText() throws IOException
	{
		CommonMethods c=new CommonMethods();
		c.logintoFashionTemplateEditpage(driver);
		FashionNavigationBarEditPage fn=new FashionNavigationBarEditPage(driver);
		fn.clearLogoText();
		String expectedLogoText = "Nazira Fashion";
		fn.enterLogoText(expectedLogoText);
		fn.clickSaveButton();
		fn.enterStyleName("Fashion Style 2026");
		fn.clicksavestylepopup();
		fn.clickokbutton();
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(15));

 	    wait.until(ExpectedConditions.visibilityOfElementLocated(
 	            By.xpath("//button[text()='Back']")));
		fn.clickBackButton();
		WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait1.until(ExpectedConditions.urlContains("content"));
		
		fn.clicksavedstylecontentmanagement();
		WebDriverWait wait2= new WebDriverWait(driver, Duration.ofSeconds(15));

 	    wait2.until(ExpectedConditions.visibilityOfElementLocated(
 	            By.xpath("Fashion Style 2026")));
 	    fn.newsavedstyleclick();
 	    fn.clickokbutton();
 	   
 	    
 	    
		
		
	}

		/*
		// Publish
		cmp.clickPublishButton();

		// Open Preview / Store URL
		cmp.clickPreviewButton();

		// Switch to new tab if Preview opens a new tab
		for(String window : driver.getWindowHandles()) {
		    driver.switchTo().window(window);
		}

		// Verify Logo Text on Website
		WebElement logoText = wait.until(
		        ExpectedConditions.visibilityOfElementLocated(
		                By.xpath("//*[text()='Nazira Fashion']")));

		String actualLogoText = logoText.getText();

		Assert.assertEquals(
		        actualLogoText,
		        expectedLogoText,
		        "Logo text is not updated on website");

		}
	*/
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

