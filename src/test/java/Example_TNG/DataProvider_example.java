package Example_TNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider_example {

	public WebDriver driver;

	@Test(priority = 2, dataProvider = "Rediff")
	public void enterRediffLogicDetails(String username, String password) {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.mail.rediff.com/cgi-bin/login.cgi");
		driver.findElement(By.id("login1")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.className("signinbtn")).click();

	}

	@Test(priority = 1, dataProvider = "TN")
	public void enterTNLoginDetails(String username, String password) {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://tutorialsninja.com/demo");
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.id("input-email")).sendKeys(username);
		driver.findElement(By.id("input-password")).sendKeys(password);
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		
	}

	@DataProvider(name = "Rediff")
	public Object[][] getRediffData() {
		Object[][] data = { { "seleniumpanda@rediffmail.com", "Selenium@123" },
				            { "seleniumpanda1@rediffmail.com", "Donkey@123" } };

		return data;
	}

	@DataProvider(name = "TN")
	public Object[][] getTNData() {
		Object[][] data = { { "seleniumpanda@gmail.com", "Selenium@123" },
				            { "seleniumpanda1@gmail.com", "Selenium@123"},
				            { "seleniumpanda2@gmail.com", "Selenium@123"},
				            { "seleniumpanda3@gmail.com", "Selenium@123"},
				            { "seleniumpanda4@gmail.com", "Selenium@1234"}};

		return data;
	}

}

