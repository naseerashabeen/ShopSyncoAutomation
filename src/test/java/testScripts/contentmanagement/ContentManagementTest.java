package testScripts.contentmanagement;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.project.BaseShopsynco;

import constants.Constant;
import pages.contentmanagement.ContentManagementPage;
import pages.homePage.HomePage;
import pages.login.LoginPage;
import utilities.CommonMethods;
import utilities.ExcelUtilities;

public class ContentManagementTest extends BaseShopsynco
{
	@Test
	public void verifyContentManagementPageLoaded() throws IOException {
			CommonMethods cm=new CommonMethods();
			cm.loginToApplication(driver);
	        HomePage hp=new HomePage(driver);
	        hp.clickcontentmanagementinhomepage();
	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	        wait.until(ExpectedConditions.visibilityOfElementLocated(
	                By.xpath("//h1[text()='Content Management']")));
	        
	        ContentManagementPage cp=new ContentManagementPage(driver);
	        boolean s=cp.isContentManagementPageDisplayed();
			Assert.assertTrue(s,Constant.CONTENTMANAGEMENT_PAGE_DISPLAYED_ERROR);

	    }
	    @Test
	    public void verifyModernMinimalistTemplateDisplayed() throws IOException {
	    	CommonMethods cm=new CommonMethods();
			cm.loginToApplication(driver);
	        HomePage hp=new HomePage(driver);
	        hp.clickcontentmanagementinhomepage();
	    	
	    	ContentManagementPage cmp =
	                new ContentManagementPage(driver);
	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	        wait.until(ExpectedConditions.visibilityOfElementLocated(
	                By.xpath("//h3[text()='Modern Minimalist']")));
	        boolean k=cmp.isModernMinimalistDisplayed();
			Assert.assertTrue(k,Constant.MODERN_MINIMALIST_TEMPLATE_DISPLAYED_ERROR);

	    }
	    @Test
	    public void verifyBoldBrightTemplateDisplayed() throws IOException {
	    	CommonMethods cm=new CommonMethods();
			cm.loginToApplication(driver);
	        HomePage hp=new HomePage(driver);
	        hp.clickcontentmanagementinhomepage();
	    	
	    	ContentManagementPage cmp =
	                new ContentManagementPage(driver);
	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	        wait.until(ExpectedConditions.visibilityOfElementLocated(
	                By.xpath("//h3[text()='Bold & Bright']")));
	        boolean k=cmp.isBoldBrightDisplayed();
			Assert.assertTrue(k,Constant.BOLD_BRIGHT_TEMPLATE_DISPLAYED_ERROR);

	    }

	    @Test
	    public void verifyFashionTemplateDisplayed() throws IOException {
	    	CommonMethods cm=new CommonMethods();
			cm.loginToApplication(driver);
	        HomePage hp=new HomePage(driver);
	        hp.clickcontentmanagementinhomepage();
	    	
	    	ContentManagementPage cmp =
	                new ContentManagementPage(driver);
	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	        wait.until(ExpectedConditions.visibilityOfElementLocated(
	                By.xpath("//h3[text()='Fashion']")));
	        boolean k=cmp.isFashionDisplayed();
			Assert.assertTrue(k,Constant.FASHION_TEMPLATE_DISPLAYED_ERROR);

	    }
	    @Test
	    public void verify_Fashion_PreviewButton() throws IOException
	    {
	    	CommonMethods cm=new CommonMethods();
			cm.loginToApplication(driver);
	        HomePage hp=new HomePage(driver);
	        hp.clickcontentmanagementinhomepage();
	    	
	    	ContentManagementPage cmp =
	                new ContentManagementPage(driver);
	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	    	 wait.until(ExpectedConditions.visibilityOfElementLocated(
		                By.xpath("//h3[text()='Fashion']")));
	    	 cmp.fashion_preview_button_click();
	    	 WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(15));

	    	    wait1.until(ExpectedConditions.visibilityOfElementLocated(
	    	            By.xpath("//h2[contains(text(),'Preview')]")));
	    	
	       boolean k=cmp.prviewfashiontemplateDisplayed();
			Assert.assertTrue(k,Constant.FASHION_PREVIEW_DISPLAYED_ERROR);

	    }
	    @Test
	    public void verify_ModernMinimalist_PreviewButton() throws IOException
	    {
	    	    CommonMethods cm=new CommonMethods();
				cm.loginToApplication(driver);
		        HomePage hp=new HomePage(driver);
		        hp.clickcontentmanagementinhomepage();
		    	
		    	ContentManagementPage cmp =
		                new ContentManagementPage(driver);
		        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
		    	 wait.until(ExpectedConditions.visibilityOfElementLocated(
			                By.xpath("//h3[text()='Modern Minimalist']")));
		    	 cmp.modernminimalist_preview_button_click();
		    	 WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(15));

		    	    wait1.until(ExpectedConditions.visibilityOfElementLocated(
		    	            By.xpath("//h2[contains(text(),'Preview')]")));
		    	
		       boolean k=cmp.prview_modern_minimalist_templateDisplayed();
				Assert.assertTrue(k,Constant.MODERN_MINIMALIST_PREVIEW_DISPLAYED_ERROR);

	    }
	    @Test
	    public void verify_BoldBright_PreviewButton() throws IOException
	    {
	    	 CommonMethods cm=new CommonMethods();
				cm.loginToApplication(driver);
		        HomePage hp=new HomePage(driver);
		        hp.clickcontentmanagementinhomepage();
		    	
		    	ContentManagementPage cmp =
		                new ContentManagementPage(driver);
		        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
		    	 wait.until(ExpectedConditions.visibilityOfElementLocated(
			                By.xpath("//h3[text()='Bold & Bright']")));
		    	 cmp.boldandbright_preview_button_click();
		    	 WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(15));

		    	    wait1.until(ExpectedConditions.visibilityOfElementLocated(
		    	            By.xpath("//h2[contains(text(),'Preview')]")));
		    	
		       boolean k=cmp.prview_boldbright_templateDisplayed();
				Assert.assertTrue(k,Constant.BOLDANDBRIGHT_PREVIEW_DISPLAYED_ERROR);

	    }
	    @Test
	    public void verify_Fashion_UseButton() throws IOException
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
	    	 //
	    	 WebDriverWait wait3 = new WebDriverWait(driver, Duration.ofSeconds(15));

	    	    wait3.until(ExpectedConditions.visibilityOfElementLocated(
	    	            By.xpath("//div[text()='Fashion']")));
	       boolean k=cmp.fashion_edit_templateDisplayed();
			Assert.assertTrue(k,Constant.FASHION_EDIT_PAGE_DISPLAYED_ERROR);

	    }
	    @Test
	    public void verify_ModernMinimalist_UseButton() throws IOException, Exception
	    {
	    	CommonMethods cm=new CommonMethods();
			cm.loginToApplication(driver);
	        HomePage hp=new HomePage(driver);
	        hp.clickcontentmanagementinhomepage();
	    	
	    	ContentManagementPage cmp =
	                new ContentManagementPage(driver);
	        WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(50));
	    	 wait1.until(ExpectedConditions.visibilityOfElementLocated(
		                By.xpath("//h3[text()='Modern Minimalist']")));
	    	 
	    	cmp.modernminimalist_use_button_click();
	    	
	    	 WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(20));
	 		WebElement okButton = wait2.until(
	 			    ExpectedConditions.visibilityOfElementLocated(
	 			        By.id("swal-ok-btn"))
	 			);
	 		cmp.clickOkButton();
	    	 WebDriverWait wait3 = new WebDriverWait(driver, Duration.ofSeconds(15));

	    	    wait3.until(ExpectedConditions.visibilityOfElementLocated(
	    	            By.xpath("//span[text()='MyGlow']")));
	       boolean k=cmp.modern_minimalist_edit_templateDisplayed();
			Assert.assertTrue(k,Constant.MODERNMINIMALIST_EDIT_PAGE_DISPLAYED_ERROR);

	    }
	    @Test
	    public void verify_BoldAndBright_UseButton() throws IOException
	    {
	    	CommonMethods cm=new CommonMethods();
			cm.loginToApplication(driver);
	        HomePage hp=new HomePage(driver);
	        hp.clickcontentmanagementinhomepage();
	    	
	    	ContentManagementPage cmp =
	                new ContentManagementPage(driver);
	        WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(50));
	    	 wait1.until(ExpectedConditions.visibilityOfElementLocated(
		                By.xpath("//h3[text()='Bold & Bright']")));
	    	 cmp.boldandbright_use_button_click();
	    	
	 		WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(20));
	 		WebElement okButton = wait2.until(
	 			    ExpectedConditions.visibilityOfElementLocated(
	 			        By.id("swal-ok-btn"))
	 			);
	 		cmp.clickOkButton();
	    	
	    	 WebDriverWait wait3 = new WebDriverWait(driver, Duration.ofSeconds(15));

	    	    wait3.until(ExpectedConditions.visibilityOfElementLocated(
	    	            By.xpath("//div[text()='Bold & Bright']")));
	       boolean k=cmp.boldandbright_edit_templateDisplayed();
			Assert.assertTrue(k,Constant.BOLDANDBRIGHT_EDIT_PAGE_DISPLAYED_ERROR);

	    }

	}
	
