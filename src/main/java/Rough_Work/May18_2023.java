package Rough_Work;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class May18_2023 {
		
	public static WebDriver driver; 
	public static WebDriverWait wait;
	public static void main(String[] args) {
		

		driver = new ChromeDriver();
		driver.get("https://facebook.com");
		driver.findElement(By.cssSelector("._6ltg>a")).click();
		
		Select select = new Select(driver.findElement(By.id("month")));
		select.selectByVisibleText("Mar");
		
	}

}