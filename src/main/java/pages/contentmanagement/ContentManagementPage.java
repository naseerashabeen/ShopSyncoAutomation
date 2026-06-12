package pages.contentmanagement;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContentManagementPage
{
	    public WebDriver driver;

	    @FindBy(xpath="//h1[text()='Content Management']") 
	    private WebElement contentManagementHeader;

	    @FindBy(xpath="//h3[text()='Modern Minimalist']")
	    private WebElement modernMinimalistTemplate;

	    @FindBy(xpath="//h3[text()='Bold & Bright']")
	    private WebElement boldBrightTemplate;

	    @FindBy(xpath="//h3[text()='Fashion']")
	    private WebElement fashionTemplate;

	    @FindBy(xpath="//img[@alt='Modern Minimalist']/ancestor::div[contains(@class,'group')]//button[contains(.,'Preview')]")
	    private WebElement modernminimalistpreviewbutton;
	    
	    @FindBy(xpath="//img[@alt='Bold & Bright']/ancestor::div[contains(@class,'group')]//button[contains(.,'Preview')]")
	    private WebElement boldAndBrightPreviewButton;
	    
	    
	    @FindBy(xpath="//img[@alt='Fashion']/ancestor::div[contains(@class,'group')]//button[contains(.,'Preview')]")
	    private WebElement fashionpreviewbutton;
	    
	    @FindBy(xpath="//div[text()='Fashion']")
	    private WebElement fashion_edit_header;
	    
	    @FindBy(xpath="//span[text()='MyGlow']")
	    private WebElement modern_minimalist_edit_header;
	    
	    @FindBy(xpath="//div[text()='Bold & Bright']")
	    private WebElement boldbright_edit_header;
	    
	    @FindBy(xpath="//img[@alt='Fashion']/ancestor::div[contains(@class,'group')]//button[contains(.,'Use')]")
	    private WebElement fashionusebutton;
	    
	    @FindBy(xpath="//img[@alt='Modern Minimalist']/ancestor::div[contains(@class,'group')]//button[contains(.,'Use')]")
	    private WebElement modernminimalistusebutton;
	    
	    @FindBy(xpath="//img[@alt='Bold & Bright']/ancestor::div[contains(@class,'group')]//button[contains(.,'Use')]")
	    private WebElement boldAndBrightuseButton;
	    
	    @FindBy(xpath="//h2[contains(text(),'Preview')]")
	    private WebElement fashionpreviewheader;
	    
	    @FindBy(xpath="//h2[contains(text(),'Preview')]")
	    private WebElement modern_minimalist_previewheader;
	    
	    @FindBy(xpath="//h2[contains(text(),'Preview')]")
	    private WebElement boldbrightpreviewheader;
	    
	    @FindBy(xpath="//button[text()='ok']")
	    private WebElement okButton;
	    
	    public ContentManagementPage(WebDriver driver)
		{
			this.driver=driver;
			PageFactory.initElements(driver, this);
		}
	   
	    public boolean isContentManagementPageDisplayed() {
	        return contentManagementHeader.isDisplayed();
	    }

	    public boolean isModernMinimalistDisplayed() {
	        return modernMinimalistTemplate.isDisplayed();
	    }

	    public boolean isBoldBrightDisplayed() {
	        return boldBrightTemplate.isDisplayed();
	    }

	    public boolean isFashionDisplayed() {
	        return fashionTemplate.isDisplayed();
	    }

		public void fashion_preview_button_click() {
			
			fashionpreviewbutton.click();
		}
		public void modernminimalist_preview_button_click() {
					
			modernminimalistpreviewbutton.click();
				}
		public void boldandbright_preview_button_click() {
			
			boldAndBrightPreviewButton.click();
		}

		public boolean prviewfashiontemplateDisplayed() {
			
			return fashionpreviewheader.isDisplayed();
		
		}
		public boolean prview_modern_minimalist_templateDisplayed() {
			
			return modern_minimalist_previewheader.isDisplayed();
		
		}
		public boolean prview_boldbright_templateDisplayed() {
	
			return boldbrightpreviewheader.isDisplayed();

		}public void fashion_use_button_click() {
			
			fashionusebutton.click();
		}
		public void modernminimalist_use_button_click() {
			
			modernminimalistusebutton.click();
		}
		public void boldandbright_use_button_click() {
			
			boldAndBrightuseButton.click();
		}
        public boolean Edit_fashion_template_PageDisplayed() {
			
			return fashion_edit_header.isDisplayed();
		
		}
		public boolean Edit_modern_minimalist_template_pageDisplayed() {
			
			return modern_minimalist_edit_header.isDisplayed();
		
		}
		public boolean Edit_boldbright_template_page_Displayed() {
	
			return boldbright_edit_header.isDisplayed();

	}
		public void clickOkButton() {
			okButton.click();
		}

		public boolean fashion_edit_templateDisplayed() {
			
			return fashion_edit_header.isDisplayed();
		}
		public boolean modern_minimalist_edit_templateDisplayed() {
			return modern_minimalist_edit_header.isDisplayed();
		}
		public boolean boldandbright_edit_templateDisplayed() {
			
			return boldbright_edit_header.isDisplayed();
		}
		

}
    

