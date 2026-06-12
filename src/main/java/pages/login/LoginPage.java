package pages.login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage
{
	public WebDriver driver;
	@FindBy(name="email" )private WebElement email;
	@FindBy(xpath="//input[@name='password']") private WebElement password;
	@FindBy(xpath="//button[@type='submit']") private WebElement login_button;
	@FindBy(xpath="//button[@id='swal-ok-btn']") private WebElement ok_button;
	@FindBy(id="swal-title") private WebElement errorMessage;

	

	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void enterEmail(String emailid)
	{
		email.sendKeys(emailid);
	}
	public void enterPassword(String password_value)
	{
		password.sendKeys(password_value);
	}
	public void clickLoginButton()
	{
		login_button.click();
	}
	public void clickOkButton()
	{
		ok_button.click();
	}
	public String getErrorMessage()
	{
	    return errorMessage.getText();
	}
	
}
