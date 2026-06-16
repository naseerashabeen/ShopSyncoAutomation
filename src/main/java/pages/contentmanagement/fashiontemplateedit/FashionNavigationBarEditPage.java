package pages.contentmanagement.fashiontemplateedit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FashionNavigationBarEditPage {
	
	public WebDriver driver;
	public FashionNavigationBarEditPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@placeholder='Your Brand Name']")
	private WebElement logoTextBox;
	
	@FindBy(xpath="//button[text()='Save']")
	private WebElement savebuttonheader;
	
	@FindBy(xpath="	//input[@class='w-full h-10 border border-gray-300 rounded-lg px-3 mb-4 text-sm']")
	private WebElement savestyletextcoloumn;
	
	@FindBy(xpath="	//button[@class='px-4 py-2 bg-[#7658A0] text-white rounded-lg text-sm hover:bg-[#654a8a] disabled:opacity-50']")
	private WebElement save_style_save_button;
	

	@FindBy(xpath="//button[@id='swal-ok-btn']")
	private WebElement savestyleokbutton;
	
	@FindBy(xpath="//button[text()='Saved Style']")
	private WebElement savedstylecontentmanagement;
	
	 @FindBy(xpath="//img[@alt='Fashion Style 2025 cover']/ancestor::div[contains(@class,'group')]//button[contains(.,'Use')]")
	 private WebElement newsavedstyleusebutton;
	
	 @FindBy(xpath="//button[text()='Publish']")
	 private WebElement publishbutton;
	 
	 @FindBy(xpath="//button[@class='px-4 py-2 bg-[#7658A0] text-white rounded-lg text-sm']")
	 private WebElement publishpopup;
	
	 @FindBy(xpath="//button[text()='Back']")
	 private WebElement backButton;

	 @FindBy(xpath="//span[text()='Storefront']")
	 private WebElement storefront;
	
	 public void clickBackButton() {
	     backButton.click();
	 }
	public void clearLogoText() {
	    //logoTextBox.clear();
	    logoTextBox.click();

	    logoTextBox.sendKeys(Keys.CONTROL + "a");

	    logoTextBox.sendKeys(Keys.DELETE);
	}
	public void enterLogoText(String expectedLogoText) {
		
		logoTextBox.sendKeys(expectedLogoText);		
	}
	public void clickSaveButton() {		
		savebuttonheader.click();
	}
	public void enterStyleName(String style) {
		savestyletextcoloumn.sendKeys(style);
		
	}
	public void clicksavestylepopup() {
		save_style_save_button.click();
		
	}
	public void clickokbutton() {
		savestyleokbutton.click();
		
	}
	public void clicksavedstylecontentmanagement() {
		savedstylecontentmanagement.click();
	}
	public void newsavedstyleclick() {
		
		newsavedstyleusebutton.click();
	}
	public void clickPublishButton() {
		publishbutton.click();
		
	}
	public void clickPublishpopupButton() {
		publishpopup.click();
		
	}
	public void clickstorefront() {
		storefront.click();
		
	}
	
}
