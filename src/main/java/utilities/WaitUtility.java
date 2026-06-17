package utilities;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitUtility
{

	    public static WebElement waitForClickable(WebDriver driver, By locator) {

	        return new WebDriverWait(driver, Duration.ofSeconds(20))
	                .until(ExpectedConditions.elementToBeClickable(locator));
	    }

	    public static WebElement waitForVisible(WebDriver driver, By locator) {

	        return new WebDriverWait(driver, Duration.ofSeconds(20))
	                .until(ExpectedConditions.visibilityOfElementLocated(locator));
	    }

	    public static void waitForInvisible(WebDriver driver, By locator) {

	        new WebDriverWait(driver, Duration.ofSeconds(20))
	                .until(ExpectedConditions.invisibilityOfElementLocated(locator));
	    }

	    public static void waitForUrl(WebDriver driver, String text) {

	        new WebDriverWait(driver, Duration.ofSeconds(20))
	                .until(ExpectedConditions.urlContains(text));
	    }

	    public static void waitForPageLoad(WebDriver driver) {

	        new WebDriverWait(driver, Duration.ofSeconds(20))
	                .until(webDriver ->
	                        ((String)((org.openqa.selenium.JavascriptExecutor)webDriver)
	                        .executeScript("return document.readyState"))
	                        .equals("complete"));
	    }
	}
