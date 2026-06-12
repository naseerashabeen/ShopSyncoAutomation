package pages.homePage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage
{
  public WebDriver driver;
	@FindBy(xpath="//span[text()='Store Overview']") private WebElement managerdashboard;
	@FindBy(xpath="//span[text()='Content Management']") private WebElement contentmanagement;

	
	  public HomePage(WebDriver driver)
	  {
		  this.driver=driver;
			PageFactory.initElements(driver, this);
	  }
	  public boolean manager_dashBoardDisplayed()
		{
		  try {
		        return managerdashboard.isDisplayed();
		    }
		    catch(Exception e) {
		        return false;
		    }		
		 }
	  public void clickcontentmanagementinhomepage()
		{
			contentmanagement.click();
		}
	
}
