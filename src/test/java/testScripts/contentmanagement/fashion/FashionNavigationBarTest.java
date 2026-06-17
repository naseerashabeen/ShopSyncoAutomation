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
import utilities.RandomUtility;
import utilities.WaitUtility;

public class FashionNavigationBarTest extends BaseShopsynco{	
	@Test
	public void verifyLogoText() throws IOException, InterruptedException
	{
		CommonMethods c=new CommonMethods();
		c.logintoFashionTemplateEditpage(driver);
		FashionNavigationBarEditPage fn=new FashionNavigationBarEditPage(driver);
		fn.clearLogoText();
		
		String uniqueValue = RandomUtility.generateLogoText();
		String expectedLogoText = "Fashion"+uniqueValue;
		String styleName = RandomUtility.generateStyleName();
		fn.enterLogoText(expectedLogoText);
		fn.clickSaveButton();
		fn.enterStyleName(styleName);
		fn.clicksavestylepopup();
		WaitUtility.waitForClickable(driver,By.id("swal-ok-btn"));
		fn.clickokbutton();
		WaitUtility.waitForInvisible(driver,By.xpath("//div[contains(@class,'bg-black/40')]"));
		WaitUtility.waitForClickable(driver, By.xpath("//button[text()='Back']"));
		fn.clickBackButton();
		WaitUtility.waitForUrl(driver, "content");
		fn.clicksavedstylecontentmanagement();
		WaitUtility.waitForVisible(driver, By.xpath("//h3[contains(.,'"+styleName+"')]"));
		System.out.println(styleName);
		fn.clickUseButton(styleName);
 	    WaitUtility.waitForClickable(driver, By.xpath("//button[@id='swal-ok-btn']"));
 	    fn.clickokbutton();
 	    fn.clickPublishButton();
 	    fn.clickPublishpopupButton();
 	    WaitUtility.waitForClickable(driver, By.xpath("//button[@id='swal-ok-btn']"));
	    fn.clickokbutton();
	    WaitUtility.waitForClickable(driver,By.xpath("//button[text()='Back']"));
	 		fn.clickBackButton();
	 	// Store current tab
	 		String parentWindow = driver.getWindowHandle();
	 		fn.clickstorefront();
	 		new WebDriverWait(driver, Duration.ofSeconds(20))
            .until(ExpectedConditions.numberOfWindowsToBe(2));
	 		// Switch to new tab
	 		for (String window : driver.getWindowHandles()) {

	 		    if (!window.equals(parentWindow)) {

	 		        driver.switchTo().window(window);

	 		        break;
	 		    }
	 		}
	 		WaitUtility.waitForPageLoad(driver);
	 		WebElement logo = WaitUtility.waitForVisible(driver,By.xpath("//a[@class='hover:opacity-80 transition shrink-0 inline-flex items-center justify-center']"));
	 		String actualLogoText = logo.getText();
	 		Assert.assertEquals(
	 		        actualLogoText.toLowerCase(),
	 		        expectedLogoText.toLowerCase(),
	 		        Constant.LOGOTEXT_UPDATED_ERROR);
	 		}
	@Test
	public void verifyNavigationBarLogoTextStyle() throws IOException
	{
		CommonMethods c=new CommonMethods();
		c.logintoFashionTemplateEditpage(driver);
		FashionNavigationBarEditPage fn=new FashionNavigationBarEditPage(driver);
		fn.clearLogoText();
		String uniqueValue = RandomUtility.generateLogoText();
		String expectedLogoText = "Fashion"+uniqueValue;
		String styleName = RandomUtility.generateStyleName();
		fn.enterLogoText(expectedLogoText);
		fn.clickBold();
	    fn.clickItalic();
	    fn.clickUnderline();
	    fn.clickSaveButton();
	    fn.enterStyleName(styleName);
		fn.clicksavestylepopup();
		WaitUtility.waitForClickable(driver,By.id("swal-ok-btn"));
		fn.clickokbutton();
		WaitUtility.waitForInvisible(driver,By.xpath("//div[contains(@class,'bg-black/40')]"));
		WaitUtility.waitForClickable(driver, By.xpath("//button[text()='Back']"));
		fn.clickBackButton();
		WaitUtility.waitForUrl(driver, "content");
		fn.clicksavedstylecontentmanagement();
		WaitUtility.waitForVisible(driver, By.xpath("//h3[contains(.,'"+styleName+"')]"));
		System.out.println(styleName);
		fn.clickUseButton(styleName);
 	    WaitUtility.waitForClickable(driver, By.xpath("//button[@id='swal-ok-btn']"));
 	    fn.clickokbutton();
 	    fn.clickPublishButton();
 	    fn.clickPublishpopupButton();
 	    WaitUtility.waitForClickable(driver, By.xpath("//button[@id='swal-ok-btn']"));
	    fn.clickokbutton();
	    WaitUtility.waitForClickable(driver,By.xpath("//button[text()='Back']"));
	 		fn.clickBackButton();
	 	// Store current tab
	 		String parentWindow = driver.getWindowHandle();
	 		fn.clickstorefront();
	 		new WebDriverWait(driver, Duration.ofSeconds(20))
            .until(ExpectedConditions.numberOfWindowsToBe(2));
	 		// Switch to new tab
	 		for (String window : driver.getWindowHandles()) {

	 		    if (!window.equals(parentWindow)) {

	 		        driver.switchTo().window(window);

	 		        break;
	 		    }
	 		}
	 		driver.navigate().refresh();
	 		WaitUtility.waitForPageLoad(driver);
	 		
	 		WebElement logo = WaitUtility.waitForVisible(driver,By.xpath("//a[@class='hover:opacity-80 transition shrink-0 inline-flex items-center justify-center']"));
			    String fontWeight =logo.getCssValue("font-weight");
			    String fontStyle =logo.getCssValue("font-style");
			    String textDecoration =logo.getCssValue("text-decoration");
			    Assert.assertTrue(Integer.parseInt(fontWeight) >= 700,"Bold is not applied");
			    Assert.assertEquals(fontStyle,"italic","Italic is not applied");
			    Assert.assertTrue(textDecoration.contains("underline"),"Underline is not applied" );
		}
		public void verifyNavigationBarLogoTextFont() 
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

