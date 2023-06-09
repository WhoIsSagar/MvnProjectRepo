package com.tutorialsNinja;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest {

	public WebDriver driver;
	public Actions actions;
	
	@BeforeMethod
	public void BeforeSuit() {
		driver = new ChromeDriver();
		driver.get("https://tutorialsninja.com/demo/");

	}
	@Test
	public void LoginWithCorrectCredentials() {
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.id("input-email")).sendKeys("sagarhanjhra97@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("Selenium@123");
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		Assert.assertTrue(driver.findElement(By.linkText("Logout")).isDisplayed());
		
		actions = new Actions(driver);
		actions.moveToElement(driver.findElement(By.linkText("Laptops & Notebooks"))).perform();
		actions.moveToElement(driver.findElement(By.linkText("Show AllLaptops & Notebooks"))).click().perform();
		
		WebElement hpLaptop =  driver.findElement(By.linkText("HP LP3065"));
		if (hpLaptop.isDisplayed()) {
			hpLaptop.click();
			
		}
		
		else {
			System.out.println("Item not displayed");
		}
		
		//driver.findElement(By.cssSelector("input#input-option225")).sendKeys("2011-04-22");
		driver.findElement(By.cssSelector("button#button-cart")).click();
		driver.findElement(By.linkText("Shopping Cart")).click();
		driver.findElement(By.xpath("//input [@name = 'quantity[21554]']")).clear();
		driver.findElement(By.xpath("//input [@name = 'quantity[21554]']")).sendKeys("2");
		driver.findElement(By.linkText("Checkout")).click();
		driver.findElement(By.id("input-payment-firstname")).sendKeys("Sagar");
		driver.findElement(By.id("input-payment-lastname")).sendKeys("Hanjhra");
		driver.findElement(By.id("input-payment-address-1")).sendKeys("277 Ebury");
		driver.findElement(By.id("input-payment-city")).sendKeys("Brampton");
		driver.findElement(By.id("input-payment-postcode")).sendKeys("L6X5J7");
		
		Select select = new Select(driver.findElement(By.id("input-payment-country"))); 
		select.selectByVisibleText("Canada");
		Select select1 = new Select(driver.findElement(By.id("input-payment-zone")));
		select1.selectByVisibleText("Ontario");
		
		driver.findElement(By.id("button-payment-address")).click();
		


		
		
		
		
	
		
	}
}
