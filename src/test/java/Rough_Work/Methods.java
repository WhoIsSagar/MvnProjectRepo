package Rough_Work;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

public class Methods {

	public static void sendKeys1(WebDriver driver, int timeout, WebElement element, String value) {
		
		
		new WebDriverWait(driver, Duration.ofSeconds(timeout))
        .until(ExpectedConditions.visibilityOf(element));
		element.sendKeys(value);
		
      
}
	
	public static void clickOn(WebElement element, int timeout, WebDriver driver) {
		
		new WebDriverWait(driver, Duration.ofSeconds(timeout))
		.until(ExpectedConditions.elementToBeClickable(element));
		element.click();
			
       
	}
	
	public static void assertTest(WebDriver driver,int timeout,WebElement element) {
		
		String expectedError = "Find your account and log in.";
		String actualError = element.getText();
		new WebDriverWait(driver, Duration.ofSeconds(timeout)).until(ExpectedConditions.visibilityOf(element));
		SoftAssert softassert = new SoftAssert();
		softassert.assertEquals(expectedError, actualError);
		softassert.assertAll();
			
	}
}
