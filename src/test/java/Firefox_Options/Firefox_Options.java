package Firefox_Options;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.ProfilesIni;

public class Firefox_Options {
	
	public static WebDriver driver;

	public static void main(String[] args) {
		
		//Firefox Profile
		
		//Step1 - Close the firefox from Exit Menu
		//Step2 - Windows+R and type firefox.exe -p profilemanager
		//Step3 - Create a profile and to remember create certain bookmarks
		
		FirefoxOptions options = new FirefoxOptions();
		ProfilesIni profiles = new ProfilesIni();
		FirefoxProfile profile = profiles.getProfile("CanadaAutomationBatch");
		options.setProfile(profile);
		
		//PageLoadStrategy - speed at which you want the code to execute
		//options.setPageLoadStrategy(PageLoadStrategy.NONE); //slow
		options.setPageLoadStrategy(PageLoadStrategy.EAGER); //very fast
		//options.setPageLoadStrategy(PageLoadStrategy.NORMAL); //fast
		
		//Notifications
		profile.setPreference("dom.webnotifications.enabled", false);
		
		//Proxy Servers
		
		//Certificates
		profile.setAcceptUntrustedCertificates(true);
		profile.setAssumeUntrustedCertificateIssuer(false);
		
		driver = new FirefoxDriver(options);
		driver.get("https://tutorialsninja.com/demo/");
		options.addArguments("--start-maximized");

	}

}