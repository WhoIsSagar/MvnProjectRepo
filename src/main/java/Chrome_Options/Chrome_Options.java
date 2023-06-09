package Chrome_Options;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Chrome_Options {

	public static WebDriver driver;
	
	public static void main(String args) {
		ChromeOptions options = new ChromeOptions();
		
		
		WebDriver driver = new ChromeDriver(options);
		
		driver.manage().window().maximize();
		//pageLoad
		
		options.setPageLoadStrategy(PageLoadStrategy.EAGER);
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.findElement(By.id("login1")).sendKeys("seleniumpanda@rediffmail.com");
		driver.findElement(By.id("password")).sendKeys("Selenium@123");
		

		
		
	}
}