package Utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitHelper {
	
	
	public WebDriver driver;
	public WaitHelper(WebDriver driver) {
		
		this.driver=driver;
		
	}
	
	public void WaitForElement(WebElement element, long timeout) {
		
		WebDriverWait wait=new WebDriverWait(driver, timeout);
		wait.until(ExpectedConditions.visibilityOf(element));
		
		
	}
	
	public void WaitForElementToBeClickable(By locator, long timeout) {
		
		WebDriverWait wait=new WebDriverWait(driver, timeout);
		wait.until(ExpectedConditions.elementToBeSelected(locator));
		
		
	}

}
