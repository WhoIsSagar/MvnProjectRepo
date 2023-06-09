package Like4Like;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Inst_Account_Creation {

	
	
	@Test
	public void AccountCreation() throws InterruptedException {

	WebDriver driver = new ChromeDriver();
	
	
	driver.manage().window().maximize();
	
	for (int i = 0; i<= 10; i++ ) {
	driver.get("https://uroid.com/");
	TimeUnit.SECONDS.sleep(2);
	Actions a = new Actions(driver);
	driver.findElement(By.xpath("//input [@class = 'adres-input']")).click();
	TimeUnit.SECONDS.sleep(2);
	a.keyDown(Keys.META).sendKeys("c");
	TimeUnit.SECONDS.sleep(2);
	a.keyUp(Keys.META).build().perform();
	TimeUnit.SECONDS.sleep(2);
	driver.get("https://www.instagram.com/accounts/emailsignup/");
	TimeUnit.SECONDS.sleep(2);
	driver.findElement(By.xpath("//input [@name = 'emailOrPhone']")).click();
	a.keyDown(Keys.META).sendKeys("v");
	TimeUnit.SECONDS.sleep(2);
	a.keyUp(Keys.META).build().perform();
	TimeUnit.SECONDS.sleep(2);
	driver.findElement(By.xpath("//input [@name = 'fullName']")).sendKeys("Ghuman Singh" + i);
	TimeUnit.SECONDS.sleep(2);
	driver.findElement(By.xpath("//input [@name = 'username']")).sendKeys("Ghuman_Singh"+i);
	TimeUnit.SECONDS.sleep(2);
	driver.findElement(By.xpath("//input [@name = 'password']")).sendKeys("Brampton1@");
	
	
	

	}
	
	
	
	}
	
	
}
