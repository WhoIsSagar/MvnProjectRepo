package Example_TNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



public class TestNG_LogIN_Log_Out {
	public static WebDriver driver;


	
	
	@BeforeMethod
	public void openWebPage(){
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/");
		
		

		

	}
	
	@Test(priority = 1 )

	public void Login(){
		WebElement myAccountLink = driver.findElement(By.linkText("My Account"));
	    myAccountLink.click();
		driver.findElement(By.xpath("//input [@id = 'input-email']" )).sendKeys("sagarhanjhra000121@gmail.com");
		driver.findElement(By.xpath("//input [@id = 'input-email']/parent:: div[1]/following-sibling ::div[1] /child:: input[1]")).sendKeys("Sagar1123");
		driver.findElement(By.xpath("//input [@id = 'input-email']/parent:: div[1]/following-sibling ::div[1] /child:: input[1]/following::input [@class = 'btn btn-primary']")).click();
		
		String currentUrl = driver.getCurrentUrl();
		String expectedUrl = "https://tutorialsninja.com/demo/index.php?route=account/account";
		
		if (currentUrl.equals(expectedUrl)) {
			System.out.println("Excellent Work");
			
		}
		
		else {
			System.out.println("Nope not Correct URL ");
			
		}
	}
	
	@Test(priority = 2) 
	public void LogoutAndLogout () {
		 WebElement myAccountLink = driver.findElement(By.linkText("My Account"));
	        myAccountLink.click();
		driver.findElement(By.xpath("//ul [@class = 'list-inline']/child:: li [ @class = 'dropdown open']/child::a[@class = 'dropdown-toggle']")).click();
		driver.findElement(By.xpath("//ul [@class = 'list-inline']/child:: li [ @class = 'dropdown open']/child::a[@class = 'dropdown-toggle']/following-sibling::ul/child::li[2]/child::a[1]")).click();
		driver.findElement(By.xpath("//input [@id = 'input-email']" )).sendKeys("sagarhanjhra000121@gmail.com");
		driver.findElement(By.xpath("//input [@id = 'input-email']/parent:: div[1]/following-sibling ::div[1] /child:: input[1]")).sendKeys("Sagar1123");
		driver.findElement(By.xpath("//input [@id = 'input-email']/parent:: div[1]/following-sibling ::div[1] /child:: input[1]/following::input [@class = 'btn btn-primary']")).click();
		driver.findElement(By.xpath("//a [@class = 'dropdown-toggle']")).click();
		driver.findElement(By.xpath("//a [@class = 'dropdown-toggle']/following-sibling::ul [@class = 'dropdown-menu dropdown-menu-right']/li[5]/child::a[1]")).click();
		boolean checkMessage = driver.findElement(By.xpath("//div [@id = 'content']/child::h1[1]")).isDisplayed();
		
		if (checkMessage == true ) {
			System.out.println("Excellent Work");
			
		}
		else {

			System.out.println("Nope not Correct URL ");
			
		}
	
	}
	@AfterMethod
	public void quitWebBrowser() {
		
		driver.quit();
		
	}
	
}
