package Rough_Work;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Rough_Work  {
		public WebDriver driver;
		public static WebDriverWait wait; 

		@Test 
		public void FbLogin(){
			
		WebDriver driver = new ChromeDriver(); 
		driver.get("https://www.facebook.com/");
		WebElement element1 = driver.findElement(By.id("email"));
		WebElement element2 = driver.findElement(By.id("pass"));
		WebElement element3 = driver.findElement(By.name("login"));		
		Methods method = new Methods();
	
		method.sendKeys1(driver,10,element1,"Tom");
		method.sendKeys1(driver,10,element2,"Spark");
		method.clickOn(element3, 10, driver);
		WebElement element4 = driver.findElement(By.xpath("//a[text() ='Find your account and log in.']"));
		method.assertTest(driver, 10, element4);
		
		
}
	
	
}
