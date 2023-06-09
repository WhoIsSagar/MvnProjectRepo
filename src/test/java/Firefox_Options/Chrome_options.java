package Firefox_Options;

import java.util.Arrays;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Chrome_options {
	
	public static WebDriver driver;
	public static ChromeOptions options;

	public static void main(String[] args) {
		options = new ChromeOptions();
		
		//pageloadstrategy
		options.setPageLoadStrategy(PageLoadStrategy.EAGER);
		
		//open browser in a maximized state
		options.addArguments("--start-maximized");
		
		//open in incognito mode
		options.addArguments("incognito");
		
		//remove Chrome is being controlled by Automated Software
		options.setExperimentalOption("excludeSwitches", Arrays.asList("enable-automation", "disable-infobars"));

		driver = new ChromeDriver(options);
		driver.get("https://rediff.com");

	}
}