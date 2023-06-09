
package Para_TN_Register;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.Parameters;


public class Para_TN_Register {
	public WebDriver driver;
	
	@Test
	@Parameters({"Browser", "url", "clickMyAccount", "clickRegister","clickFirstName", "clickLastName", "clickEmail", "clickTelephone" , "clickPassword", "clickConfirmPassword" ,"firstName", "lastName", "email", "telephone", "password","passwordConfirmation","agreeButton","continueButton"})
	public void rediffLoginTest(String Browser, String url, String clickMyAccount, String clickRegister, String clickFirstName, String clickEmail, String clickLastName, String clickTelephone, String clickPassword, String clickConfirmPassword, String firstName, String lastName, String email, String telephone, String password, String passwordConfirmation, String agreeButton, String continueButton) {
		if(Browser.equals("Chrome")) {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		}else if(Browser.equals("firefox")) {
			driver = new FirefoxDriver();
			driver.manage().window().maximize();	
		}
		driver.get(url);
		driver.findElement(By.linkText(clickMyAccount)).click();
		driver.findElement(By.linkText(clickRegister)).click();
		driver.findElement(By.xpath(clickFirstName)).sendKeys(firstName);
		driver.findElement(By.xpath(clickLastName)).sendKeys(lastName);
		driver.findElement(By.xpath(clickEmail)).sendKeys(email);
		driver.findElement(By.xpath(clickTelephone)).sendKeys(telephone);
		driver.findElement(By.xpath(clickPassword)).sendKeys(password);
		driver.findElement(By.xpath(clickConfirmPassword)).sendKeys(password);
		driver.findElement(By.xpath(agreeButton)).click();
		driver.findElement(By.xpath(continueButton)).click();
		

	}
	
	@AfterMethod
	public void teardown() {
		driver.quit();
	}
}
